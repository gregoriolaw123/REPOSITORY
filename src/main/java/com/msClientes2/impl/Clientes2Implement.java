package com.msClientes2.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msClientes2.service.IClientes2Service;
import com.persistence.Repository.IClientes2Repository;
import com.persistence.Request.Clientes2Request;
import com.persistence.entity.Clientes2;
@Service
public class Clientes2Implement implements IClientes2Service {
	@Autowired
	IClientes2Repository dao;


	@Override
	public Clientes2 guardar(Clientes2Request request) {
		Clientes2 c = new 	Clientes2();
		c.setNombre(request.getNombre());
		c.setCorreo(request.getCorreo());
		c.setTelef(request.getTelef());
		
		dao.save(c);
	
		return c;
	}

	@Override
	public Clientes2 actualizar(Clientes2Request request) {
		Clientes2 c = dao.findById(request.getCliente_2id()).get();
		c.setNombre(request.getNombre());
		c.setCorreo(request.getCorreo());
		c.setTelef(request.getTelef());
		
		dao.save(c);
		
		
		return c;
	}

	@Override
	public Clientes2 buscar(int id) {
		Clientes2 c = dao.findById(id).get();
		return c;
	}

	@Override
	public Clientes2 buscar(String nombre) {
		Clientes2 c = dao.findByname(nombre);
		
		
		return c;
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);
	
		return "Eliminado";
	}

	@Override
	public List<Clientes2> listar() {
		return dao.findAll();
		
		
	}

}//class
