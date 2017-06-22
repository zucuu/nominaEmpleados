package controlador;

import modelo.Empleado;
import modelo.Nomina;
import utils.Calculadora;

public class LogicaNomina {
	
	public Empleado buscarEmpleado( String nombre ){
		
		Empleado encontrado = null;
		
		Nomina basededatos = new Nomina();

		Empleado[] misempleados = basededatos.getEmpleados();
		
		for (int i = 0; i < misempleados.length; i++) {
			
			if ( nombre.equalsIgnoreCase( misempleados[ i ].getNombre() ) ) {
				encontrado = misempleados[ i ];
			}
			
		}
		
		return encontrado;
	}
	
	public double totalSueldosEmpleados(){
		
		Nomina basededatos = new Nomina();

		Empleado[] misempleados = basededatos.getEmpleados();
		double[] auxiliar = new double[ misempleados.length ];
		
		for (int i = 0; i < misempleados.length; i++) {
			auxiliar[i] = misempleados[i].getSueldo();
		}
		
		return Calculadora.suma(auxiliar);
	}

}
