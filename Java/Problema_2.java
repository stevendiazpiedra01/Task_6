/*
 * Task 6 _ Fundamentos Estructura De Datos 
 * Problema_2 = programa que permite ingresar una serie de numeros separados por comas , despues multiplica los elementos del 
   a excepcion del indice , hasta recorrer todo el arreglo.
 * Problema_2//Java
 * @author Brayan Steven Diaz
 */
import java.io.*;

public class Problema_2 {
	
	
	static void print(int [] arrays ) throws IOException
	{
		//Funcion Buffer para la salida de datos.
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		for (int i = 0 ; i < arrays.length; i++)
		
		bw.write(" " + arrays[i] );
		//Flujo de salida almacenado en el buffer.
		bw.flush();
		System.out.println();
	}

	public static void main(String[] args) {
		//Funciones Buffer para la entrada y salida de datos.
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		int resultado = 1;
	
		try 
		{
		//Se le pide al usuario digitar numeros separados por comas.	
		bw.write("Digite Numeros Separados Por Comas : ");
		//Flujo de salida almacenado en el buffer.
	    bw.flush();
	    //Se Crea Una variable String para almacenar los que el usuario digite
		String l = br.readLine();
		//Se crean dos arreglos, uno que almacenara los datos de tipo string y otro que guardara los mismos datos pero de tipo entero
		//para poder realizar las operaciones entre los numeros//
		String array [] = l.split(",");
		int arrays []= new int [array.length];
		int arraytotal [] = new int [arrays.length];
		
		//Bucle For para guardar los datos tipo string en el arreglo uno y convertirlos a entero en el arreglo 2
		for ( int  i = 0 ; i < array.length ; i ++ )
		{
			
			 arrays[i] =Integer.parseInt(array[i]);
			  
		
	    } 
		
		//Bucles para realizar la operacion de la multiplicaion de los elementos a excepcion del indice 
		for (int i = 0 ; i < arrays.length ; i ++)
		{
			//Se multiplican primero todos los elementos
			resultado = (resultado *arrays [i]);
			for (int j = 0 ; j < arrays.length ; j ++)
			{
				//Dividir despues el indice al resultado de la multiplicacion y se alamacena cada resultado en el arreglo 
				//que almacenara los resultado sde cada multiplicacion
				arraytotal[j] = resultado/arrays[j];
				
				
			}
			
		}
		//Se imprime la funcion que contiene el arreglo para imprimir el resultado.
		print(arraytotal);
		
		
		
		}catch(Exception ex) {}
		
	}

}
