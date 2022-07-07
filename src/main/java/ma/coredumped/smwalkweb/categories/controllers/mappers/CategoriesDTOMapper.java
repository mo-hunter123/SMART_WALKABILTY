package ma.coredumped.smwalkweb.categories.controllers.mappers;


import ma.coredumped.smwalkweb.categories.controllers.dto.CategorieDTO;
import ma.coredumped.smwalkweb.categories.services.model.Categorie;
import org.mapstruct.Mapper;

@Mapper
public interface CategoriesDTOMapper {
    CategorieDTO toDTO(Categorie categorie);
    Categorie toModel(CategorieDTO categorieDTO);
}
