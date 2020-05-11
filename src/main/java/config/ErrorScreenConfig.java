package config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorScreenConfig {

	/**
	 *  * 解决异常信息：  *  java.lang.IllegalArgumentException:  *      Invalid character
	 * found in the request target. The valid characters are defined in RFC 7230 and
	 * RFC 3986  * @return  
	 */
	@Bean
	public ConfigurableServletWebServerFactory webServerFactory() {
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
		factory.addConnectorCustomizers((connector) -> {
			connector.setProperty("relaxedQueryChars", "|{}[]");
		});
		return factory;
	}

}
