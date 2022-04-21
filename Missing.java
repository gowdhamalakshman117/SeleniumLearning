package week1.day2;

public class Missing {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,7,6,8};
                Arrays.sort(a);

		
		for (int i=a[0]; i<a.length; i++)
                {
                       if(i!=a[i-1])
                       { 
                        System.out.println(i);
                        break;
                       }
		}
		

	}

}
