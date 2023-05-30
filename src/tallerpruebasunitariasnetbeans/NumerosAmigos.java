/**
 * 
 */
package tallerpruebasunitariasnetbeans;

/**
 * Un simple programa Java para contar pares de n�meros amigos en un array.
 * 
 * Dos n�meros son amigos si el primero es igual a la suma de los divisores del segundo, y si el segundo n�mero es igual a la suma de los divisores del primero.
 *<br>
 *Ejemplos:
 *<br>
 *Entrada: arr [] = {220, 284, 1184, 1210, 2, 5}<br>
 *Salida: 2<br>
 *Explicaci�n: (220, 284) y (1184, 1210) forman un par de n�meros amigos<br>
 *<br>
 *Entrada: arr [] = {2620, 2924, 5020, 5564, 6232, 6368}<br>
 *Salida: 3<br>
 *Explicaci�n: (2620, 2924), (5020, 5564) y (6232, 6368)  forman una pareja de n�meros amigos<br>
 *
 * @author Andres Restrepo
 *
 */
public class NumerosAmigos {
    // Calcular la suma de los divisores propios
	 static int sumdeDiv(int x)
    {
        // 1 es un divisor propio
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x % i == 0)
            {
                sum += i;

                // Para manejar cuadrados perfectos
                if (x / i != i)
                    sum += x / i;
            }
        }

        return sum;
    }

    // Comprobar si el par amigo
	static boolean esAmigo(int a, int b)
    {
        return (sumdeDiv(a) == b &&
                sumdeDiv(b) == a);
    }

	/**
	 * Este m�todo imprime un par de pares amigos
     * presentes en la matriz de entrada
	 * 
	 * @param arr arreglo de numeros 
	 * @param n tama�o del arr
	 * @return el n�mero de pares de n�meros amigos.
	 */
	public static int contarPareja(int arr[], int n)
    {
        int count = 0;
        // Iterar a trav�s de cada par,
        // y encuentra si es una pareja son n�meros amigos
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (esAmigo(arr[i], arr[j]))
                    count++;
        return count;
    }
	
	 public static void main(String args[])
     {

         int arr1[] = { 220, 284, 1184,
                 1210, 2, 5 };
         int n1 = arr1.length;

         System.out.println("Hay "+contarPareja(arr1, n1)+" pares de números amigos");

         int arr2[] = { 2620, 2924, 5020,
                 5564, 6232, 6368 };
         int n2 = arr2.length;

         System.out.println("Hay "+contarPareja(arr2, n2)+" pares de números amigos");
     }
}
