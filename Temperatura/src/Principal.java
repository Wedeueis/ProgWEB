
public class Principal {
	public static void main(String[] args) {
		double tempI, tempF;
		tempI = 25.0;
		tempF = ConversaoDeTemperatura.cToF(tempI);
		System.out.printf("Temperatura em Celsius: %.2f", tempI);
		System.out.println();
		System.out.printf("Temperatura convertida em Fahrenheit: %.2f", tempF);
		System.out.println();
		System.out.println();
		tempI = 25.0;
		tempF = ConversaoDeTemperatura.cToK(tempI);
		System.out.printf("Temperatura em Celsius: %.2f", tempI);
		System.out.println();
		System.out.printf("Temperatura convertida em Kelvin: %.2f", tempF);
		System.out.println();
		System.out.println();
		tempI = 100;
		tempF = ConversaoDeTemperatura.fToC(tempI);
		System.out.printf("Temperatura em Fahrenheit: %.2f", tempI);
		System.out.println();
		System.out.printf("Temperatura convertida para Celsius: %.2f", tempF);
		System.out.println();
		System.out.println();
		tempI = 100;
		tempF = ConversaoDeTemperatura.fToK(tempI);
		System.out.printf("Temperatura em Fahrenheit: %.2f", tempI);
		System.out.println();
		System.out.printf("Temperatura convertida para Kelvin: %.2f", tempF);
		System.out.println();
		System.out.println();
		tempI = 300;
		tempF = ConversaoDeTemperatura.kToC(tempI);
		System.out.printf("Temperatura em Kelvin: %.2f", tempI);
		System.out.println();
		System.out.printf("Temperatura convertida para Celsius: %.2f", tempF);
		System.out.println();
		System.out.println();
		tempI = 300;
		tempF = ConversaoDeTemperatura.kToF(tempI);
		System.out.printf("Temperatura em Kelvin: %.2f", tempI);
		System.out.println();
		System.out.printf("Temperatura convertida para Fahrenheit: %.2f", tempF);
		System.out.println();
		System.out.println();
		
	}
}
