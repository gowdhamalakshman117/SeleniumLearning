package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Calculator obj = new Calculator();
		
		int add = obj.add(40, 89, 306);
		System.out.println(add);
		
		int substract = obj.substract(78, 756);
		System.out.println(substract);
		
		double multiplay = obj.multiplay(56.398, 89.3695);
		System.out.println(multiplay);
		
		float divide = obj.divide(5.63339f, 8.3697f);
		System.out.println(divide);

	}

}
