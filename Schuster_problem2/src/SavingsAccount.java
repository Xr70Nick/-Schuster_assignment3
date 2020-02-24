
public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance; 

public static void main(double rate, double balance ) {
	
}
public SavingsAccount(double savingsBalance) {
	this.savingsBalance = savingsBalance;
}

public void calculateMonthlyInterest(double rate) {
	modifyInterestRate(rate);
	setSavingsBalance(savingsBalance);
	
	System.out.println("___________________________________________________________________________________________");
	for (int i = 0; i < 12; i++) {
	setSavingsBalance(((getAnnualInterestRate() * getSavingsBalance())/12) + getSavingsBalance());
	switch(i) {
	case 0: System.out.printf("|January  |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 1: System.out.printf("|February |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 2: System.out.printf("|March    |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 3: System.out.printf("|April    |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 4: System.out.printf("|May      |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 5: System.out.printf("|June     |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 6: System.out.printf("|July     |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 7: System.out.printf("|August   |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 8: System.out.printf("|September|at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 9: System.out.printf("|October  |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 10:System.out.printf("|November |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	case 11:System.out.printf("|December |at %.0f%%|= %.2f|\n",getAnnualInterestRate()*100,getSavingsBalance());break;
	}
	}
	System.out.println("___________________________________________________________________________________________\n");
	System.out.println("-------------------------------------------------------------------------------------------");
}

public void modifyInterestRate(double rate) {

	setAnnualInterestRate(rate/100);
	
}

public static double getAnnualInterestRate() {
	return annualInterestRate;
}

public static void setAnnualInterestRate(double annualInterestRate) {
	SavingsAccount.annualInterestRate = annualInterestRate;
}


public double getSavingsBalance() {
	return savingsBalance;
}


public void setSavingsBalance(double savingsBalance) {
	this.savingsBalance = savingsBalance;
}

















}
