package com.moliere35informatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moliere35informatica.model.Cliente;
import com.moliere35informatica.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins ="*") //Permite peticiones desde Angular

public class ClienteControler {
	
	/*
	 * Un controlador en Spring Boot es una clase que define los endpoints HTTP
	 * (como /api/clientes) que tu aplicación expone. 
	 *  Es donde recibes peticiones del cliente (GET, POST, PUT, DELETE) y decides qué hacer con ellas.
	 */


	
	 @Autowired
	    private ClienteRepository clienteRepository;

	    // GET: Obtener todos los clientes
	    @GetMapping
	    
	    public List<Cliente> getAllClientes() {
	        try {
				return clienteRepository.findAll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	    }

	    // POST: Crear un nuevo cliente
	    
	    @PostMapping
	    public Cliente createCliente(@RequestBody Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

	    // GET: Obtener cliente por ID
	    
	    @GetMapping("/{id}")
	    public Cliente getClienteById(@PathVariable Long id) {
	        return clienteRepository.findById(id).orElse(null);
	    }

	    // PUT: Actualizar cliente
	    
	    @PutMapping("/{id}")
	    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
	        Cliente cliente = clienteRepository.findById(id).orElse(null);
	        if (cliente != null) {
	            cliente.setNombre(clienteDetails.getNombre());
	            cliente.setPrimerApellido(clienteDetails.getPrimerApellido());
	            cliente.setSegundoApellido(clienteDetails.getSegundoApellido());
	            cliente.setEmail(clienteDetails.getEmail());
	            cliente.setTelefono(clienteDetails.getTelefono());
	            return clienteRepository.save(cliente);
	        }
	        return null;
	    }

	    // DELETE: Eliminar cliente
	    
	    @DeleteMapping("/{id}")
	    public void deleteCliente(@PathVariable Long id) {
	        clienteRepository.deleteById(id);
	    }

}
