package config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 // 开启swagger2
public class SwaggerConfig {

	// swagger文档配置
	@Bean
	public Docket docketAll(Environment environment) {

		// 设置显示swagger的运行环境
		Profiles profiles = Profiles.of("dev");

		// 判断是否处在设定运行环境中
		boolean flag = environment.acceptsProfiles(profiles);

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("All")
				.enable(flag)	// enable是否启动swagger
				.select()
				// RequestHandlerSelectors扫描接口的方式
				.apis(RequestHandlerSelectors.basePackage("com.newer.web.controller"))
				.build();
	}
	
	@Bean
	public Docket docketSill(Environment environment) {
		Profiles profiles = Profiles.of("dev");
		boolean flag = environment.acceptsProfiles(profiles);

		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("刘尚")
				.enable(flag)	// enable是否启动swagger
				.select()
				// RequestHandlerSelectors扫描接口的方式
				.apis(RequestHandlerSelectors.basePackage("com.newer.web.controller.sill"))
				.build();
	}
	
	@Bean
	public Docket docketClerk(Environment environment) {
		Profiles profiles = Profiles.of("dev");
		boolean flag = environment.acceptsProfiles(profiles);

		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("张健")
				.enable(flag)	// enable是否启动swagger
				.select()
				// RequestHandlerSelectors扫描接口的方式
				.apis(RequestHandlerSelectors.basePackage("com.newer.web.controller.clerk"))
				.build();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ApiInfo apiInfo() {
		String title = "壹心销售管理系统接口文档";
		String description = "壹心销售管理系统为交易活动提供一个方便的电子平台。";
		String version = "1.0";
		String termsOfServiceUrl = "urn:tos";
		Contact contact = new Contact("Sill-sketch", "https://github.com/Sill-sketch/clothing-sales", "");
		String license = "Apache 2.0";
		String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

		return new ApiInfo(title, description, version, termsOfServiceUrl, contact, license, licenseUrl, new ArrayList());
	}

}
