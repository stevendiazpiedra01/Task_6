import java.io.*;


public class Problema_1 {
	
	
	
	static void print(int [] arrays ) throws IOException
	{
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		for (int i = 0 ; i < arrays.length; i++)
		
		bw.write(" " + arrays[i] );
		bw.flush();
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		bw.write("Digite Numeros Separados Por Comas : ");
	    bw.flush();
		String l = br.readLine();
		
		bw.write("Digite Numero : ");
		bw.flush();
		int k = Integer.parseInt(br.readLine());
		
		String array [] = l.split(",");
		int arrays []= new int [array.length];	
		
			for ( int  i = 0 ; i < array.length ; i ++ )
			{
				
				 arrays[i] =Integer.parseInt(array[i]);
				  
			
		    } 
			int resultado = 0;
		for (int i = 0 ; i <arrays.length ; i ++)
		{
			for(int j = 0 ; j < arrays.length ; j++ )
			{
				
				if ( arrays[i] - arrays[j] == k)
				{
					resultado += 1;
					bw.write(" "+ resultado+ ". " +arrays[i]  + " - " +arrays[j]+"\n" );
					bw.flush();
					
				}
					
				
			}
		}
		bw.write(" "+ "Numero De Parejas : "+resultado );
		bw.flush();	
			
		
	
	}	
	}


