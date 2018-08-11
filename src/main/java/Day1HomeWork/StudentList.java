package Day1HomeWork;

import java.util.Scanner;

public class StudentList {

	public static void main(String[] args)
	{
		String[] name = {"Baravi","Mani","Ram","Sam","shankar"};
		int[] age = {28,24,25,22,40};
		char[][] grades = {{'A','B','C','D','E'},
							{'A','A','A','A','A'},
							{'A','A','A','A','A'},
							{'A','A','A','A','A'},
							{'A','A','A','A','A'}};

		
		System.out.println("Enter the number of the student 1 to 5");
		
//Getting User input
		
		Scanner std = new Scanner(System.in);
		int studentNumber = std.nextInt();
		System.out.println(studentNumber);
		studentNumber = studentNumber-1;

//To print all the Student List

		for(int i=0;i<5;i++)
		{
			System.out.println(name[i] + " whos is " + age[i] + " scored " + grades[i][0] + "," +grades[i][1] +"," +grades[i][2] +","+grades[i][3] + ","+grades[i][4]);
		}

//To print student list based on the user inputs

		System.out.println(name[studentNumber] + " who is" + age[studentNumber] + " scorred" + grades[studentNumber][0] + grades[studentNumber][1] +grades[studentNumber][2] +grades[studentNumber][3] +grades[studentNumber][4]);

	}

}

