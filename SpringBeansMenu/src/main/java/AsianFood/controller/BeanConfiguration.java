package AsianFood.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import AsianFood.beans.Details;
import AsianFood.beans.Menu;

@Configuration
public class BeanConfiguration {
	@Bean
	public Menu menu() {
		Menu bean = new Menu();
		bean.setName("Fried Rice");
		bean.setCategory("Rice Dishes");
		bean.setPrice(11.5);
		return bean;
	}
	@Bean
	public Details details() {
		Details bean = new Details("peanut", 3);
		return bean;
	}
}
