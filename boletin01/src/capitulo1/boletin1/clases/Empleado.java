package capitulo1.boletin1.clases;

import java.io.Serializable;
import java.util.Date;

public class Empleado implements Serializable{
	private static final long serialVersionUID=1L;
	
	private String idEmpleado;
	private String nombre;
	private String apellidos;
	private String departamento;
	private Date fechaContrato;
	private String puesto;
	private int nivelEducacion;
	private double sueldo;
	private double complemento;
	
	public Empleado(){
		this.idEmpleado="";
		this.nombre="";
		this.apellidos="";
		this.departamento="";
		this.fechaContrato=new Date();
		this.puesto="";
		this.nivelEducacion=0;
		this.sueldo=0.0;
		this.complemento=0.0;
	}
	
	public Empleado(String idEmpleado, String nombre, String apellidos,
			String departamento, Date fechaContrato, String puesto,
			int nivelEducacion, double sueldo, double complemento) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
		this.fechaContrato = fechaContrato;
		this.puesto = puesto;
		this.nivelEducacion = nivelEducacion;
		this.sueldo = sueldo;
		this.complemento = complemento;
	}

	public Empleado(String idEmpleado, String nombre, String apellidos) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento="";
		this.fechaContrato=new Date();
		this.puesto="";
		this.nivelEducacion=0;
		this.sueldo=0.0;
		this.complemento=0.0;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getNivelEducacion() {
		return nivelEducacion;
	}

	public void setNivelEducacion(int nivelEducacion) {
		this.nivelEducacion = nivelEducacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getComplemento() {
		return complemento;
	}

	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}
	
	public String toString(){
		return "["+idEmpleado+"] "+nombre+" "+apellidos;
	}

}
