package tacos;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tacos.data.IngredientRepository;
import tacos.domain.Ingredient;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

	@Bean
	public ApplicationRunner dataLoader(IngredientRepository ingredientRepository){
		return args -> {
			ingredientRepository.save(new Ingredient("FLT2", "Flour Tortilla 2", Ingredient.Type.WRAP));
		};
	}
}
