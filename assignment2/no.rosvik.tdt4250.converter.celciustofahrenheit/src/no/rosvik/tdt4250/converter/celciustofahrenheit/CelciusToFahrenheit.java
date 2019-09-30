package no.rosvik.tdt4250.converter.celciustofahrenheit;

import org.osgi.service.component.annotations.Component;

import no.rosvik.tdt4250.converter.api.Unit;
import no.rosvik.tdt4250.converter.util.UnitsConvert;

@Component(
		property = {
				UnitsConvert.UNIT_NAME_PROP + "=celciustofahrenheit",
				UnitsConvert.UNIT_CONVERSION_PROP + "=q*1.8+32"}
		)
public class CelciusToFahrenheit extends UnitsConvert implements Unit {
}
