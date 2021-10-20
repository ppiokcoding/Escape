package Escape;

public class Escape {

	public static void main(String[] args) {

		// 특수 문자 > Escape Sequence
		// - 컴파일러가 번역을 할 때, 미리 약속된 표현을 만나면 그 표현을 약속에 따라 처리 후 번역하는 구성 요소
		// - 자료형: char

		// 문자열 리터럴안에는 엔터를 작성할 수 없다.

		// 1. \n
		// - new line, line feed
		// - 개행 문자
		// - 실행 중에 '\n'를 만나면 엔터를 쳐라
		String str = "안녕하세요. \n김수한무입니다";
		System.out.println(str);

		String str1 = "안녕하세요";
		String str2 = "홍길동입니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();

		// 2. \r
		// - carrage return
		// - 캐럿(커서)의 위치를 현재 라인이 맨앞(첫번째 열)로 이동해라
		// - Home 키 동작
		// - 이클립스 콘솔에서 확인 불가능
		str = "안녕하세요. \r홍길동";

		// 홍길동세요. consol 환경은 덮어쓰기가 기본임 그래서 홍길동세요.가 나옴
		System.out.println(str);

		// 3. \t
		// - 탭문자, Tab
		// - 탭용도? > 서식 작업(열 맞추기)
		// - 탭이 뭡니까?
		// - 행동(X) -> 지표(O), 표지판~
		// - 탭문자 편집기, 출력환경에 따라 달라짐(2~8칸)

		str = "하나\t\t둘\t셋\t넷";
		System.out.println(str);

		str = "하나		둘	셋	넷";
		System.out.println(str); // 직접 tab을 입력하는 건 권장하지 않음

		// 4. \b
		// - Backspace
		str = "홍길동\b입니다."; // 홍길입니다.
		System.out.println(str);

		// 5. \", \', \\
		// - escpae 문자

		// 요구사항] 화면 > "홍길동" : 안녕하세요.
		str = "\"홍길동\" : 안녕하세요.";
		System.out.println(str);

		// 요구사항] 현재 수업중인 폴더의 경로를 출력하세요.
		// D:\class\java

		String path = "D:\\class\\java";
		System.out.println("수업 폴더: " + path);

		//****정리*****
		// \n, \r, \t, \b, \", \', \\

		
		//-----------------------------------------
		// 대부분 편집기 > 엔터키를 누르다. > "\r\n"
		// 운영체제(os)
		// 1. 윈도우: \r\n or \n
		// 2. 맥os: \r
		// 3. 리눅스: \n
		
		// 서버환경 > 리눅스
		// 개발환경 > 윈도우 or 맥
		
		// 윈도우
		// 윈도우 + 리눅스(터미널 사용법 - (셸) 명령어)
		// 맥 + 리눅스
		//-----------------------------------------

	
	}// main

}
