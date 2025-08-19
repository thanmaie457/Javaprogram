import java.util.Scanner;
class Mobile{
	String Mobilename;
	String Model;
    static float price;
    public void show(){
         Scanner sc=new Scanner(System.in);
         System.out.println("how many mobiles data needed to enter:");
        int n =sc.nextInt();
       for(int i=1;i<=3;i++){
            System.out.println("enter the Mobile name");
            Mobilename=sc.next();
           System.out.println("enter the model");
           Model=sc.next();
           System.out.println("enter theprice:");
           price=sc.nextFloat();
           System.out.println("Mobile_Name:"+Mobilename);
          System.out.println("Model:"+Model);
          System.out.println("price:"+price);
	   }
    }
}
public class method{
	public static void main(String[]args){
  Mobile ob1= new Mobile();
  ob1.show();	
	}
}