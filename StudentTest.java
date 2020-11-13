package edu2;
import java.util.Scanner;
public class StudentTest {
	
	public static void stipendianti(Student students[]) {
		for(Student s:students) {
		if(s.stipendiq(s)) {
			System.out.println(s.ime);
		}	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student[] students = new Student[5];
		for(int i=0; i<5;i++) {
			System.out.println("Insert name");
			String name=sc.nextLine();
			System.out.println("insert grade");
			double grade=sc.nextDouble();
			sc.nextLine();
			students[i]=new Student(name,grade);
		}
		stipendianti(students);
	}

}
