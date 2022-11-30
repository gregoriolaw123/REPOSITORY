package com.msClientes2.service;

import java.util.List;

import com.persistence.Request.Clientes2Request;

import com.persistence.entity.Clientes2;





public interface IClientes2Service {
	
	List<Clientes2>listar();
	Clientes2 guardar(Clientes2Request request);
	Clientes2 actualizar(Clientes2Request request);
	Clientes2 buscar(int id);
	Clientes2 buscar (String nombre);
	String eliminar (int id);
	


}//class
