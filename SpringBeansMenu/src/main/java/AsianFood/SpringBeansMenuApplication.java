package AsianFood;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import AsianFood.beans.Details;
import AsianFood.beans.Menu;
import AsianFood.controller.BeanConfiguration;
import AsianFood.repository.MenuRepository;

@SpringBootApplication
public class SpringBeansMenuApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansMenuApplication.class, args);
	}

	@Autowired
	MenuRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Menu c = appContext.getBean("menu", Menu.class);
		c.setCategory("Entree");
		repo.save(c);

		Menu d = new Menu("Wonton Soup", "Soup", 10.8);
		Details dd = new Details("N/A");
		d.setDetails(dd);
		repo.save(d);

		List<Menu> allMyMenus = repo.findAll();
		for (Menu dishes : allMyMenus) {
			System.out.println(dishes.toString());
		}
	}
}
