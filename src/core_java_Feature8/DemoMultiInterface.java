package core_java_Feature8;


interface Inter1{
	void D1();
	
}
interface Inter2 extends Inter1{
	void D1();
}

class Inter3 implements Inter1,Inter2{

	@Override
	public void D1() {
		System.out.println("Class Implements");
		
	}
	
}
public class DemoMultiInterface {
	public static void main(String[] args) {
		Inter1 i1=new Inter1() {
			
			@Override
			public void D1() {
				System.out.println("Parent Interface");
				
			}
		};
		
		Inter1 i4=new Inter3();
		Inter2 i5=new Inter3();
		i4.D1();
		i1.D1();
		i5.D1();
		
		
	}

}
