package homeWork;

public class quest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<100; i++) {
			int n10=i/10;
			int n1=i%10;
			int count=0;
			
			if((n10 != 0) && (n10%3 == 0))
				count++;
			if((n1 != 0) && (n1%3 == 0))
				count++;
			
			if(count == 1)
			System.out.println(i+" ¹Ú¼ö Â¦");
			if(count == 2)
				System.out.println(i+" ¹Ú¼ö Â¦Â¦");
		}
	}

}
