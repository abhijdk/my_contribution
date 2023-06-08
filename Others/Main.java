package apr_12_2023_IOStream_with_exception_handling;


class FileAlreadyExistsExceptionDemo extends Exception
{
	FileAlreadyExistsExceptionDemo()
	{
		
	}
	FileAlreadyExistsExceptionDemo(String msg)
	{
		super(msg);		
	}
}

class FileNotFoundExceptionDemo extends Exception
{
	FileNotFoundExceptionDemo()
	{
		
	}
	FileNotFoundExceptionDemo(String msg)
	{
		super(msg);
	}
}



class CarStopped extends Exception 
{
    public CarStopped(String message) 
    {
        super(message);
    }
}

class CarPuncture extends Exception
{
    public CarPuncture(String message) 
    {
        super(message);
    }
    public static void puncture(String message) throws CarPuncture
    {
        if (message.equals("puncture"))
        {
            throw new CarPuncture("Car is punctured");
        }
        else
        {
            System.out.println("Car not stalled");
        }
    }
}

class CarHeat extends Exception 
{
    public CarHeat(String message)
    {
        super(message);
    }
    public static void carHeat(int temperature) throws CarHeat 
    {
        if (temperature > 50) 
        {
            throw new CarHeat("Car is heated more than 50 degrees");
        }
        else
        {
            System.out.println("Car not stalled");
        }
    }
}

class CarTest
{
    public static void Stop(String message) throws CarStopped 
    {
        if (message.equals("stop"))
        {
            throw new CarStopped("Car stopped due to unknown reason");
        }
        else
        {
            System.out.println("Car not stalled");
        }
    }
}

class Main1
{
    public static void main(String[] args)
    {
        try
        {
            CarTest.Stop("stop");
        }
        catch (CarStopped e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            CarTest.Stop("not stop");
        }
        catch (CarStopped e) 
        {
            System.out.println(e.getMessage());
        }

        try
        {
            CarPuncture.puncture("puncture");
        } 
        catch (CarPuncture e) 
        {
            System.out.println(e.getMessage());
        }

        try {
            CarPuncture.puncture("not puncture");
        } 
        catch (CarPuncture e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            CarHeat.carHeat(60);
        } 
        catch (CarHeat e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            CarHeat.carHeat(40);
        }
        catch (CarHeat e) 
        {
            System.out.println(e.getMessage());
        }
    }
}