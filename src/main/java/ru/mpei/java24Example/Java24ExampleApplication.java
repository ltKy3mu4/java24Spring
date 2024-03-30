package ru.mpei.java24Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import ru.mpei.java24Example.model.Car;
import ru.mpei.java24Example.service.ConfigState;

@SpringBootApplication
public class Java24ExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Java24ExampleApplication.class, args);
//		ConfigState bean = run.getBean(ConfigState.class);
//		bean.readCfg("src/main/resources/iniCfg.json");
//		System.out.println(bean.getData());


	}

}
