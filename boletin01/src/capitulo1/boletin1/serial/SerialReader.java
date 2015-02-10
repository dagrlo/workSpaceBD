package capitulo1.boletin1.serial;

import java.io.IOException;
import java.text.SimpleDateFormat;

import capitulo1.boletin1.clases.Departamento;
import capitulo1.boletin1.clases.Empleado;
import capitulo1.boletin1.dao.DepartamentoDao;
import capitulo1.boletin1.dao.EmpleadoDao;

public class SerialReader {
    public static void main(String[] args) {
    	EmpleadoDao eDao=new EmpleadoDao();
    	DepartamentoDao dDao=new DepartamentoDao();
    	
        try {
        

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

            Empleado empleadoGuardado = eDao.read("archivo02.ser");
            Departamento departamentoGuardado=dDao.read("dE21.dep");
            System.out.println(empleadoGuardado);
            System.out.println(" Departamento: " + empleadoGuardado.getDepartamento());
            System.out.println("       Puesto: " + empleadoGuardado.getPuesto() + 
            		", Antiguedad: " + formatter.format(empleadoGuardado.getFechaContrato()));
            System.out.println("  Nivel Educ.: " + empleadoGuardado.getNivelEducacion());
            double total = empleadoGuardado.getSueldo() + empleadoGuardado.getComplemento();
            System.out.println("       Sueldo: " + empleadoGuardado.getSueldo() + 
            		", Complemento: " + empleadoGuardado.getComplemento() + 
            		", Total: " + total);
            System.out.println("=======================================");
            System.out.println("Departamento ["+departamentoGuardado.getIdDepartamento()+"]: "+departamentoGuardado.getNombre());
            System.out.println("Administrador: "+departamentoGuardado.getAdministrador());
            System.out.println("Manager: "+departamentoGuardado.getManager());
            }
        catch (Exception e) {
        	e.printStackTrace();
        }
       
	}
}
