package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.DepartamentoDAO;
import com.distribuida.entities.Departamento;

public class PrincipalDepartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			//Patron IoC Inversion de Control 
					
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				DepartamentoDAO DepartamentoDAO = context.getBean("departamentoDAOImpl",DepartamentoDAO.class);
				
				
				List<Departamento> departamentos = DepartamentoDAO.findAll();
				
				departamentos.forEach(item -> {
					System.out.println(item.toString());
				});
				
				context.close();

	}

}
