import java.security.SecureRandom;
import java.util.Scanner;




public class CAI1 {
	public  SecureRandom rand = new SecureRandom();
	public  int rand1 = rand.nextInt(10);
	public  int rand2 = rand.nextInt(10);
	private int total; 
	public  int input; 
	public static  int result;
	public  Scanner in = new Scanner(System.in); 

public void askQuestion() {
	setRand1(rand1);
	setRand2(rand2);
	System.out.printf("How much is %d times %d?\n", getRand1(),getRand2());
}

public void quiz() {
	askQuestion();
    total = (getRand1())*(getRand2());
	readResponse();
	isAnswerCorrect(total);
	
	
}

public int Mult() {
	total = (getRand1())*(getRand2());
	return total;
}

public void readResponse() {
	System.out.printf("Enter you answer: ");
	setInput(in.nextInt());
}

public void isAnswerCorrect(int Mult) {
	if (getInput() == Mult()) {
		displayCorrectResponse();
	}
	else if (getInput() != Mult()) {
		displayIncorrectResponse();
	}
}
public void displayCorrectResponse() {
	System.out.println("Verry good!");
	setResult(0);
}
public void displayIncorrectResponse() {
	System.out.println("No. Please try again.");
	setResult(1);
}

public  static void main(String args[]) {
	result = 1;
	CAI1 Run = new CAI1();
	while(result == 1){
	Run.quiz();
	}	
}

public int getRand1() {
	return rand1;
}

public void setRand1(int rand1) {
	this.rand1 = rand1;
}

public int getRand2() {
	return rand2;
}

public  void setRand2(int rand2) {
	this.rand2 = rand2;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}

public void setInput(int input) {
	this.input = input;
}

public int getInput() {
	return input;
}

public int getResult() {
	return result;
}

public  static void setResult(int result) {
	CAI1.result = result;
}
}