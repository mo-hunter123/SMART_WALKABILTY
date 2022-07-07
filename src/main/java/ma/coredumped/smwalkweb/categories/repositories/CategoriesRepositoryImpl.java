package ma.coredumped.smwalkweb.categories.repositories;

import ma.coredumped.smwalkweb.categories.repositories.mappers.CategorieEntityMapper;
import ma.coredumped.smwalkweb.categories.services.model.Categorie;

import java.util.Optional;
import java.util.UUID;

public class CategoriesRepositoryImpl implements CategoriesRepository{

    private final SpringCategoryRepository springCategoryRepository;
    private final CategorieEntityMapper categorieEntityMapper;

    public CategoriesRepositoryImpl(SpringCategoryRepository springCategoryRepository, CategorieEntityMapper categorieEntityMapper) {
        this.springCategoryRepository = springCategoryRepository;
        this.categorieEntityMapper = categorieEntityMapper;
    }


    @Override
    public Optional<Categorie> findById(UUID id) {
        return this.springCategoryRepository.findById(id).map(categorieEntityMapper::toModel);
    }
}
