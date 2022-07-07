package ma.coredumped.smwalkweb.categories.repositories;

import ma.coredumped.smwalkweb.categories.repositories.entities.CategorieEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SpringCategoryRepository extends CrudRepository<CategorieEntity, UUID> {

}
