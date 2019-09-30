package no.rosvik.tdt4250.converter.util;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import javax.script.*;

import no.rosvik.tdt4250.converter.api.Unit;
import no.rosvik.tdt4250.converter.api.UnitSearchResult;

@Component(
		configurationPid = UnitsConvert.FACTORY_PID,
		configurationPolicy = ConfigurationPolicy.REQUIRE
		)
public class UnitsConvert implements Unit {
	
	public static final String FACTORY_PID = "tdt4250.unit.util.UnitsConvert";
	
	public static final String UNIT_NAME_PROP = "unitName";
	public static final String UNIT_CONVERSION_PROP = "unitConversion";
	

	private String name;
	private String conversion;
	
	@Override
	public String getUnitName() {
		return name;
	}

	protected void setUnitName(String name) {
		this.name = name;
	}
	
	public @interface UnitsConvertConfig {
		String unitName();
		String unitConversion() default "";
	}
	
	@Activate
	public void activate(BundleContext bc, UnitsConvertConfig config) {
		update(bc, config);
	}

	@Modified
	public void modify(BundleContext bc, UnitsConvertConfig config) {
		update(bc, config);		
	}
	
	protected void update(BundleContext bc, UnitsConvertConfig config) {
		setUnitName(config.unitName());
		setUnitConversion(config.unitConversion());
	}

	public UnitSearchResult convert(String query) {

		Double numb = Double.parseDouble(query);

		String res = "";
		Map<String, Object> oMap = new HashMap<String, Object>();
		
		try {
			oMap.put("q", Double.parseDouble(query));
			ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
			res = String.format("%.2f", scriptEngine.eval(conversion, new SimpleBindings(oMap)));
		} catch (Exception e) {
			if (e instanceof ScriptException) {
				String msg = String.format(getFailureMessageStringFormat(), conversion);
				return new UnitSearchResult(false, msg, null);
			} else if (e instanceof NumberFormatException) {
				String msg = String.format(getFailureMessageStringFormat(), conversion);
				return new UnitSearchResult(false, msg, null);
			}	
		} 
		return new UnitSearchResult(true, String.format(getSuccessMessageStringFormat(), numb, res, getUnitName()), null);
	}
	
	protected String getSuccessMessageStringFormat() {
		return "%.2f -> %s [%s]";
	}

	protected String getFailureMessageStringFormat() {
		return "There was an error while parsing '%s'.";
	}
	
	@Override
	public String getUnitConversion() {
		return conversion;
	}
	
	protected void setUnitConversion(String conversion) {
		this.conversion = conversion;
	}
}
