package ma.coredumped.smwalkweb.categories.repositories.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class CategorieEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @PrimaryKeyJoinColumn
    private UUID id;

    @Column(name = "name")
    private String name;

    public CategorieEntity(String name)
    {
        this.name = name;
    }
}
