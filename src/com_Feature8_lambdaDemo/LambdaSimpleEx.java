package com_Feature8_lambdaDemo;

interface LambdSimple{
	public void Display();
}
public class LambdaSimpleEx {
	public static void main(String[] args) {
//		LambdSimple ls=new LambdSimple() {
//			public void Display() {
//				System.out.println("WithoutLambda Simple Example");
//			}
//		};
	
		LambdSimple ls=()->{
			System.out.println("With Lambda Expression");
		};
		
		System.out.println("Hello");
		ls.Display();
	}

}
