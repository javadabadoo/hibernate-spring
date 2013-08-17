package doo.daba.java.pruebas.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Gerardo Aquino
 * Date: 16/08/13
 */
@Entity
@Table(name = "usuario")
public class User {

    @Id
    @Getter @Setter
    private int id;


    @Getter @Setter
    private String
        nombre,
        apellidos,
        correo,
        alias,
        contrasena;

    @Column(name = "fecha_de_registro")
    @Getter @Setter
    private Date fechaDeRegistro;

}
