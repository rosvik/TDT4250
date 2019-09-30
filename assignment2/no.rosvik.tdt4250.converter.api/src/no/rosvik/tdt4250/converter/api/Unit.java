package no.rosvik.tdt4250.converter.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Unit {
	String getUnitName();
	String getUnitConversion();
	UnitSearchResult convert(String convertNumber);
}
