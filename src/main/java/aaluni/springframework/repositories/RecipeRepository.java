package aaluni.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import aaluni.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
