package com_Feature8_lambdaDemo;
interface LembdDemo1{
	public void m1(String name) ;
}
public class LambdaEx3 {
	public static void main(String[] args) {	
		LembdDemo1 l1=(name)->
			System.out.println("Hello "+name);
			l1.m1("Ram");
	}
}
