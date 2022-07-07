package ma.coredumped.smwalkweb.categories.services;

import ma.coredumped.smwalkweb.categories.repositories.CategoriesRepository;
import ma.coredumped.smwalkweb.categories.services.model.Categorie;

import java.util.UUID;

public class CategoriesServiceImpl implements CategoriesService{

    private final CategoriesRepository categoriesRepository;

    public CategoriesServiceImpl(CategoriesRepository categoriesRepository){
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public Categorie findById(UUID id) {
        return categoriesRepository.findById(id).orElseThrow(() -> new RuntimeException("Categorie not found"));
    }
}
