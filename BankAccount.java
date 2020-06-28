class BankAccount{

long	 accno;
String   accHname;
double   balance;
   
	void deposit(double amt){
	balance=balance+amt;
	}

	double withdraw(double amt){
	balance=balance-amt;
	return amt;
	}

	void currentbalance(){
	System.out.println(balance);
	}

	void display(){
	System.out.println("\naccno\t:"+accno);
	System.out.println("\naccHname\t:"+accHname);
	System.out.println("\naccbalance\t:"+balance);
	}
}



