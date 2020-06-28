class Bank{
	public static void main(String[] args){
  
	// CREATE 2 BANKACCOUNT OBJECT
	BankAccount acc1=new BankAccount();
	BankAccount acc2=new BankAccount();

	System.out.println("Two BankAccount objects are created");
	// initializing Account objects with ravi&teja

	acc1.accno=1234;
	acc1.accHname="ravi"; 
	acc1.balance=10000;


	acc2.accno=5678;
	acc2.accHname="teja"; 
	acc2.balance=20000;

	
	System.out.println("both BankAccounts objects are initialized");

	System.out.println("\nacc1 details");
	acc1.display();
	
	
	System.out.println("\nacc2 details");
	acc2.display();

	// deposit amt in acc1 object
	acc1.deposit(5000);
	
	System.out.println("cash 5000 is deposited");
	
	System.out.println("currentbalance");
	acc1.currentbalance();

	double cash =acc1.withdraw(3000);
	System.out.println("\n"+cash+"deducated from your account");
	System.out.println("take your cash:"+cash);
	System.out.println("currentbalance is:");
	acc1.currentbalance();

	System.out.println("\n acc1 updated details");
	acc1.display();


	}
}