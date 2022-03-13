package synchronize;

public class Customer {
	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		PaymentGateway pg1=new PaymentGateway("gpay",amazon);
		Thread t1=new Thread(pg1);
		
		PaymentGateway pg2=new PaymentGateway("Phonepay",amazon);
		Thread t2=new Thread(pg2);
		
		PaymentGateway pg3=new PaymentGateway("Paytm",amazon);
		Thread t3=new Thread(pg3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
