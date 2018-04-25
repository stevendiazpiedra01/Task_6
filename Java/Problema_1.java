/*
 * Task 6 _ Fundamentos Estructura De Datos 
 * Problema_1 = programa que permite ingresar una serie de numeros separados por comas y un numero entero , el cual curresponde a
   el resultado de la resta entre cada uno de los elementos , dira cuantas parejas hay y cuales son.
 * Problema_1//Java
 * @author Brayan Steven Diaz
 */
import java.io.*;


public class Problema_1 {
	
	
	public static void main(String[] args) throws IOException {
		
		//Funciones Buffer para la entrada y salida de datos.
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		//Se le pide al usuario digitar numeros separados por comas.
		bw.write("Digite Numeros Separados Por Comas : ");
		//Flujo de salida almacenado en el buffer.
	    bw.flush();
	    
	    //Se Crea Una variable String para almacenar los que el usuario digite
		String l = br.readLine();
		
		//Se le pide al usuario digitar un numeros que sera el resultado de la resta entre las parejas que desean encontrar.
		bw.write("Digite Numero : ");
		//Flujo de salida almacenado en el buffer.
		bw.flush();
		//Se crea la variable que almacenara el numero que ingreso el usuario
		int k = Integer.parseInt(br.readLine());
		
		//Se crean dos arreglos, uno que almacenara los datos de tipo string y otro que guardara los mismos datos pero de tipo entero
		//para poder realizar las operaciones entre los numeros//
		String array [] = l.split(",");
		int arrays []= new int [array.length];	
		
		//Bucle For para guardar los datos tipo string en el arreglo uno y convertirlos a entero en el arreglo 2
			for ( int  i = 0 ; i < array.length ; i ++ )
			{
				
				 arrays[i] =Integer.parseInt(array[i]);
				  
			
		    } 
			//Variable que guardara la cantidad de parejas 
			int resultado = 0;
			//Bucle for anidado para recorrer las posiciones del arreglo y hacer la resta entre los numeros dentro de el.
		for (int i = 0 ; i <arrays.length ; i ++)
		{
			for(int j = 0 ; j < arrays.length ; j++ )
			{
				//En condicional , indicamos si el resultado de la resta entre dos numeros del arreglo es igual a la variable "k"
				//Entonces que imprima el indice del resultado y la pareja con el resultado igual a k.
				if ( arrays[i] - arrays[j] == k)
				{
					resultado += 1;
					bw.write(" "+ resultado+ ". " +arrays[i]  + " - " +arrays[j]+"\n" );
					bw.flush();
					
				}
					
				
			}
		}
		//Se imprime en el bufer el numero de parejas existentes.
		bw.write(" "+ "Numero De Parejas : "+resultado );
		bw.flush();	
			
		
	
	}	
	}
