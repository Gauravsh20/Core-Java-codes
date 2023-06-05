package com_Feature8_lambdaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaEx1 {
	@SuppressWarnings("unchecked")
public static void main(String[] args) {
		List list=new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(44);
		list.add(1);
		list.add(2);
		System.out.println(list);
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return (o1<o2)?1:(o1>o2)?-1:0;
//			}
//		});
		
//		Lambda Expression implements
		Collections.sort(list,(o1,o2)->{
			  return -((Integer) o1).compareTo((Integer) o2);  
		});	
		System.out.println(list);
	}

}
