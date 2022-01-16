
public class Mthread 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t2.setName("Hello World");
		t1.start();
		t2.start();
		
		
	}
}