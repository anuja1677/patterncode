import java.util.Scanner;
class Pattern17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=num;i++){
			sum = sum+num;
		}
		System.out.println(sum);
	}
}