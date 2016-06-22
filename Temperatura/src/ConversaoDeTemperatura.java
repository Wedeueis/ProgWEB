
public class ConversaoDeTemperatura {
	static double cToF(double valor) {
		return  (9.0/5.0)*valor + 32;
 	}
	
	static double cToK(double valor) {
		return  valor + 273.15;
 	}
	
	static double fToC(double valor) {
		return  (5.0/9.0)*(valor - 32);
 	}
	
	static double kToC(double valor) {
		return  valor - 273.15;
 	}
	
	static double fToK(double valor) {
		return  (5.0/9.0)*(valor + 459.67);
 	}
	
	static double kToF(double valor) {
		return  (9.0/5.0)*valor - 459.67;
 	}
}
