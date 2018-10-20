package practice.exam.demo;

/**
 * ¹è¿­ÀÇ index
 * 
 * @author leehg
 *
 */
public class Practice03 {

	public static void main(String[] args) {
		int A[] = {3,8,9,20,25};
		int B[] = {2,5,10,21,26};
		int T[] = new int[10];
		
		int J,K,L;
		J=0;K=0;L=0;
		
		for(;J<10 ; J++){
			if(K >=5 && L>=5){
				break;
			}else if(K >= 5 && L<5){
				while(L<5){
					T[J] = B[L++];
				}
				break;
			}else if(K<5 && L>=5){
				while(K<5){
					T[J] = A[K++];
				}
				break;
			}
			
			System.out.println("K: " + K +"L: " + L +"J: " + J);
			
			if(A[K] <= B[L]){
				T[J] = A[K];
				K++;
			}else{
				T[J] = B[L];
				L++;
			}
		}
		
		for(int i=0; i<T.length; i++){
			System.out.print(T[i] + " ");
		}
	}

}
