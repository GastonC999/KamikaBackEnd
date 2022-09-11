package model;

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
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "Apellido")
    String apellido;

    @Column(name = "email")
    String email;

    @Column(name = "teléfono")
    String teléfono;

    @Column(name = "Username")
    String username;

    @Column(name = "password")
    String password;
}