import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	public  SecureRandom rand = new SecureRandom();
	public  int rand1 = rand.nextInt(10);
	public  int rand2 = rand.nextInt(10);
	public  int rand3 = rand.nextInt(4);
	public 	int rand4 = rand.nextInt(4);
	private int total; 
	public  int input; 
	public static  int result;
	public  Scanner in = new Scanner(System.in); 

public  static void main(String args[]) {
		result = 1;
		CAI2 Run = new CAI2();
		while(result == 1){
		Run.quiz();
		}	
	}

public void askQuestion() {
	setRand1(rand1);
	setRand2(rand2);
	setRand3(rand3);
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
		displayCorrectResponse(getRand3());
		
	}
	else if (getInput() != Mult()) {
		displayIncorrectResponse();
		
	}
}
public void displayCorrectResponse(int x) {
	switch (x) {
	case 0 :System.out.println("Verry good!");
	setResult(0);break;
	case 1 :System.out.println("Excellent!");
	setResult(0);break;
	case 2 :System.out.println("Nice work!");
	setResult(0);break;
	case 3 :System.out.println("Keep up the good work!");
	setResult(0);break;
	}
	
}
public void displayIncorrectResponse() {
	setRand4(rand4);
	switch (getRand4()) {
	case 0 :System.out.println("No. Please try again.");
	setResult(1);break;
	case 1 :System.out.println("Wrong. Try once more.");
	setResult(1);break;
	case 2 :System.out.println("Don't give up!");
	setResult(1);break;
	case 3 :System.out.println("No. Keep trying.");
	setResult(1);break;
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
	CAI2.result = result;
}

public int getRand3() {
	return rand3;
}

public void setRand3(int rand3) {
	this.rand3 = rand3;
}

public int getRand4() {
	return rand4;
}

public void setRand4(int rand4) {
	this.rand4 = rand4;
}

}


