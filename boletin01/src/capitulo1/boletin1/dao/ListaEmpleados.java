package capitulo1.boletin1.dao;

import java.util.ArrayList;
import java.util.Collection;

import capitulo1.boletin1.clases.Departamento;
import capitulo1.boletin1.clases.Empleado;


/*
 *  Esta clase se puede probar desde VerEmpleados.java
 * 
 */


public class ListaEmpleados {

	private static ArrayList<Empleado>empleados=new ArrayList<Empleado>();
	private static ArrayList<Departamento>departamentos=new ArrayList<Departamento>();
	private static ArrayList<Empleado>listaEmpleados=new ArrayList<Empleado>();
	
	public ListaEmpleados(Collection<Departamento> departamentos, Collection<Empleado> empleados){
		this.empleados=(ArrayList<Empleado>) empleados;
		this.departamentos=(ArrayList<Departamento>) departamentos;
	}
	
	public void imprimeLista(String idDepartamento){
		String nombre=getNombre(idDepartamento);
		
		if (!nombre.contains("no encontrado")){	
			llenaLista(idDepartamento);
			System.out.println("Departamento: "+nombre);
			System.out.println("\nEmpleados:");
			for (Empleado empleado:listaEmpleados){
				System.out.println("Empleado ["+empleado.getIdEmpleado()+"]: "+empleado.getNombre()+" "+empleado.getApellidos());
				System.out.println("Departamento: "+empleado.getDepartamento());
				System.out.println("Antiguedad: "+empleado.getFechaContrato().toString());
				System.out.println("Puesto: "+empleado.getPuesto());
				System.out.println("Nivel de educacion: "+empleado.getNivelEducacion());
				System.out.println("Sueldo: "+empleado.getSueldo());
				System.out.println("Complemento: "+empleado.getComplemento()+"\n-----------\n");
			}
			
		} else {
			System.out.println(nombre);
		}
	}
	
	private String getNombre(String idDepartamento){
		String res="Departamento no encontrado";
		
		for (Departamento departamento:departamentos){			
			if (departamento.getIdDepartamento().equals(idDepartamento)){
				res=departamento.getNombre();
			} 						
		}
		return res;
	}
	
	private void llenaLista(String idDepartamento){
		for (Empleado empleado:empleados){
			if (empleado.getDepartamento().equals(idDepartamento)){
				listaEmpleados.add(empleado);
			}
		}
	}
	
	public Collection<Empleado> getLista(){
		return listaEmpleados;
	}
}
