package ma.coredumped.smwalkweb.categories.controllers;


import lombok.extern.log4j.Log4j2;
import ma.coredumped.smwalkweb.categories.controllers.dto.CategorieDTO;
import ma.coredumped.smwalkweb.categories.controllers.mappers.CategoriesDTOMapper;
import ma.coredumped.smwalkweb.categories.services.CategoriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequestMapping("/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;
    private final CategoriesDTOMapper categoriesDTOMapper;

    public CategoriesController(final CategoriesService categoriesService, final CategoriesDTOMapper categoriesDTOMapper)
    {
        this.categoriesDTOMapper = categoriesDTOMapper;
        this.categoriesService = categoriesService;
    }

    @GetMapping("/{id}")
    public CategorieDTO getById(@PathVariable UUID id) {
        log.info("GET : /categories/"+id+" : Getting categorie by ID");
        return categoriesDTOMapper.toDTO(categoriesService.findById(id));
    }

}
