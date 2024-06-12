package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Empleado;

public interface EmpleadoDAO {
	//Crud Basico
	
			public List<Empleado> findAll();
			
			public Empleado findOne(int id);
			
			public void add(Empleado empleado);
			
			public void up(Empleado empleado);
			
			public void del(int id);
			
			// CRUD avanzados 


	}



