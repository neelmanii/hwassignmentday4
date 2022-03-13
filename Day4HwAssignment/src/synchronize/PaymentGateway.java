package synchronize;

public class PaymentGateway implements Runnable{

	private String name;
	private Amazon amazon;
	
	public PaymentGateway(String name,Amazon amazon)
	{
		this.name=name;
		this.amazon=amazon;
	}
	
	@Override
	public void run() {
		amazon.checkout(name);
	}

	

	
}