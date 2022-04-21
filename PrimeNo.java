package week1.day1;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12,b=6,c;
		boolean d=false;
		
		for (int i = 2; i < b; i++) {
			
			c=a%i;
			if (c == 0) {
				d=true;
				break;
			}
		}
		if (d==false)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
