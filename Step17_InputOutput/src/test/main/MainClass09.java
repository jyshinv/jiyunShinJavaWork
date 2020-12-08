package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File myFile = new File("c:/myFolder");
		//만일 해당 디렉토리가 존재하지 않으면
		if (!myFile.exists()) {
			//디렉토리 만들기 
			myFile.mkdir();
			System.out.println("c:/myFolder를 생성했습니다.");
		}else { //이미 해당 디렉토리가 존재하면
			System.out.println("c:/myFolder를 이미 존재합니다.");
		}
		System.out.println("main메소드가 종료");

	}
}
