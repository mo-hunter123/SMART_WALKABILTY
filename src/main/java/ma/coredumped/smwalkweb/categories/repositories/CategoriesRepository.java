package ma.coredumped.smwalkweb.categories.repositories;

import ma.coredumped.smwalkweb.categories.repositories.entities.CategorieEntity;
import ma.coredumped.smwalkweb.categories.services.model.Categorie;

import java.util.Optional;
import java.util.UUID;

public interface CategoriesRepository {
    Optional<Categorie> findById(UUID id);
}
