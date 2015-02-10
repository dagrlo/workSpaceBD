package capitulo1.boletin1.serial;

import java.util.ArrayList;
import java.util.Collection;

import capitulo1.boletin1.clases.Departamento;
import capitulo1.boletin1.clases.Empleado;
import capitulo1.boletin1.dao.DepartamentoDao;
import capitulo1.boletin1.dao.EmpleadoDao;

public class MultiSerialReader {

	private static ArrayList<Empleado>empleadosNuevos=new ArrayList<Empleado>();
	private static ArrayList<Departamento>departamentosNuevos=new ArrayList<Departamento>();
	private static EmpleadoDao eDao=new EmpleadoDao();
	private static DepartamentoDao dDao=new DepartamentoDao();
	
	public static void main(String[] args){			
		empleadosNuevos=(ArrayList<Empleado>) eDao.readAll("empleados.ser");
		departamentosNuevos=(ArrayList<Departamento>) dDao.readAll("departamentos.dep");
		System.out.println("Empleados:");
		System.out.println("==========");
		
		for (Empleado empleado:empleadosNuevos){
			System.out.println("Empleado ["+empleado.getIdEmpleado()+"]: "+empleado.getNombre()+" "+empleado.getApellidos());
			System.out.println("Departamento: "+empleado.getDepartamento());
			System.out.println("Antiguedad: "+empleado.getFechaContrato().toString());
			System.out.println("Puesto: "+empleado.getPuesto());
			System.out.println("Nivel de educacion: "+empleado.getNivelEducacion());
			System.out.println("Sueldo: "+empleado.getSueldo());
			System.out.println("Complemento: "+empleado.getComplemento()+"\n-----------\n");
		}
		
		System.out.println("\nDepartamentos:");
		System.out.println("=============\n");
		
		for (Departamento departamento:departamentosNuevos){
			System.out.println("Id: "+departamento.getIdDepartamento());
			System.out.println("Nombre: "+departamento.getNombre());
			System.out.println("Manager: "+departamento.getManager()+"\n");
		}
		
	}
}
