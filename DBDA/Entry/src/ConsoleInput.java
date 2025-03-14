
public class ConsoleInput {
	
	public static String getString() 
	{
	try
	{
		byte arrInput [] = new byte [100];
		int length=System.in.read(arrInput);
		byte arrFinal [] = new byte[length - 2];
		System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);
		
		String objString = new String(arrFinal);
		return objString;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return null;
	}
	
	public static float getFloat()
	{
		String objString1 = getString();
		return Float.parseFloat(objString1);
	}

	public static int getInteger()
	{
		String objString = getString();
		int num = Integer.parseInt(objString);
		return num;
	}
}
