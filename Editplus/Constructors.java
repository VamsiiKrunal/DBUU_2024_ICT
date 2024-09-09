class Constructors 
{
	int rollno;
	String name;
	
	Constructors(){
		System.out.println("constructor is called wh");
		
	}
	Constructors(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Constructors object=new Constructors();
	Constructors obj2=new Constructors(12,"rahul");
		
	}
}
