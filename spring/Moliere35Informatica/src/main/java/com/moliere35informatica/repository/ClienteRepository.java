package com.moliere35informatica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moliere35informatica.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	//Métodos que incluye JpaRepository
	/*
	 *  findAll()
	 *  findById(id)
	 *  save(cliente)
	 *	deleteById(id)
	 *  
	 *  */
	
	
	
	/*
	 * 
	 Métodos interesantes que podría crear
	 
	 
	 Buscar por email exacto
	 Optional<Cliente> findByEmail(String email);

	 Buscar por nombre
	List<Cliente> findByNombre(String nombre);

	 Buscar por nombre y primer apellido
	 List<Cliente> findByNombreAndPrimerApellido(String nombre, String primerApellido);

	 Buscar clientes cuyo email contenga cierto texto
	 List<Cliente> findByEmailContaining(String fragmento);

	 Buscar por teléfono
	 List<Cliente> findByTelefono(String telefono);
	 
	 */


}

