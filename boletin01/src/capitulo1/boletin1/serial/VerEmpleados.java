package capitulo1.boletin1.serial;

import java.util.ArrayList;

import capitulo1.boletin1.clases.Departamento;
import capitulo1.boletin1.clases.Empleado;
import capitulo1.boletin1.dao.CheckIntegridad;
import capitulo1.boletin1.dao.DepartamentoDao;
import capitulo1.boletin1.dao.EmpleadoDao;
import capitulo1.boletin1.dao.ListaEmpleados;

public class VerEmpleados {
	private static ArrayList<Empleado>empleadosNuevos=new ArrayList<Empleado>();
	private static ArrayList<Departamento>departamentosNuevos=new ArrayList<Departamento>();
	private static EmpleadoDao eDao=new EmpleadoDao();
	private static DepartamentoDao dDao=new DepartamentoDao();
	
	
	public static void main(String[] args){
		String departamento;
		
		if (args.length==0){
			departamento="004";
		} else {
			departamento=args[0];
		}
		
		empleadosNuevos=(ArrayList<Empleado>) eDao.readAll("empleados.ser");
		departamentosNuevos=(ArrayList<Departamento>) dDao.readAll("departamentos.dep");
		ListaEmpleados lista=new ListaEmpleados(departamentosNuevos,empleadosNuevos);
		lista.imprimeLista(departamento);
		CheckIntegridad integridad=new CheckIntegridad(departamentosNuevos,empleadosNuevos);
		System.out.println("\nComprobando integridad.");
		if (integridad.getIntegridad()){
			System.out.println("Integridad de datos correcta");
		} else {
			System.out.println("Error en integridad de datos!!!");
		}
	}
}
