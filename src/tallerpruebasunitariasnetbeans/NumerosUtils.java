/**
 * 
 */
package tallerpruebasunitariasnetbeans;

/**
 * Clse utilitaria para manejo de numeros.
 * @author Andres Restrepo
 *
 */
public class NumerosUtils {

	/**
	 * Metodo para saber si un numero es primo o no 
	 * @param numero a evaluar.
	 * @return
	 */
	public static boolean esPrimo(int numero){
		  int contador = 2;
		  boolean primo=true;
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}
}
