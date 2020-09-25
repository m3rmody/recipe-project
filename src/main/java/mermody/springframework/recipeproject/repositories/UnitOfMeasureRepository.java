package mermody.springframework.recipeproject.repositories;

import mermody.springframework.recipeproject.domain.Category;
import mermody.springframework.recipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
