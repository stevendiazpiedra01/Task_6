import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problema_4 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		
		
		try {
			
			String l = br.readLine();
			String array [] = l.split(",");
			int arrays [] = new int [array.length];
			int mayor,menor;
			for (int i = 0 ; i < array.length ; i++)
			{
				arrays[i]=Integer.parseInt(array[i]);
			    
			}
			menor=mayor=arrays[0];
			
			for (int j = 1 ; j < arrays.length ; j++ )
			{
				if (arrays[j]>mayor)
				{
					mayor=arrays[j];
				}
				
				if (arrays[j]<menor)
				{
					menor=arrays[j];
				}
			}
			int resultado = mayor-menor;
			bw.write(" " + resultado +"\n");
			bw.flush();
		}catch(Exception ex) {}

	}

}
