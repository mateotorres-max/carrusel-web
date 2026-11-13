public class Persona{
	int id;
	String nombres;
	String apellido_paterno;
	String apellido_materno;
	int edad;
	double talla;
	
	public Persona(){};
	
	public Persona(int id, String nombres, String apellido_paterno,	String apellido_materno, int edad, double talla){
			this.id = id;
			this.nombres=nombres;
			this.apellido_paterno = apellido_paterno;
			this.apellido_materno = apellido_materno;
			this.edad= edad;
			this.talla = talla;
	};
	
}
