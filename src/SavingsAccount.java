
public class SavingsAccount extends Account{
	private double interestRate;
	private static double transLimit=100.00;
	

	public SavingsAccount() {	}

	public SavingsAccount(int accountNo, String ownerName, double balance, double interestRate) {
		super(accountNo, ownerName, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

public void withdraw(double amount) {
		if(balance-amount>=transLimit) {
			balance-=amount; System.out.println("$ "+amount+" has been withdrawn from savings account No. "+accountNo);
		}
		else {System.out.println("Your savings account cannot have less than $100");}
	}

public void transfer(double amount) {
	if(balance-amount>=transLimit) {
		balance-=amount; System.out.println("$ "+amount+" has been transfered from savings account No. "+accountNo);
	}
	else {System.out.println("Your savings account cannot have less than $100");}
}

@Override
public String toString() {
		return "SavingsAccount [accountNo=" + accountNo + ", ownerName=" + ownerName+ ", balance=" + balance + ", interestRate=" + interestRate+ "]";
	}

	public static void main(String[] args) {
		

	}

}
