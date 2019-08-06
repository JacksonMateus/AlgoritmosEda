package algoritmos;

public class BuscaBinariaInterativa {
	public static void main(String[] args) {
		int[] v = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(buscaBinaria(v,4));
	
		
	}

	private static int buscaBinaria(int[] v, int e) {
		int inicio=0;
		int fim = v.length-1;
		int meio;
		
		while(fim >= inicio) {
			meio = (inicio + fim)/2;
			if (v[meio] == e)
				return meio;
			else if(e > v[meio])
				inicio = meio + 1; 
			else if(e < v[meio])
				fim = meio -1;}
		return -1;
			
			
			
			
		}
		
		
		
		
	
	}
	


