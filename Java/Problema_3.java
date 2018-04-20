import java.io.*;

public class Problema_3 {
	
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
		
		try {
			
			String l = br.readLine();
			String array [] = l.split(",");
			int arrays [] = new int [array.length];
			int arraye[] = new int [array.length];
			
			for (int i = 0 ; i < array.length ; i++)
			{
				arraye[i]=Integer.parseInt(array[i]);
			    
			}
			
			
			
			for (int i = 0 ; i < array.length  ; i++)
			{
				arrays[arraye[i]] +=1;
			    
			}
			
			for (int i = 0; i < array.length  ; i++)
			{
				if (arrays[i] == 1) {
				System.out.println(" no se repite" + " " + i);
				bw.flush();
				}
			}
			
			
			
		}catch(Exception ex) {}
		
	}

}
