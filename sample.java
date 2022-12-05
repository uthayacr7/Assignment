package sample1;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner inputData=new Scanner(System.in);

System.out.println("enter a sentence(any English sentence)");
String sentence=inputData.nextLine();
System.out.println("Enter a Letter(any letter from A to Z)");
String letter = inputData.next();

System.out.println("Answer is :");
int index=sentence.indexOf(letter);

if(index== -1) {
	System.out.println("The letter does not exist in the sentence");
	
}
else {
	System.out.println(sentence.substring(index+1));
}

	}

}
