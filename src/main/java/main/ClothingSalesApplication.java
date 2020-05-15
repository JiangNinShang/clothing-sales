package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("main.dao")
public class ClothingSalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClothingSalesApplication.class, args);
	}
}
