/**
 * 
 */
package main.config;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 蒋宁善
 *
 */
@Configuration // 配置类
@EnableSwagger2 // 开启Swagger2的自动配置

public class SwaggerConfig {
	// 配置文档信息
	private ApiInfo apiInfo() {
		Contact contact = new Contact("蒋宁善", "http://www.wm2en9.cn/", "ester1753291617@163.com");
		return new ApiInfo("蒋宁善写的", // 标题
				"wdnmd", // 描述
				"v1.0.0", // 版本
				"https://github.com/JiangNinShang/project.git", // 组织链接
				contact, // 联系人信息
				"Apach 2.0 许可", // 许可
				"http://www.apache.org/licenses/LICENSE-2.0", // 许可连接
				new ArrayList<>()// 扩展
		);
	}

	// 配置文档信息
	private ApiInfo apiInfo1() {
		Contact contact = new Contact("张健", "http://123.57.64.120/", "3375677540@qq.com");
		return new ApiInfo("张健写的", // 标题
				"giao", // 描述
				"v1.0.0", // 版本
				"https://github.com/JiangNinShang/project.git", // 组织链接
				contact, // 联系人信息
				"Apach 2.0 许可", // 许可
				"http://www.apache.org/licenses/LICENSE-2.0", // 许可连接
				new ArrayList<>()// 扩展
		);
	}

	@Bean
	public Docket docket(Environment environment) {
		// 设置要显示swagger的环境
		Profiles of = Profiles.of("dev", "test");
		// 判断当前是否处于该环境
		// 通过 enable() 接收此参数判断是否要显示
		boolean b = environment.acceptsProfiles(of);

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.enable(b) // 配置是否启用Swagger，如果是false，在浏览器将无法访问
				.select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
//	      .apis(RequestHandlerSelectors.basePackage("main.controller"))
				// 配置如何通过path过滤,即这里只扫描请求以/kuang开头的接口
//	      .paths(PathSelectors.ant("/kuang/**"))
				.build();
	}

	@Bean
	public Docket docket1(Environment environment) {
		// 设置要显示swagger的环境
		Profiles of = Profiles.of("dev", "test");
		// 判断当前是否处于该环境
		// 通过 enable() 接收此参数判断是否要显示
		boolean b = environment.acceptsProfiles(of);

		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("张健")
				.apiInfo(apiInfo1())
				.enable(b) // 配置是否启用Swagger，如果是false，在浏览器将无法访问
				.select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
//		      .apis(RequestHandlerSelectors.basePackage("main.controller"))
				// 配置如何通过path过滤,即这里只扫描请求以/kuang开头的接口
//		      .paths(PathSelectors.ant("/kuang/**"))
				.build();

	}

//	@ApiOperation("测试的接口")
//	@PostMapping("/kuang")
//	@ResponseBody
//	public String kuang(@ApiParam("这个名字会被返回") String username) {
//		return username;
//	}

}
