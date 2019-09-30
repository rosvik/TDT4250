package no.rosvik.tdt4250.converter.poundtokilo;

import org.osgi.service.component.annotations.Component;

import no.rosvik.tdt4250.converter.api.Unit;
import no.rosvik.tdt4250.converter.util.UnitsConvert;

@Component(
		property = {
				UnitsConvert.UNIT_NAME_PROP + "=poundtokilo",
				UnitsConvert.UNIT_CONVERSION_PROP + "=q*0.453592"}
		)
public class PoundToKilo extends UnitsConvert implements Unit {
}
