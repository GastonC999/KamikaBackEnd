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
@Table (name = "Persona")
public class Persona {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     long id;

    @Column (name ="Nombre")
     String nombre;

    @Column (name = "Apellido")
     String apellido;

    @Column (name = "Email")
     String email;

    @Column (name = "Telefono")
     int telefono;

    @Column (name = "Usuario")
     String username;

    @Column (name = "Contraseña")
     String password;




}
