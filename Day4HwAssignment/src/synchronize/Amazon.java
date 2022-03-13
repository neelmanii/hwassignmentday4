package synchronize;

public class Amazon {
	synchronized void checkout(String name) 
	{
		System.out.println("paying using " + name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done with the payment using "+name);
		
		System.out.println("__________________________");
	}
}
