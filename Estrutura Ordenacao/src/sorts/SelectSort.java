package sorts;

public class SelectSort {
	public static int[] ordenar(int[] vetor){
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				if(vetor[j]<vetor[MIN]){
					int auxiliar = vetor[MIN];
					vetor[MIN] = vetor[j];
					vetor[j] = auxiliar;
					System.out.println("Entrou em "+j);
				}
			}
			System.out.println("Min ="+MIN);
		}
		return vetor;
	}
	
	public static int[] ordenarProfessor(int[] vetor){
		final int MAX = vetor.length;
		for(int i=0;i<MAX-1;i++){
			int MIN = i;
			for(int j=MIN+1; j<MAX; j++){
				if(vetor[j]<vetor[MIN]){
					MIN = j;
					System.out.println("Entrou em "+j);
				}
			}
			int auxiliar = vetor[i];
			vetor[i] = vetor[MIN];
			vetor[MIN] = auxiliar;
			System.out.println("Min ="+MIN);
		}
		return vetor;
	}
}
