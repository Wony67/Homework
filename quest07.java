package homeWork;

public class quest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int intArray[]=new int[10];
		
		System.out.print("·£´ýÇÑ Á¤¼öµé :");
		for(int i=0; i<10; i++) {
			int num=(int)(Math.random()*10+1);
			intArray[i]=num;
			System.out.print(intArray[i]+" ");
			sum+=intArray[i];
		}
		System.out.println();
		System.out.println("Æò±ÕÀº "+(double)sum/10);
	}

}
