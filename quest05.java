package homeWork;

public class quest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray=new int[10];
		
		System.out.print("3�� ����� ");
		for(int i=0; i<10; i++) {
		double num=Math.random()*10000+1;
		intArray[i]=(int)num;
		
		if(intArray[i]%3==0) {
			System.out.print(intArray[i]+" ");
		}
		}
		
	}

}
