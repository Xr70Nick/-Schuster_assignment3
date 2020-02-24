
public class SavingsAccountTest {

	
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		saver1.calculateMonthlyInterest(4);
		saver2.calculateMonthlyInterest(4);
		saver1.calculateMonthlyInterest(5);
		saver2.calculateMonthlyInterest(5);
	}
}
