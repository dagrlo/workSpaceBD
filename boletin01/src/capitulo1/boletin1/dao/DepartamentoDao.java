package capitulo1.boletin1.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;

import capitulo1.boletin1.clases.Departamento;

public class DepartamentoDao {
	private FileOutputStream fout=null;
	private ObjectOutputStream oout=null;
	private FileInputStream fin = null;
    private ObjectInputStream oin = null;
    private Departamento departamentoGuardado=null;
    private Collection<Departamento> departamentos;
	
	public DepartamentoDao(){
		
	}
	
	public void save(Departamento departamento,String fileName){		
		try{
			fout = new FileOutputStream(fileName);
			oout=new ObjectOutputStream(fout);
			oout.writeObject(departamento);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {if (oout!=null) oout.close();}
			catch (IOException e){}
			try {if (fout!=null) fout.close();}
			catch (IOException e) {}
		}
	}
	
	
	public Departamento read(String fileName){		
        try {
        	fin = new FileInputStream(fileName);
            oin = new ObjectInputStream(fin);                    

            departamentoGuardado= (Departamento)oin.readObject();          
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
        return departamentoGuardado;
	}
	
	public void saveAll(Collection<Departamento>departamentos,String fileName){
		try{
			fout =new FileOutputStream(fileName);
			oout=new ObjectOutputStream(fout);
			oout.writeObject(departamentos);
		}
		catch (Exception e){
			e.printStackTrace();
		} finally {
			try {if (oout!=null) oout.close();}
			catch (IOException e){}
			try {if (fout!=null) fout.close();}
			catch (IOException e) {}
		}
	}
	
	public Collection<Departamento> readAll(String fileName){
		try{
			fin=new FileInputStream(fileName);
			oin=new ObjectInputStream(fin);
			this.departamentos=(Collection<Departamento>) oin.readObject();
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
        return departamentos;
	}
}
