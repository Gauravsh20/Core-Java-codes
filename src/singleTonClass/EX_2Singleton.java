package singleTonClass;

public class EX_2Singleton {
	
	private static EX_2Singleton ex_2Singleton=null;
	   // Static variable reference of single_instance
    	// of type Singleton
		public String s;;
		
		private EX_2Singleton(){
			s="hello1";
		}
		
		private static synchronized EX_2Singleton getmethod() {
			
			if(ex_2Singleton==null) {
				ex_2Singleton=new EX_2Singleton();
				
			}
			return ex_2Singleton;
		}
		
		public static void main(String[] args) {
			EX_2Singleton Ex1=ex_2Singleton.getmethod();
			EX_2Singleton Ex2=ex_2Singleton.getmethod();
			EX_2Singleton Ex3=ex_2Singleton.getmethod();
			System.out.println(Ex1.s);
			System.out.println(Ex1.hashCode()+""+Ex1.s);
			System.out.println(Ex2.hashCode()+""+Ex2.s);
			System.out.println(Ex3.hashCode());
		}

}
