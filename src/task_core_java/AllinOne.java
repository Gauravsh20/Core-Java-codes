package task_core_java;

abstract class Student{
	private String name;
	private String ROllno;
	public Student(String name,String Rollno) {
		this.name=name;
		this.ROllno=Rollno;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getROllno() {
		return ROllno;
	}
	public void setROllno(String rOllno) {
		ROllno = rOllno;
	}
	public String Display(){
		return "Student Name -"+ this.name +"\n"+"Student Rollno-"+ this.ROllno;
	}
	
}

class College extends Student{
	private double fees;
	
	public College(String name,String RollNo,double fees) {
		super(name,RollNo);
		this.fees=fees;
		
	}
	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public String Display(){
		return "College Student Name : "+ getName() +"\n"+"Student Roll_no : "+ getROllno()+"\nFees : "+ this.fees;
		
	}
	
	
}

class School extends Student{

	private double Sfees;

	public double getSfees() {
		return Sfees;
	}

	public void setSfees(double sfees) {
		Sfees = sfees;
	}

	public School(String name, String Rollno,double Fees) {
		super(name, Rollno);
		this.Sfees=Fees;
		
	}
	
	public String Display(){
		return "School Student Name : "+ getName() +"\n"+"Student Roll_no : "+ getROllno()+"\nSFees : "+ this.Sfees;
		
	}
	
}
public class AllinOne {
	
	public static void main(String[] args) {
		Student st1=new College("Gaurav","S001",122001.1);
		Student st2=new College("Sourbh","S002",120001.1);
		Student st3=new School("Rajesh","S003",1200.1);
		System.out.println(st1.Display());
		System.out.println(st2.Display());
		System.out.println(st3.Display());
		
		
	}
	

}
