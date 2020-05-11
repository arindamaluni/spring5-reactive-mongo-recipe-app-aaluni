package aaluni.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import aaluni.springframework.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);
}
