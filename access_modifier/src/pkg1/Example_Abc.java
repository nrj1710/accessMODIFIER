package pkg1;

public class Example_Abc {
	
	
private int x=100;
private String str1= "Ramesh";
int d=90;

public static void main(String[] args) {
	Example_Abc a1 =new Example_Abc();
	a1.prvtTest1();
	System.out.println(a1.x);
	System.out.println(a1.str1);
}
private void prvtTest1() {
	System.out.println("Private Method");
}
 void defTest2() {
	System.out.println("default method");
}

}
