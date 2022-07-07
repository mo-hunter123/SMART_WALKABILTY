package ma.coredumped.smwalkweb.categories.services;

import ma.coredumped.smwalkweb.categories.services.model.Categorie;

import java.util.UUID;

public interface CategoriesService {
    Categorie findById(UUID id);
}
