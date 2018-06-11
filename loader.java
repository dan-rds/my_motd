import java.io.*;
public class loader{
	
	public static void open(String f, int t) throws InterruptedException, FileNotFoundException, IOException {
		System.out.print(String.format("\033[2J"));
		BufferedReader op = new BufferedReader(new FileReader(f));
			String line = op.readLine();
			while(line != null)
			{
			  System.out.println(line);
			  line = op.readLine();
			}
			op.close();

			Thread.sleep(t);
	}

	
	public static void main(String[] args)
	
		throws InterruptedException, FileNotFoundException, IOException {
		
		for(int i = 0; i < 100; i++)
			System.out.println();
			open("open.txt",300);
			open("mid.txt",100);
			open("closed.txt",500);
			open("mid.txt",100);
			open("open.txt",0);
		
			
			

	
		
	}
}