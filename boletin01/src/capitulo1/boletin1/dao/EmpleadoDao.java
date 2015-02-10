package capitulo1.boletin1.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;

import capitulo1.boletin1.clases.Empleado;

public class EmpleadoDao {

	private FileOutputStream fout=null;
	private ObjectOutputStream oout=null;
	private FileInputStream fin = null;
    private ObjectInputStream oin = null;
    private Empleado empleadoGuardado=null;
    private Collection<Empleado>empleados;
	
	public EmpleadoDao(){
		
	}
	
	public void save(Empleado empleado,String fileName){
		
		try{
			fout = new FileOutputStream(fileName);
			oout=new ObjectOutputStream(fout);
			oout.writeObject(empleado);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {if (oout!=null) oout.close();}
			catch (IOException e){}
			try {if (fout!=null) fout.close();}
			catch (IOException e) {}
		}
	}
	
	
	public Empleado read(String fileName){
        try {
        	fin = new FileInputStream(fileName);
            oin = new ObjectInputStream(fin);                  
            empleadoGuardado= (Empleado)oin.readObject();          
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
        finally {
        	try { if (oin != null) oin.close(); }
        	catch (IOException e) {}
        	try { if (fin != null) fin.close(); }
        	catch (IOException e) {}
        }
        return empleadoGuardado;
	}
	
	public void saveAll(Collection<Empleado>empleados,String fileName){
		try{
			fout=new FileOutputStream(fileName);
			oout=new ObjectOutputStream(fout);
			oout.writeObject(empleados);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {if (oout!=null) oout.close();}
			catch (IOException e){}
			try {if (fout!=null) fout.close();}
			catch (IOException e) {}
		}
	}
	
	public Collection<Empleado> readAll(String fileName){
		try{
			fin=new FileInputStream(fileName);
			oin=new ObjectInputStream(fin);
			this.empleados=(Collection<Empleado>) oin.readObject();
		}
		catch (Exception e) {
        	e.printStackTrace();
        }
        finally {
        	try { if (oin != null) oin.close(); }
        	catch (IOException e) {}
        	try { if (fin != null) fin.close(); }
        	catch (IOException e) {}
        }
        return this.empleados;
		
	}
}
