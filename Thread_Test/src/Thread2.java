
public class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread 2");
				sleep(3000);
			}
		}
		catch(Exception e)
		{
			
		}
	}
}