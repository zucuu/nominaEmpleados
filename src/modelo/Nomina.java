package modelo;

public class Nomina {
	
	Empleado[] empleados = new Empleado[5];
	
	public Nomina(){
		llenarNomina();
	}
	
	public void llenarNomina(){
		
		Empleado alexis = new Empleado();
		alexis.setNombre( "Alexis Molina" );
		alexis.setEdad( 26 );
		alexis.setSueldo( 15.438 );
		empleados[ 0 ] = alexis;
		
		Empleado grecia = new Empleado();
		grecia.setNombre( "Grecia Castro" );
		grecia.setEdad( 26 );
		grecia.setSueldo( 23.448 );
		empleados[ 1 ] = grecia;
		
		Empleado axell = new Empleado();
		axell.setNombre( "Axell Solimine" );
		axell.setEdad( 26 );
		axell.setSueldo( 17.900 );
		empleados[ 2 ] = axell;
		
		Empleado agustin = new Empleado();
		agustin.setNombre( "Agustin Allegri" );
		agustin.setEdad( 26 );
		agustin.setSueldo( 17.900 );
		empleados[ 3 ] = agustin;
		
		Empleado diego = new Empleado();
		diego.setNombre( "Diego Ortiz" );
		diego.setEdad( 26 );
		diego.setSueldo( 27.000 );
		empleados[ 4 ] = diego;
		
	}
	
	public Empleado[] getEmpleados(){
		return empleados;
	}

}
