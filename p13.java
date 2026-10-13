/*
  * * * * * * *
    * * * * *
      * * *
        *
*/
class Pattern13{
	public static void main(String args[]){
		for(int i=4;i>=1;i--){
			for(int j=1;j<4*2;j++){
				if((i+j)>4 && (j-i)<4){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}