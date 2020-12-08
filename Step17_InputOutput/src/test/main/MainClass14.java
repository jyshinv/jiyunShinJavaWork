package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 * Maind c:/myFolder/memo.txt 파일에 저장된 문자열을 읽어와서 콘솔창에 출력하는 코드를 작성해 보세요. hint ->
		 * 방법1 : new FileReader() -->이 객체의 read() 메소느는 한문자만 읽기 가능 hint -> 방법2 : new
		 * BufferedReader() --> 이 객체의 read() 메소드는 개행기호가 나올때까지 읽음, 즉 한줄 읽기 가능
		 */

		// 1. 파일 객체를 생성한다.
		File f = new File("c:/myFolder/memo.txt");

		try {

			FileReader fr = new FileReader(f); //-> 단독으로 쓰면 빨간줄 뜬다.커서 대고 surround with try/catch
			BufferedReader br = new BufferedReader(fr);

			// step01)
			// 아래 2줄의 코드를 무한 루프에서 수행하다가
			//readLine() 메소드가 null을 리턴하면 반복문 탈출 하게 만들어보자
			//또 알아둘 것, br.readline() 단독으로 쓰면 빨간줄 뜬다 
			//이때는 커서 대고 add catch clause to surroungding try
			//(try/catch문이 새로 생성되는 것이 아닌 catch문만 추가된다.)
//			String line=br.readLine(); //개행기호가 나올 때까지 읽는다. 따라서 한줄 읽기 가능 
//			System.out.println(line);

			// step02)
			// 위의 2줄을 while문으로 감싸주자.
//			while(true) {
//				String line=br.readLine(); //개행기호가 나올 때까지 읽는다. 따라서 한줄 읽기 가능				
//				System.out.println(line);
//			}

			// step03)
			// if문을 넣어 while문에서 탈출시키기
			while (true) {
				String line = br.readLine(); // 개행기호가 나올 때까지 읽는다. 따라서 한줄 읽기 가능
				if (line == null) {
					System.out.println(line); // 마지막에 무엇이 출력되는지 알수 있음
					break;
				}
				System.out.println(line); //개행은 안읽어줌! println으로 출력해주어야한다. 
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
}
