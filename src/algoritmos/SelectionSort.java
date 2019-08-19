package algoritmos;

public class SelectionSort {

	public static void main(String[] args) {

		
	}
	
	public static void selectionSort(int[] v) {
		for(int fixo = 0;fixo < v.length-1;fixo++) {
			int menor = fixo;
			for (int i = menor + 1; i < v.length;i++) {
				if (v[menor] > v[i]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int aux = v[fixo];
				v[fixo] = v[menor];
				v[menor] = aux;
				
			}
		}
	}

}
