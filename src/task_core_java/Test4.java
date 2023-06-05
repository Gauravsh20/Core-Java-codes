package task_core_java;
abstract class Demo6{
	public abstract void m1();
}

class SimpleDemo extends Demo6{
	public void m1() {
		System.out.println("Hello...!");	
	}
	
}

public class Test4 {
	public static void main(String[] args) {
		Demo6 d1=new SimpleDemo();
		d1.m1();

	}
}
