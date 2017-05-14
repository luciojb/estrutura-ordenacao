package searches;

public class PesquisaSequencial {
	public static int buscaSequencial(int[] v, int num){
		int quantidade=0;
		for (int n : v){
			if (n==num){
				quantidade++;
			}
			
		}
		return quantidade;
	}
}
