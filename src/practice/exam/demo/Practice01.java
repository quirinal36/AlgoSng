package practice.exam.demo;

/**
 * 
 * for �ݺ���
 * while �ݺ���
 * if �񱳹�
 * �񱳿����� <=, ==,
 *   
 * @author leehg
 *
 */
public class Practice01 {

	public static void main(String[] args) {
		int su; // 1~500 ���� 1�� �����ϴ� ���� ����Ǵ� ����
		int cnt; // �ڽ��� ������ ����� ���� �ڽŰ� ���� ���� ������ ���ϴ� ����
		int rem; // �������� �����ϴ� ����
		int k,j; // ��� ó���� ���� ����
		int sum; // ������� ���� ���ϴ� ����
		
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
				System.out.println("SU : " + su); // ��� SU	
			}
		}
		System.out.println("CNT : " + cnt); // ��� CNT
	}

}
