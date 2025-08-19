import java.util.Scanner;
class Insurance {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the Marital status (M/U):");
 char Marital = in.next().charAt(0);
 
 if (Marital == 'u' || Marital == 'U') {
 System.out.println("Enter the Gender (M/F):");
 char Gender = in.next().charAt(0);
 System.out.println("Enter the Age:");
 int Age = in.nextInt();
 
 if ((Gender == 'M' || Gender == 'm') && Age >= 30) {
 System.out.println("You are Eligible for Insurance");
 } else if ((Gender == 'F' || Gender == 'f') && Age >= 25) {
 System.out.println("You are Eligible for Insurance");
 } else {
 System.out.println("You are not Eligible for insurance");