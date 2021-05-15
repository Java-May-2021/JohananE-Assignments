import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingAccount =0 ;
	private double savingAccount = 0;
	public static int numberOfAccounts = 0;
	public static double totalMoneyStored = 0;
	private static String randomNumbers() {
		String accountNum = "";
		Random r = new Random();
		for(int num = 0; num <= 10; num++) {
			accountNum += (r.nextInt(10));
		}
		return accountNum;
	}
	public BankAccount() {
		this.accountNumber = randomNumbers();
		numberOfAccounts++;
	}
	public double getCheckingAccount() {
		return checkingAccount;
	}
	public void accountNumbers() {
		System.out.println(this.accountNumber);
	}
	public double getSavingAccount() {
		return savingAccount;
	}
	public void deposit(String name, double deposit1) {
		if(name.equals("checking")) {
			this.checkingAccount += deposit1;
		}
		if(name.equals("saving")) {
			this.savingAccount += deposit1;
		}
		totalMoneyStored = ((this.checkingAccount) + (this.savingAccount));
	}
	public void withdrawMoney(String name, double withdraw) {
		boolean moreThanZero = false;
		if(name.equals("checking")){
			if(this.checkingAccount - withdraw >= 0) {
				moreThanZero = true;
				this.checkingAccount -= withdraw;
			}
		}else if(name.equals("saving")) {
			if(this.savingAccount - withdraw >= 0) {
				moreThanZero = true;
				this.savingAccount -= withdraw;
			}
		}
		totalMoneyStored -= withdraw;
	}
	public void displayTotal() {
		System.out.printf("Checking Account: " + this.checkingAccount + "  " + "Saving Account:" + this.savingAccount);
	}	
}
