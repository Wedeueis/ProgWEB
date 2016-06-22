
public class Caixa {
	Caixa(int id) {
		this.id = id;
	}
	static private int senha;
	private int id;
	
	void chamaProximoFila() {
		senha++;
		System.out.println("senha: " + senha + " caixa: " + id);
	}
	
}
