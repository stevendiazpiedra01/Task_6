/*
 * Task 6 _ Fundamentos Estructura De Datos 
 * Problema_3 = programa que permite ingresar una serie de numeros separados por comas , e imprime el numero que no se repite
 * Problema_3//Java
 * @author Brayan Steven Diaz
 */
import java.io.*;

public class Problema_3 {
	
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
		
		try {
			//Se Crea Una variable String para almacenar los que el usuario digite
			String l = br.readLine();
			//Se crean dos arreglos, uno que almacenara los datos de tipo string y otro que guardara los mismos datos pero de tipo entero
			//para poder realizar las operaciones entre los numeros//
			String array [] = l.split(",");
			int arrays [] = new int [array.length];
			int arraye[] = new int [array.length];
			
			//Bucle For para guardar los datos tipo string en el arreglo uno y convertirlos a entero en el arreglo 2
			for (int i = 0 ; i < array.length ; i++)
			{
				arraye[i]=Integer.parseInt(array[i]);
			    
			}
			
			
			
			for (int i = 0 ; i < array.length  ; i++)
			{
				arrays[arraye[i]] +=1;
				if (arrays[i] == 1) 
				{
					bw.write(" "+"No se repite :" + " " + i +"\n" );
					bw.flush();
			    
			    }
			
			}
			
			
			
		}catch(Exception ex) {}
		
	}

}
