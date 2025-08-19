class calculator{
 public int add(int a, int b) {
 return a + b;
 }
 public int add(int a, int b, int c) {
 return a + b + c;
 }
 public double add(double a, double b) {
 return a + b;
 }
 public String add(String a, String b) {
 return a + b;
 }
}
public class OverloadingExample {
	public static void main(String[] args) {
		calculator cal =new calculator ();
		System.println("Two ints:"+cal.add(5,3));
		System.out.println("Three ints:"+cal.add(5,3,2));
		System.out.println("Two doubles:"+cal.add(5.5,3.3));
		System.out.println("Two strings:"+cal.add("Hello","World" + 
		                   ""));
	}
}