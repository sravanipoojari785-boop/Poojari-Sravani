class Family implements Runnable 
{
	String resource1="chinnu";
	String resource2="PlayStation";
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("chinnu")==true)
		{
			crAccquiredResource();
		}
		else
		{
			luckyAccquiredResource();
		}
	}
	void crAccquiredResource()
	{
		synchronized (resource2)
		{
			try
			{
				System.out.println("chinnu accquired the player");
				Thread.sleep(1000);
				synchronized(resource1) 
				{
					System.out.println("chinnu accquired TV" );
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				System.out.println("robit failed");
				
			}
		}
		}
	void luckyAccquiredResource()
	{
		synchronized (resource1)
		{
			try
			{
				System.out.println("lucky accquired TV");
				Thread.sleep(1000);
				synchronized(resource2) 
				{
					System.out.println("lucky accquired the player" );
					Thread.sleep(1000);
				}
			}
			catch(Exception e)
			{
				System.out.println("robit failed");
				
			}
		}
		}
}
public class ExampleForDeadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family f=new Family();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		t1.setName("chinnu");
		t2.setName("moksha");
		t1.start();
		t2.start();

	}

}