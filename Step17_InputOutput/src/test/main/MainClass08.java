package test.main;

import java.io.File;

public class MainClass08 {
	public static void main(String[] args) {
		File myFile=new File("c:/");
		File[] files=myFile.listFiles(); //myFile.listFiles()의 리턴타입은 File[]
		
		//반복문 돌면서 하나씩 참조해서 작업해보기
		for(File tmp:files) {
			//만일 디렉토리라면 
			if(tmp.isDirectory()) { //tmp.isDirectory()의 리턴타입은 boolean
				System.out.println("[ "+tmp.getName()+" ]"); 
				//tmp.getName()은 파일의 이름을 리턴
			}else { //파일이라면
				System.out.println(tmp.getName());
			}
		}
		
		
	}

}
