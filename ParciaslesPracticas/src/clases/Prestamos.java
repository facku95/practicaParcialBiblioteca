package clases;

public class Prestamos {
private Integer nro_prest;
private Estudiantes estudiante;
private Libros libro;

public Prestamos(Integer nro_prest, Estudiantes estudiante, Libros libro) {
	super();
	this.nro_prest = nro_prest;
	this.estudiante = estudiante;
	this.libro = libro;
}

public Integer getNro_prest() {
	return nro_prest;
}

public void setNro_prest(Integer nro_prest) {
	this.nro_prest = nro_prest;
}

public Estudiantes getEstudiante() {
	return estudiante;
}

public void setEstudiante(Estudiantes estudiante) {
	this.estudiante = estudiante;
}

public Libros getLibro() {
	return libro;
}

public void setLibro(Libros libro) {
	this.libro = libro;
}

public Boolean registrarPrestamo(Integer id,Estudiantes estudiante,Libros libro) {
	Boolean sePuedePrestar=true;
	if (estudiante.getnLibros()<2) {
		libro.setHabilitado(false);
		estudiante.setnLibros(estudiante.getnLibros()+1);
		
	}else {sePuedePrestar=false;}
	return sePuedePrestar;
}

public void registrarDevolucion(Libros libro) {
	libro.setHabilitado(true);
}
public String toString() {
	return "El libro "+ libro.getNombre() +"fue prestado a "+estudiante.getApellido()
			+estudiante.getNombre()+"de DNI "+estudiante.getDni();
	
}

}
