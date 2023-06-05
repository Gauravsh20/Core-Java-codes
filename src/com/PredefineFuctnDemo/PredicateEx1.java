package com.PredefineFuctnDemo;

import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[] args) {
		String[] s={"Gaurav","Rajesh","Suresh","Rohan","Ram","Shayam"};
		Predicate<String>p=s1->s1.length()>5;
		for(String st:s) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}
		
	}

}
