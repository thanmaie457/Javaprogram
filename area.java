class rectangle{
	int length,width;
	void getdetails(int x,int y){
		length=x;
		width=y;
	}
	int area(){
		int a=length*width;
		return a;
	}
}
	public class area {
	public static void main(String[] args) {
		rectangle o1=new rectangle();
		o1.length=20;
		o1.width=30;
		System.out.println("Area of rectangle:"+o1.a);
	}
}