package capitulo1.boletin1.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import capitulo1.boletin1.clases.Departamento;
import capitulo1.boletin1.clases.Empleado;
import capitulo1.boletin1.dao.DepartamentoDao;
import capitulo1.boletin1.dao.EmpleadoDao;

public class SerialWriter {

	public static void main(String[] args){		
		EmpleadoDao eDao=new EmpleadoDao();
		DepartamentoDao dDao=new DepartamentoDao();
		try{					
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");			
			Empleado empleado=new Empleado("000003","Pablo","Ivars");
			empleado.setDepartamento("E21");
			Date fc=formatter.parse("2006-07-06");
			empleado.setFechaContrato(fc);
			empleado.setPuesto("MGR");
			empleado.setNivelEducacion(7);
			empleado.setSueldo(209920.1);
			empleado.setComplemento(11102.0);
			eDao.save(empleado, "archivo02.ser");
			Departamento departamento=new Departamento("Administrador","E21","Manager","SOPORTE DE SOFTWARE");
			dDao.save(departamento, "dE21.dep");
		} catch (Exception e){
			e.printStackTrace();
		} 				
	}
	
}
