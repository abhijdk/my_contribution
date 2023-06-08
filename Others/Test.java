package apr_12_2023_IOStream_with_exception_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Test 
{
	static File file = null;
	static String content; 
	public static void main(String[] args) throws IOException
	{
		try
		{
			file=new File("D:\\Test\\Sir1.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			if(file.exists())
			{
				
				while ((content=br.readLine())!=null)
					System.out.println(content);	
				
				throw new FileAlreadyExistsException(null);
			}
			else
			{
				throw new FileNotFoundException("not");
			}
			
		}
		catch(FileAlreadyExistsException e)
		{
			System.err.println("File is already avalable*");
		}
		catch(FileNotFoundException e)
		{
			System.err.println("File is Not Avalable**");
		}
		catch(Exception e)
		{
			System.out.println("***");
			e.printStackTrace();
		}
	}
}/**/

/*

public class Test 
{
	static File file = null;
	static String content; 
	public static void main(String[] args) throws IOException
	{
		try
		{
			file=new File("D:\\Test\\Sir1.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			if(file.exists())
			{
				
				while ((content=br.readLine())!=null)
					System.out.println(content);	
				
				throw new FileAlreadyExistsExceptionDemo("File is Existing");
			}
			else
			{
				throw new FileNotFoundExceptionDemo("not found");
			}
			
		}
		catch(FileAlreadyExistsExceptionDemo e)
		{
			System.err.println("File is already avalable*");
		}
		catch(FileNotFoundExceptionDemo e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("***");
			e.printStackTrace();
		}
	}
}/**/