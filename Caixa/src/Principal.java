
public class Principal {

	public static void main(String[] args) {
		Caixa[] caixas = new Caixa[5];
		for(int i=0;i<5;i++)
			caixas[i] = new Caixa(i+1);
		
		caixas[1].chamaProximoFila();
		caixas[2].chamaProximoFila();
		caixas[0].chamaProximoFila();
		caixas[4].chamaProximoFila();
		caixas[3].chamaProximoFila();
		caixas[4].chamaProximoFila();
		caixas[1].chamaProximoFila();
	}

}
