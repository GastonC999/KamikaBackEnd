
package com.escuela.kamikaspringboot.modelo;


        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.Setter;
        import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TrabajoPe")
public class TrabajosPe {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;

        @Column (name ="Nombre del Servicio")
        String nombreServicio;

        @Column (name = "Descripcion Del Servicio")
        String descripcionServ;

        @Column (name = "Precio")
        double precio;

        @Column (name = "Tiempo Estimado")
        String tiempoEstimado;

}
