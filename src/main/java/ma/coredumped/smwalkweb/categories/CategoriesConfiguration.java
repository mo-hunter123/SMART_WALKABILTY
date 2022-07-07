package ma.coredumped.smwalkweb.categories;

import ma.coredumped.smwalkweb.categories.controllers.mappers.CategoriesDTOMapper;
import ma.coredumped.smwalkweb.categories.repositories.CategoriesRepository;
import ma.coredumped.smwalkweb.categories.repositories.CategoriesRepositoryImpl;
import ma.coredumped.smwalkweb.categories.repositories.SpringCategoryRepository;
import ma.coredumped.smwalkweb.categories.repositories.mappers.CategorieEntityMapper;
import ma.coredumped.smwalkweb.categories.services.CategoriesService;
import ma.coredumped.smwalkweb.categories.services.CategoriesServiceImpl;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoriesConfiguration {

    @Bean
    public CategoriesRepository categoriesRepository(CategorieEntityMapper categorieEntityMapper, SpringCategoryRepository springCategoryRepository)
    {
        return new CategoriesRepositoryImpl(springCategoryRepository, categorieEntityMapper);
    }
    @Bean
    public CategoriesService categoriesService(CategoriesRepository categoriesRepository)
    {
        return new CategoriesServiceImpl(categoriesRepository);
    }

    @Bean
    public CategorieEntityMapper categorieEntityMapper()
    {
        return Mappers.getMapper(CategorieEntityMapper.class);
    }

    @Bean
    public CategoriesDTOMapper categoriesDTOMapper()
    {
        return  Mappers.getMapper(CategoriesDTOMapper.class);
    }
}
