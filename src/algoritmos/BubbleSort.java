package algoritmos;

public class BubbleSort {
	
		static long startBubble = System.currentTimeMillis(); 

		private static void bubbleSort(int[] vetor) {

			int aux;			
			for (int i=0;i< vetor.length;i++) {
				for (int j=0;j< (vetor.length-1);j++) {
					if (vetor[j] > vetor[j+1]) {
						aux=vetor[j];
						vetor[j]=vetor[j+1];
						vetor[j+1] = aux; } } } 
			}
		
		public static void main(String[] args) {
			int vetor[] = {3,6,2,8,4};
			bubbleSort(vetor);
			
			
		}
		
		

	

}
