import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String grade = "";
		double exam1, exam2, finalExam, labs, projects, participation, quizzes;
		//char A, B, C, D, F;
		
		System.out.println("Grading Scale: \n");
		System.out.println("A	90 - 100 \n");
		System.out.println("B	80 - 89 \n ");
		System.out.println("C 	70 - 79 \n");
		System.out.println("D 	60 - 69");
		System.out.println("F	below 60 \n");
		
		System.out.print("What letter grade do you want to recieve?");
		grade = keyboard.next();
		
	//	if ((score >= 90) || (score) <= 100);
		//	System.out.print"A")
		System.out.println("Enter Percentage Weights:");
		
		System.out.print("Exam 1:");
		exam1 = keyboard.nextDouble();
		
		System.out.print("Exam 2:");
		exam2 = keyboard.nextDouble();
		
		System.out.print("Final Exam:");
		finalExam = keyboard.nextDouble();
		
		System.out.print("Labs:");
		labs = keyboard.nextDouble();
		
		System.out.print("Projects:");
		projects = keyboard.nextDouble();
		
		System.out.print("Participation:");
		participation = keyboard.nextDouble();
		
		System.out.print("Quizzes:");
		quizzes = keyboard.nextDouble();
		
		double total = exam1 + exam2 + finalExam + labs + projects
				+ participation + quizzes;
		
		if (total == 100) {
			System.out.println("Enter your scores out of 100:");
		}
		else if (total != 100){
			System.out.print("Weights don't add up to 100, program exiting...");
			System.exit(0);
		}
		
		String Exam1, Exam2, finalexam, Labs, Projects, Participation, Quizzes;
		double Exam1g, Exam2g, finalexamg, Labsg, Projectsg, Participating, Quizzesg;
		Exam1 = "Do you know your  Exam 1 score?";
		Exam2 = "Do you know your Exam 2 score?";
		finalexam = "Do you know your Final Exam score?";
		Labs = "Do you know your lab average?";
		
		System.out.print("Do you know your Exam 1 score?");
		Exam1 = keyboard.next();
		//if (Exam1.equalsIgnoreCase("n") || (Exam1.equalsIgnoreCase("no")))
			//System.out.print("Do you know your lab average?");{
			//Labs = keyboard.next();
		//	}
	//	if {
			//	Labsg = keyboard.nextDouble();
			

		//Exam1g = 0;
		//Exam2g = 0;
		//finalexamg = 0; 
		//Labsg = 0;
		//Projectsg = 0;
		//Participating = 0;
		//Quizzesg = 0;
		
		if (Exam1.equalsIgnoreCase("y") || (Exam1.equalsIgnoreCase("yes"))){
		System.out.print("Score recieved on exam 1:");
		Exam1g = keyboard.nextDouble();}
		else{
			Exam1g = 0;
		}
			
		System.out.print("Do you know your Exam 2 score?");
		Exam2 = keyboard.next();
	
		if (Exam2.equalsIgnoreCase("y") || (Exam2.equalsIgnoreCase("yes"))) {
			System.out.print("Score recieved on exam 2:");
			Exam2g = keyboard.nextDouble();}
		else {
			Exam2g = 0;
		}
		
		System.out.print("Do you know your Final Exam score?");
		finalexam = keyboard.next();
		
		if (finalexam.equalsIgnoreCase("y") || (finalexam.equalsIgnoreCase("yes"))) {
			System.out.print("Score recieved on Final Exam:");
			finalexamg = keyboard.nextDouble();}
		else {
			finalexamg = 0;
		}
			
			System.out.print("Do you know your lab average?");
			Labs = keyboard.next();
		
		if (Labs.equalsIgnoreCase("y") || (Labs.equalsIgnoreCase("yes"))) {
			System.out.print("Average Lab Grade:");
			Labsg = keyboard.nextDouble();}
		else {
			Labsg = 0;
		}
		
			System.out.print("Do you know your project average?");
			Projects = keyboard.next();
			
		if (Projects.equalsIgnoreCase("y") || (Projects.equalsIgnoreCase("yes"))){
			System.out.print("Average ProjectGrade:");
			Projectsg = keyboard.nextDouble();}
		else {
			Projectsg = 0;
		}
			
			System.out.print("Do you know your participation average?");
			Participation = keyboard.next();
		
		if (Participation.equalsIgnoreCase("y") || (Participation.equalsIgnoreCase("yes"))) {
			System.out.print("Average Participation Grade:");
			Participating = keyboard.nextDouble();}
		else {
			Participating = 0;
		}
		
			System.out.print("Do you know your quiz average?");
			Quizzes = keyboard.next();
		
		if (Quizzes.equalsIgnoreCase("y") || (Quizzes.equalsIgnoreCase("yes"))) {
			System.out.print("Average Quiz Grade:");
			Quizzesg = keyboard.nextDouble();}
		else {
			Quizzesg = 0;
		}
		
		double forma, formb, formc, formd, forme, formf, formg, currentScore, total2;
		//weight1, weight2, weight3, weight4, weight5 , weight6, weight7;
		forma = (exam1 * Exam1g); 
		//weight1 = forma;
		formb = (exam2 * Exam2g);  
		//weight2 = formb;
		formc =	(finalExam * finalexamg); 
		//weight3 = formc;
		formd =	(labs * Labsg);  
		//weight4 = formd;
		forme =	(projects * Projectsg); 
		//weight5 = forme;
		formf =	(participation * Participating); 
		//weight6 = formf;
		formg =	(quizzes * Quizzesg);
		//weight7 = formg;
		total2 = (exam1 + exam2 + finalExam + labs + projects
				+ participation + quizzes);
		currentScore = (forma + formb + formc + formd + forme + formf + formg)
				/total2;
		//problem is the weights not adding up correctly due to the top variables 
		//so figure out formula to add weights correctly for denominator

		if (total2 <= 100) {
		System.out.println("Current Grade Score:" + currentScore);
		}
		
		if (currentScore <= 100 && currentScore >= 90) {
			System.out.println("Your current letter grade is a A");
			}
		else if (currentScore <= 80 && currentScore >= 89) {
			System.out.println("Your current letter grade is a B");
		}
		else if (currentScore <= 70 && currentScore >= 79) {
			System.out.println("Your current letter grade is a C ");
		}
		else if (currentScore <= 60 && currentScore >=69) {
			System.out.println("Your current letter grade is a D");
		}
		else if (currentScore < 60)
			System.out.println("Your current letter grade is a F");
	}
		
		//The weights equal zero at first because if they dont know then it will be inputted as 
		//0 so dont stress about that you alreadyy figured it out. just worry about the last formula
		//and writing the last sentence because everything else is fine.
		
		
		
		
		}

		
		
			
			
			
			
		
			
		
		
		
		
		
		//Exam2 = "Do you know your Exam 2 score?";
		//finalexam= "Do you know your Final Exam score?";
		//Labs = "Do you know your lab average?";
		//Projects = "Do you know your project average?";
		//Participation = "Do you know your participation average?";
		//Quizzes = "Do you know your quiz average?";
		
		
		
		
		

	

