interface paytmSuccess
{
	void shoutPayment();
}



class InstanceVariables implements paytmSuccess
{
	
	void shoutPayment(){
		System.out.println("chalis rupee prapt hue he");
	}
	
	public static void main(String[] args) 
	{
		InstanceVariables obj=new InstanceVariables();
		
		
	}
}
