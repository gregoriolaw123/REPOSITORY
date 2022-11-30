package com.msClientes2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msClientes2.impl.Clientes2Implement;
import com.persistence.Request.Clientes2Request;


import com.persistence.entity.Clientes2;


@RestController
@RequestMapping("/cliente_2")



public class Clientes2Controller {
	
	
	
	@Autowired
	Clientes2Implement impl;

	//http://localhost:8090/Clinetes2/mostrar-todos/ 
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Clientes2>> listar(){ 
	 List<Clientes2> list  = impl.listar();
	 return new ResponseEntity<List<Clientes2>>(list, HttpStatus.OK); 
	} 
	 
	//http://localhost:8090/Productos/buscar-por-id/ 
	@GetMapping("buscar-por-id/{id}") 
	public ResponseEntity<Clientes2> buscar(@PathVariable int id){ 
	 Clientes2 c = impl.buscar(id);    
	 return new ResponseEntity<Clientes2>( c, HttpStatus.OK); 
	} 

	@GetMapping("buscar-por-nombre/{nombre}") 
	public ResponseEntity<Clientes2> buscarPornombre(@PathVariable String nombre){ 
		Clientes2 c = impl.buscar(nombre);    
	 return new ResponseEntity<Clientes2>( c, HttpStatus.OK); 
	} 








	//http://localhost:8090/Productos/guardar 
	@PostMapping("guardar") 
	public ResponseEntity<Clientes2> guardar(@RequestBody Clientes2Request req) { 
		Clientes2 c = impl.guardar(req); 
	 return new ResponseEntity<Clientes2>( c,HttpStatus.OK); 
	} 
	//http://localhost:8090/producto/actualizar 
	@PutMapping("actualizar") 
	public ResponseEntity<Clientes2> actualizar(@RequestBody Clientes2Request req) { 
		Clientes2 c = impl.actualizar(req); 
	 return new ResponseEntity<Clientes2>( c,HttpStatus.OK); 
	}  
	//http://localhost:8090/Cliente/eliminar/1 
	@DeleteMapping("eliminar/{id}") 
	public ResponseEntity<String> eliminar(@PathVariable int id){ 
	 String mensaje = impl.eliminar(id); 
	 return new ResponseEntity<String>(mensaje, HttpStatus.OK); 
	}


}//
