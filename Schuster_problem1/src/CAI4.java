import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	public  SecureRandom rand = new SecureRandom();
	private  int rand1 = rand.nextInt(10);
	private  int rand2 = rand.nextInt(10);
	private  int rand3 = rand.nextInt(4);
	private  int rand4 = rand.nextInt(4);
	public  int total; 
	public  int input;
	public 	int counter=0;
	public static  int result;
	public  Scanner in = new Scanner(System.in); 

public  static void main(String args[]) {
		CAI4 Run = new CAI4();
		Run.quiz();
	}

public void askQuestion() {
	System.out.printf("\nHow much is %d times %d?\n", getRand1(),getRand2());
}

public void quiz() {
	int r = 1;
	int selection = 0;
	while(r == 1) {
	selection = readDifficulty();
	for (int i = 0; i < 10; i++) {
	
	generateQuestionArgument(selection);
    total = (getRand1())*(getRand2());
    askQuestion();
	readResponse();
	isAnswerCorrect(total);
	
	if (getResult() == 0) {
		setCounter(counter+1);
	}
	}
	displayCompleteMessage();
	r = doItagain();
	
	}
	
}

public int readDifficulty() {
	int selection;
	System.out.println("Level 1 (easy)");
	System.out.println("Level 2 (medium)");
	System.out.println("Level 3 (hard)");
	System.out.println("Level 4 (very hard)");
	System.out.printf("Enter your difficulty selection(1,2,3, or 4): ");
	selection = in.nextInt();
	return selection;
}

public void generateQuestionArgument(int selection) {
	
	if (selection == 1) {
		int rand1 = rand.nextInt(10);
		int rand2 = rand.nextInt(10);
		setRand1(rand1);
		setRand2(rand2);
		
	}
	else if (selection == 2) {
		rand1 = rand.nextInt(100);
		rand2 = rand.nextInt(100);
		setRand1(rand1);
		setRand2(rand2);
		
	}
	else if (selection == 3) {
		rand1 = rand.nextInt(1000);
		rand2 = rand.nextInt(1000);
		setRand1(rand1);
		setRand2(rand2);
		
	}
	else if (selection == 4) {
		rand1 = rand.nextInt(10000);
		rand2 = rand.nextInt(10000);
		setRand1(rand1);
		setRand2(rand2);
		
	}
	
	

}
	
public int doItagain() {
	int yesNo;
	System.out.printf("\nWould you like to solve a new problem set(press 1 for yes and 0 for no): ");
	yesNo = in.nextInt();
	if (yesNo == 0) {
		System.out.println("Goodbye !");
	}
	return yesNo;
}
public void displayCompleteMessage() {
	double grade;
	grade = ((getCounter()/10.0)*100);
	System.out.printf("\nYour grade is %.2f\n",grade);
	if (grade < 75) {
		System.out.printf("Please ask your teacher for help");
	}
	else if (grade >= 75) {
		System.out.println("Congratulations, you are ready to go to the next level!");
	}
	
}
public int Mult() {
	total = (getRand1())*(getRand2());
	return total;
}

public void readResponse() {
	System.out.printf("Enter you answer: ");
	setInput(in.nextInt());
}

public int isAnswerCorrect(int total) {
	if (total == getInput()) {
		displayCorrectResponse();
		return getResult();
		
	}
	else if (getInput() != total) {
		displayIncorrectResponse();
		return getResult();
	}
	return 0;
}
public int displayCorrectResponse() {
	int rand3 = rand.nextInt(4);
	setRand3(rand3);
	switch (getRand3()) {
	case 0 :System.out.println("Verry good!");
	setResult(0);return getResult();
	case 1 :System.out.println("Excellent!");
	setResult(0);return getResult();
	case 2 :System.out.println("Nice work!");
	setResult(0);return getResult();
	case 3 :System.out.println("Keep up the good work!");
	setResult(0);return getResult();
	}
	return 0;
}
public void displayIncorrectResponse() {
	int rand4 = rand.nextInt(4);
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
	CAI4.result = result;
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

public void setCounter(int counter) {
	this.counter = counter;
}

public int getCounter() {
	return counter;
}
}
