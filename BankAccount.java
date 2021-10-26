public class BankAccount {
	
	String name;
	double balance;
	
	public BankAccount(double x, String y){
	balance = x;
	name = y;
	}
	
	public void deposit(double depositValue) {
	balance = balance + depositValue;
	}

	public void withdrawal(double withdrawalValue) {
	balance = balance - withdrawalValue;	
	}
	
	}

