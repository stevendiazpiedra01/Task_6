/*
 * Task 6 _ Fundamentos Estructura De Datos 
 * Problema_5 = programa que permite ingresar una serie de numeros separados por comas, como sucesion ,el cual encontrar 
   el numero faltante de un patron de numeros.
 * Problema_5//Java
 * @author Brayan Steven Diaz
 *
 */
import java.io.*;


public class Programa5 {
	
	public static int[] arreglo (String datos [])
	{
		int [] num = new int [datos.length]; 
		for (int i= 0; i<datos.length; i++)
			num[i] = Integer.parseInt(datos[i]);
		return num;
	}
	
	public static void main(String[] args) {
		try {
			//Funciones Buffer para la entrada y salida de datos.
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			//Se le pide al usuario digitar numeros separados por comas.
			String n = br.readLine();
			//Se almacenan los datos de entrada en un arraglo de Strings.
			String [] datos = n.split(","); 
			//Se invoca a la función para crear el arreglo de enteros.
			int [] num = arreglo(datos); 
			
			//Variable que guardara la respuesta
			int respuesta =0;
			//Se define la sucesion de la secuencia.
			int secuencia = num[1] - num[0]; 
			for (int i = 1; i<num.length; i++) { 
				//Se busca dónde el patron no cumple la diferencia de la secuencia.
				if (num [i]-num[i-1] != secuencia) 
					//Se guarda en la variable respuesta el número faltante.
					respuesta = num [i-1] + secuencia; 
				
			}
			//Se imprime en el bufer el numero faltante.
			bw.write("Numero faltante en la sucesion: "+respuesta);
			bw.flush();
			
		}
		catch(Exception ex) {}

	}

}
