package com.moliere35informatica.model;

import jakarta.persistence.*;

//Con @Entity le decimos a Spring que es una clase correspondiente a una tabla de la base de datos
//indica que esta clase es una entidad JPA.

//@Table mapea la clase a la tabla clientes.

@Entity
@Table(name = "clientes")
public class Cliente {
	
	//Generamos la primarykey con el @Id y el @GenerateValue

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //Generamos todos los atributos que corresponden a los registros de la BBDD
    private Long id;

    private String nombre;
    
    //Los @column nos indica variaciones o especificaciones de los registros de la BBDD
    
    //En estos caso el atributo se llama en Spring primerApellido y en la BBDD en la tabla Cliente, el registro se llama primer_apellio

    @Column(name = "primer_apellido")
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;

    
    @Column(unique = true)
    private String email;

    private String telefono;

    // Constructores
    
    public Cliente() {}

    
    //Creamos un constructor completo menos con el Id que se gernera de manera automática.
    
   
    
    public Cliente(String nombre, String primerApellido, String segundoApellido, String email, String telefono) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrimerApellido() { return primerApellido; }
    public void setPrimerApellido(String primerApellido) { this.primerApellido = primerApellido; }

    public String getSegundoApellido() { return segundoApellido; }
    public void setSegundoApellido(String segundoApellido) { this.segundoApellido = segundoApellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    
    //Método toString por si tengo que ver algo por la terminal

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido="
				+ segundoApellido + ", email=" + email + ", telefono=" + telefono + "]";
	}
    
   
    
    
}
