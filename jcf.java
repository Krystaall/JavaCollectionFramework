package jcf;
import java.util.*;

class Student{
	int rn;          //RN= ROLL NUMBER
	String name;
	
	Student(){
		
	}
	Student(int RollNo, String n){
		rn= RollNo;
		name=n;
		
	}
	Scanner sc= new Scanner(System.in);
	
	void accept() {	
		System.out.println("Name: ");
		name= sc.nextLine();
		System.out.println("Roll no.: ");
		rn= sc.nextInt();
	}
	void display() {
			System.out.println("Name: "+name+",  Roll no.: "+rn);
			
		}
	}



public class jcf {
	public static void main(String[] args) {
		int ch;
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("**DATATYPES**");         //menu
		System.out.println("1. Integer \n2. String \n3. Student Class \n4.EXIT");
		System.out.println("Enter a choice");
		ch= sc.nextInt();
		
		switch(ch) {
		
	case 1:   //add element
		  int n,e;
		  ArrayList<Integer> i = new ArrayList<Integer>();   
		  do {
			System.out.println("1. Add element \n2. Remove element \n3. EXIT \nEnter a choice");
			n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("Enter the element to be added");
				e=sc.nextInt();
				i.add(e);
				System.out.println(i);
				System.out.println("\nSize: "+i.size());		
			break;
			
			case 2:   //remove element by index
				int x;
				System.out.println("Enter the index of the element to be removed: ");
				x=sc.nextInt();
				if(i.size()!=0) {    
				i.remove(x);
				System.out.println(i);
     			System.out.println("\nSize: "+i.size());
				}
				else {
					System.out.println("Arraylist is empty");
				}
			break;
			
			case 3:
				System.out.println("EXIT");
			break;
			
			default:
				System.out.println("Invalid choice");
			break;
				
			}
			}while(n!=3);
			
			break;
			
			
			
	case 2:   //for string datatype
			int s1;
			String s2;
			ArrayList<String> s = new ArrayList<String>();
			do {
			System.out.println("1. Add element \n2. Remove element \n3. EXIT \nEnter a choice");
			s1=sc.nextInt();
			sc.nextLine();	     //after int for string input
			switch(s1) {
			case 1:  //add string element
			
				System.out.println("Enter the string to be added");
				s2=sc.nextLine();
				s.add(s2);
				System.out.println(s);
				System.out.println("\nSize: "+s.size());
			break;
			case 2:  //remove
				int x;
				System.out.println("Enter the index of the string to be removed: ");
				x=sc.nextInt();
				if(s.size()!=0) {
				s.remove(x);
				System.out.println(s);
     			System.out.println("\nSize: "+s.size());
				}
				else {
					System.out.println("Array already empty");
				}
			break;
			case 3:System.out.println("EXIT");
			break;
			default:
			System.out.println("Invalid choice");
			break;
			}
			}while(s1!=3);
			break;
			
	case 3:   //for student class
			int w,no;
			ArrayList<Student> stu = new ArrayList<Student>();
			do {	
			System.out.println("1. Add element \n2. Remove element \n3. EXIT \nEnter a choice");
			w=sc.nextInt();
			
			switch(w) {
			case 1:   //add elements
				System.out.println("Enter the element to be inserted");
				Student y= new Student();
				y.accept();
				stu.add(y);
				System.out.println("ELEMENT ADDED");
				Iterator<Student> it=stu.iterator();
				while(it.hasNext()) {
					Student next_student=it.next();
					next_student.display();
				}
				System.out.println("\nSize: "+stu.size());
				break;
			case 2:   //remove
				Student y1= new Student();
				System.out.println("Enter the index of the element to be removed");
				int index=sc.nextInt();
				stu.remove(index);
				System.out.println("REMOVED");
				Iterator<Student> it1=stu.iterator();
				while(it1.hasNext()) {
					Student next_student=it1.next();
					next_student.display();
				}
			
			case 3:
			System.out.println("EXIT ");
			break;
			
			default:
			System.out.println("Invalid choice");
			break;
			}
			}while(w!=3);
    	 break;
    	 
    	 
	 case 4:
			System.out.println("EXIT");
	   break;
	
	
	 default:
			System.out.println("Enter a valid choice");
	   break;
			}
		}while(ch!=4);
	
	}
	
	}





