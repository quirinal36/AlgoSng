package practice.exam.demo;

import javax.swing.JOptionPane;

/**
 * char 배열 (배열의 index 는 0부터 시작한다.)
 * 
 * % 나머지 연산자
 * 값을 입력받기, 숫자로 변경하기
 * 
 * @author leehg
 *
 */
public class Practice02 {

	public static void main(String[] args) {
		int k, i, M;
		char []A = {'0','1','2','3','4','5','6','7','8','9'};
		char []S = new char[11];
		
		k=0; i=0;
		M = Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
		
		while(M != 0){
			if((i+1) % 4 == 0){
				S[i] = ',';
			}else{
				k = M%10;
				S[i] = A[k];
				M /= 10;
			}
//			System.out.println("M: " + M +"/i:"+i+"/S[i]:"+S[i]);
			i++;
		}

		i=i-1;
		while(i >= 0){
			System.out.print(S[i]);
			i--;
		}
	}

}
