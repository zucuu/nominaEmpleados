
import java.util.Arrays;

public class RepasoJava {
	
	public static void main(String[] args) {
		
		int a = 2;
		double b = 2.3;
		String c = "Grecia";
		boolean d = ( 2+2 == 3 );
		
		int[][] matrizdeejemplo = new int[3][3];
		
		matrizdeejemplo[0][0] = 21;
		matrizdeejemplo[0][1] = 07;
		matrizdeejemplo[0][2] = 54;
		
		matrizdeejemplo[1][0] = 9;
		matrizdeejemplo[1][1] = 32;
		matrizdeejemplo[1][2] = 42;
		
		matrizdeejemplo[2][0] = 89;
		matrizdeejemplo[2][1] = 33;
		matrizdeejemplo[2][2] = 87;
		
		/**
		 * Sentencia de control IF
		 */
		
		if ( d ) {
			System.out.println("El resultado es correcto");
		} else {
			System.out.println( "El resultado es incorrecto" );
		}
		
		/**
		 * Sentencia de control SWITCH
		 */
		
		switch( a ){
		
		case 2:
			System.out.println( "A vale 2" );
			break;
		case 3:
			System.out.println( "A vale 3" );
			break;
		case 4:
			System.out.println( "A vale 4" );
			break;
			default:
				System.out.println( "A no vale nada" );
				break;
		}
		
		/**
		 * Sentencias de iteracion
		 */
		
		System.out.println( "Ejemplo de iteracion incrementando el valor de la variable" );
		
		for (int i = 1; i <= 5; i++) {
			System.out.println( i );
		}
		
		System.out.println( "Ejemplo de iteracion decrementando el valor de la variable" );
		
		for (int i = 5; i > 0; i--) {
			System.out.println( i );
		}
		
		int x = 0;
		System.out.println( "Ejemplo de iteracion utilizando la sentencia WHILE" );
		
		while( x >= 0 && x <= 5 ){
			System.out.println( "Este es el valor de X :" + x );
			x++;
		}
		
		System.out.println( "Este print eta despues del WHILE" );
		
		System.out.println( "A continuacion un ejemplo de DO-WHILE" );
		
		do{

			System.out.println( "Este es el valor de X :" + x );
			x++;
		}while( x >= 0 && x <= 5 );
		
		int filas = 3;
		int columnas = 3;
		
		int auxiliar = 0;
	
		System.out.println( "Se muetran todos los valores de la matriz" );
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				System.out.println( matrizdeejemplo[ i ][ j ] );
				
				if( i == 0 && j == 0 ) {
					auxiliar = matrizdeejemplo[ i ][ j ];	
				}
				
				if( auxiliar > matrizdeejemplo[ i ][ j ] )
					auxiliar = matrizdeejemplo[ i ][ j ];
			}
		}
		
		System.out.println( "Este es el menor de los numeros" );
		
		System.out.println( auxiliar );
		
		System.out.println( "Se ordena la matriz de forma magica" );
		
		for (int i = 0; i < filas; i++) {
			
			Arrays.sort( matrizdeejemplo[i] );
			
		}
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				System.out.print( matrizdeejemplo[i][j] + " | "  );
				if ( j+1 == columnas ) {
					System.out.println( "|" );
				}
				
			}
			
		}
		
	}

}
