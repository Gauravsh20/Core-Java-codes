package com_Feature8_lambdaDemo;

public class LambdaEx2 {
	public static void main(String[] args) {
		Runnable r=()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Class");
			}
		};
		Thread td=new Thread(r);
		td.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Class");
		}
	}

}
