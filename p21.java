import java.util.*;
class LargestNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int max = largestNum(num);
		System.out.println(max);
	}
	public static int largestNum(int num){
		int max = 0;
		while(num!=0){
			int rem = num%10;
			if(rem > max){
				max = rem;
			}
			num/=10;

		}
		return max;
	}
}