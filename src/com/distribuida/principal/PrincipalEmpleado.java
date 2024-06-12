package com.distribuida.principal;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpleadoDAO;
import com.distribuida.entities.Empleado;

public class PrincipalEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				//Patron IoC Inversion de Control 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmpleadoDAO empleadoDAO = context.getBean("EmpleadoDAOImpl",EmpleadoDAO.class);
		
		
		List<Empleado> empleados = empleadoDAO.findAll();
		
		empleados.forEach(item -> {
			System.out.println(item.toString());
		});
		
		context.close();

	}

}
