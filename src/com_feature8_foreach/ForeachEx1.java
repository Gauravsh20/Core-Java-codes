package com_feature8_foreach;

import java.util.ArrayList;
import java.util.List;

public class ForeachEx1 {
	public static void main(String[] args) {
		List l1=new ArrayList<>();
		l1.add(12);
		l1.add(13);
		l1.add(1);
		l1.add(12);
		l1.add(15);
		System.out.println(l1);
		l1.forEach(Demo->System.out.println(Demo));
		
		
	}

}
