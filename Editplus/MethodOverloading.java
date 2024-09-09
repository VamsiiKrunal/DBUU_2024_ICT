class MethodOverloading 
{
	
	public static int sum(int a,int b){
		return a+b;
	}
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	public static int sum(int a,int b,int c,int d){
		return a+b+c+d;
	}
	
	
	public static void main(String[] args) 
	{
		sum(10,20);
	}
}
