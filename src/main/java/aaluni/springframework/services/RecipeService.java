package aaluni.springframework.services;

import java.util.Set;

import aaluni.springframework.commands.RecipeCommand;
import aaluni.springframework.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
