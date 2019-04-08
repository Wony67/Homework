package homeWork;

public class quest09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]=new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int num=(int)(Math.random()*10+1);				
				intArray[i][j]=num;				
				System.out.print(intArray[i][j]+"\t");
			}
			System.out.println();
		}
	}
}