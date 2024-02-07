import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();	// 문서
		String word = scan.nextLine();	// 검색하고 싶은 단어
		int count = 0;	// 단어가 중복되지않고 등장하는 횟수
		int index = 0;	// 문서에서 검색할 단어를 찾을 때 시작할 인덱스의 값
         
		for(int i=index; i<=str.length() - word.length(); i++) {
			boolean flag = true;	// 중복된 단어 등장하는지 판별
			for(int j=0; j<word.length(); j++) {
				
				// 문서와 검색하려는 단어가 다를경우
				if(str.charAt(i+j) != word.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			/*
			 * 문서와 검색하는 단어가 같을 경우
			 *  - 등장 횟수 +1
			 *  - 다음 등장하는 횟수를 찾기위해 인덱스를 문서의 길이만큼 더한다.
			 */
			if(flag) {
				count ++;	
				index += word.length();
				i = index-1;
			}
			// 문서와 검색하는 단어가 다를 경우
			// 바로 다음 알파벳부터 탐색하면 되므로 인덱스를 +1 한다.
			else {
				index ++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}