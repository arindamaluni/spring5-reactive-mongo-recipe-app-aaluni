package aaluni.springframework.repositories.reactive;

import aaluni.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
