package practice.exam.demo;

/**
 * 
 * for 반복문
 * while 반복문
 * if 비교문
 * 비교연산자 <=, ==,
 *   
 * @author leehg
 *
 */
public class Practice01 {

	public static void main(String[] args) {
		int su; // 1~500 까지 1씩 증가하는 값이 저장되는 변수
		int cnt; // 자신을 제외한 약수의 합이 자신과 같은 수의 개수를 구하는 변수
		int rem; // 나머지를 저장하는 변수
		int k,j; // 계산 처리를 위한 변수
		int sum; // 약수들의 합을 구하는 변수
		
		cnt = 0;
		rem = 0;
		
		for(su = 1; su<500 ; su++){ 
			sum=0;
			k=su/2;
			
			j=1;
			while(j <= k){
				rem = su - (su/j)*j;
				if(rem == 0){
					sum = sum + j;
				}
				j++;
			}
			if(su == sum){
				cnt++;
				System.out.println("SU : " + su); // 출력 SU	
			}
		}
		System.out.println("CNT : " + cnt); // 출력 CNT
	}

}
