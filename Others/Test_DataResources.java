package apr_13_2023_try_with_resources;

class DataResources implements AutoCloseable
{
	public void close()
	{
		System.out.println("Data Resource closing");
	}
}


class FileResource implements AutoCloseable
{
	public void close()
	{
		System.out.println("File is close");
	}
}


public class Test_DataResources 
{
	public static void main(String[] args) 
	{
		DataResources rs=new DataResources();
		FileResource fs=new FileResource();
		try (fs;rs)
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Catch");
			e.printStackTrace();
		}
	}
}
