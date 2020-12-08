package test.main;

import java.io.File;

public class MainClass11 {
	public static void main(String[] args) {
		//MainClass10에서 만든 파일 100개 지우기 
		//MainClass10에서 파일 100개 만들어진거 확인하고 MainClas11 run 해볼것!
		File f=new File("c:/myFolder"); //주의!!!!!"c:/"라고 하면 안된다. c드라이브 날라가버림  
		File[] files=f.listFiles();
		for(File tmp:files) {
			tmp.delete();
		}
		System.out.println("c:/myFolder 하위에 있는 모든 내용을 삭제 했습니다.");
	}

}
