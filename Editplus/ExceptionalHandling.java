class ExceptionalHandling 
{
	public static void main(String[] args) 
	{
		try{
			int [] arr={1,2,3,4,5};
			System.out.println(arr[8]);
			int a=10;
		int result=a/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index not found"+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("0 se nai ho payega");
		}
		
		
	}
}
