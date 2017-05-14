package sorts;

public class MergeSort {
	
	public static void ordena(int[] vetor, int inicio, int fim){
		int meio;
		if(inicio<fim){
			meio=(inicio+fim)/2;
			ordena(vetor, inicio, meio);
			ordena(vetor, meio+1, fim);
			intercala(vetor, inicio, meio, fim);
		}
	}
	
	public static void intercala(int[] vetor, int inicio, int meio, int fim){
		int aux[] = new int[vetor.length];
		for(int i=inicio; i<=meio; i++){
			aux[i] = vetor[i];
		}
		
		for(int j=meio+1; j<=fim; j++){
			aux[fim+meio+1-j] = vetor[j];
		}
		int i=inicio;
		int j=fim;
		for(int k=inicio; k<=fim; k++){
			if(aux[i]<=aux[j]){
				vetor[k]=aux[i];
				i++;
			} else{
				vetor[k]=aux[j];
				j--;
			}
		}
	}
}
