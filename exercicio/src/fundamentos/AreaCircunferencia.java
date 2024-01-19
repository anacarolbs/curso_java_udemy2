package fundamentos;

public class AreaCircunferencia {
	
	public static void main (String[] args) {
		//System.out.println(2 + 3);
		//double = real
		double raio = 3.4;
		//final = valor nao pode ser atruido novamente, ou seja, vai permanecer o mesmo do inicio
		//pela convencao, nomes de constantes sao em maiusculo
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2.");
	}
}	

