package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.distribuida.entities.Empleado;

public class EmpleadoDAOImpl {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from empleado",Empleado.class).getResultList();
	}

	@Override
	public Empleado findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Empleado Empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}
}
