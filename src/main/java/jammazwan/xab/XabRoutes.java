package jammazwan.xab;

import org.apache.camel.builder.RouteBuilder;

public class XabRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:../jammazwan.shared/src/main/resources/data/?noop=true&fileName=city.csv")
				.unmarshal("cityDataFormat").split(body()).to("jpa:jammazwan.entity.City");

		from("file:../jammazwan.shared/src/main/resources/data/?noop=true&fileName=company.csv")
				.unmarshal("companyDataFormat").split(body()).to("jpa:jammazwan.entity.Company");

		from("file:../jammazwan.shared/src/main/resources/data/?noop=true&fileName=surname.txt")
				.unmarshal("surnameDataFormat").split(body()).to("jpa:jammazwan.entity.Surname");

		from("file:../jammazwan.shared/src/main/resources/data/?noop=true&fileName=name.csv")
				.unmarshal("nameDataFormat").split(body()).to("jpa:jammazwan.entity.Name");

		from("file:../jammazwan.shared/src/main/resources/data/factbook_csv/?noop=true&fileName=category.csv")
				.unmarshal("countryCategoryDataFormat").split(body()).to("jpa:jammazwan.entity.CountryCategory");

		from("file:../jammazwan.shared/src/main/resources/data/factbook_csv/?noop=true&fileName=code.csv")
				.unmarshal("countryCodeDataFormat").split(body()).to("jpa:jammazwan.entity.CountryCode");
	}
}
