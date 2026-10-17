import java.util.*;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		Factorial(num1);
	}
	public static void Factorial(int num){
		for(int i=1;i<=num;i++){
			if(num%i == 0){
				System.out.println("Factorial of"+num+":"+i);
			}
		}
	}
}