
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Person1 = new BankAccount();
		BankAccount Person2 = new BankAccount();
		Person1.deposit("checking", 450.12);
		Person1.deposit("saving", 350.74);
		Person1.deposit("checking", 250.11);
		Person1.withdrawMoney("checking", 100);
		Person1.displayTotal();
		
		Person2.deposit("checking", 102.95);
		Person2.deposit("saving", 850.74);
		Person2.deposit("checking", 55.11);
		Person2.withdrawMoney("checking", 160);
		Person2.displayTotal();
	}	
}
