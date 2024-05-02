package sazondelbueno.web.Modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="recetas")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_acount",nullable = false)
    private Long id_acount;

    @Column(name= "name", length = 40,nullable = false)
    private String name;

    @Column(name= "image")
    private String image;

    @Column(name= "time",nullable = false)
    private String time;

    @Column(name= "ingredients",nullable = false)
    private String ingredients;

    @Column(name= "preparation",nullable = false)
    private String preparation;

    @Column(name= "id_difficulty",nullable = false)
    private Long id_difficulty;

    @Column(name= "id_category",nullable = false)
    private Long id_category;

}
