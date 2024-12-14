package Nov;
//Assignment 6
public class BankDetail6 {

	int balance;

	void initBalance(int balance) {
		this.balance = balance;
	}

	void creditAmt(int amt) {
		balance = balance + amt ;
	}
	void debitAmt(int amt) {
		balance = balance - amt ;
	}
	void display() {
		System.out.println("Your current balance is : "+balance);
	}

	public static void main (String[] args) {
		BankDetail6 bankDetail6 = new BankDetail6();
		bankDetail6.initBalance(5000);
		bankDetail6.creditAmt(2000);
		bankDetail6.debitAmt(6500);
		bankDetail6.creditAmt(1500);
		bankDetail6.display();
	}
}
