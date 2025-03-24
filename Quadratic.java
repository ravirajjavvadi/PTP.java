import java.util.Scanner;
class Quadratic{
       public static void main(String...args){
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter coefficents a, b, c:");
		    int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			double d = Math.sqrt((b*b)-(4*a*c));
			
			if(d>0){
			   
               System.out.println((-b+d)/2*a);			      
			   System.out.println((-b-d)/2*a);
			   
			}
			else{
			  System.out.println("It is equal");
			}
			
		}
}
