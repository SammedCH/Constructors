package constructorOverloading;

public class A {
	A(){
		System.out.println(100);
	}
	A(int x){
		System.out.println(x);
	}
	A(String y){
	System.out.println(y);	
	}

	public static void main(String[] args) {
      A a1=new A();
      A a2=new A(10);
      A a3=new A("Sam");
	}

}
