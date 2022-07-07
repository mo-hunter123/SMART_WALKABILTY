package ma.coredumped.smwalkweb.categories.services.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categorie {
    private UUID id;
    private String name;
}
