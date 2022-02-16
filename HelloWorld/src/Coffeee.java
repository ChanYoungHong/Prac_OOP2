import java.util.Arrays;

// 하나의 소스파일에는 하나의 public class만 허용
import java.util.*;



//public class Coffeee {
//
//	public static void main(String[] args) {
		
			
		

class Coffeee {
	public static void main(String[] args) {
				String s = "abcdefg";
		        String answer[] = s.split(""); 
		        

		        for(int i=0; i<answer.length; i++) {
		        	System.out.println(answer[i]);
		        }
		    }
		}

		// // 1. 문자열 배열의 인덱스별로 각 문자를 저장.
//		         String answer[] = s.split("");

//		         // 2. 출력을 위한 변수
//		         String str="";

//		         // 3. Arrays.sort()메소드의 Collections.reverseOrder()메소드를 사용해 역순정렬.
//		         Arrays.sort(answer,Collections.reverseOrder());

//		         // 4. 출력 데이터 생성.
//		         for(int i=0;i<answer.length;i++){
//		             str+=answer[i];
//		         }

//		         return str;
		
