import controlador.LogicaNomina;
import modelo.Empleado;
import utils.Calculadora;
import vista.Pantalla;

public class NominaApp {
	
	public static void main(String[] args) {
		
		Pantalla vista = new Pantalla();
		LogicaNomina controlador = new LogicaNomina();
		
		String nombreEmpleado = vista.ingresarValor();
		
		Empleado empleado = controlador.buscarEmpleado(nombreEmpleado);
		
		if( empleado != null ) {
			vista.mostrarMensaje( "Nombre :" + empleado.getNombre() + " | Edad : " + empleado.getEdad() + " | Sueldo : "+ empleado.getSueldo() );
		} else {
			vista.mostrarMensaje( "Este empleado no se encuentra en nuestra base de datos" ); 
		}
		
		vista.mostrarMensaje( "El total de sueldos en nomina es" + controlador.totalSueldosEmpleados() );
		
		vista.mostrarMensaje( String.valueOf( Calculadora.suma( 2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2 ) ) );
		
	}

}
