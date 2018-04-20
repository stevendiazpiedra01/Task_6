import java.io.*;

public class Problema_2 {
	
	
	static void print(int [] arrays ) throws IOException
	{
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		for (int i = 0 ; i < arrays.length; i++)
		
		bw.write(" " + arrays[i] );
		bw.flush();
		System.out.println();
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		int resultado = 1;
	
		try 
		{
		bw.write("Digite Numeros Separados Por Comas : ");
	    bw.flush();
		String l = br.readLine();
		
		String array [] = l.split(",");
		int arrays []= new int [array.length];
		int arraytotal [] = new int [arrays.length];
		
		for ( int  i = 0 ; i < array.length ; i ++ )
		{
			
			 arrays[i] =Integer.parseInt(array[i]);
			  
		
	    } 
		
		for (int i = 0 ; i < arrays.length ; i ++)
		{
			resultado = (resultado *arrays [i]);
			for (int j = 0 ; j < arrays.length ; j ++)
			{
				arraytotal[j] = resultado/arrays[j];
				
				
			}
			
		}
		
		print(arraytotal);
		
		
		
		}catch(Exception ex) {}
		
	}

}
