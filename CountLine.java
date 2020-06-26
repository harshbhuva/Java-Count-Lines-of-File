import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CountLine
{
	public static void main(String[] args)
	{
		String fna,line="";
		int count=0,m,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file name: ");
		fna=sc.next();
		
		try
		{
			FileReader fr=new FileReader("src//"+fna);
			BufferedReader br=new BufferedReader(fr);
			
			while(line!=null)
			{
				line=br.readLine();
				count++;
			}
			System.out.println("Total no of lines: "+count);
			fr.close();
			m=count/2;
			i=0;
			fr=new FileReader("src//"+fna);
			br=new BufferedReader(fr);
			line="";
			
			while(line!=null)
			{
				line=br.readLine();
				i++;
				if(i>(m-5) && i<=(m+5))
				{ 
					System.out.println(line);
				}
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("Error message: "+e.getMessage());
		}

	}

}
