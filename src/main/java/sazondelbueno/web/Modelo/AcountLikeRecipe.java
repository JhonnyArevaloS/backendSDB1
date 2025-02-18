package sazondelbueno.web.Modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="acount_like_recipe")
public class AcountLikeRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_acount",nullable = false)
    private Long idAcount;

    @Column(name = "id_recipe",nullable = false)
    private Long idRecipe;



}
