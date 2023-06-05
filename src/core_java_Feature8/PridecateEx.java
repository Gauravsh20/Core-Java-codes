package core_java_Feature8;

import java.util.function.Predicate;

public class PridecateEx {
	public static void main(String[] args) {
		
		Predicate<Integer> pi= i->i%2==0;
//		Predicate<Employee> pe=e->e.salary>10000 && e.isHavingGf="True";
		Predicate<String>st=s->s.length()>5;
		
		System.out.println(pi.test(10));
		System.out.println(pi.test(11));
	}

}
