package ma.coredumped.smwalkweb.categories.repositories.mappers;

import ma.coredumped.smwalkweb.categories.repositories.entities.CategorieEntity;
import ma.coredumped.smwalkweb.categories.services.model.Categorie;
import org.mapstruct.Mapper;

@Mapper
public interface CategorieEntityMapper {

    Categorie toModel(CategorieEntity categorieEntity);

    CategorieEntity toEntity(Categorie categorie);
}
