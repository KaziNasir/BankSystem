
public interface BankOperations {
	
	void addInterest();
	void changeInterestRate();
	void transferBalance(int choice);
	void addSavingsAccount();
	void addCurrentAccount();
	void showActiveAccounts();
	void seacrhAccountNo(int acNo);
	void withdraw(int acNam,double amuont);
	void deposit(int acNam,double amuont); 

}
