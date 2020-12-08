package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooseFrame extends JFrame implements ActionListener {

	//필요한 필드정의하기 (모든 메소드에서 접근 가능한 자원)
	JButton selectBtn, selectBtn2;
	JTextArea area;
	
	//생성자
	public FileChooseFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		//버튼의 참조값을 필드에 저장해 놓는다 (다른 메소드에서 참조해서 사용하려고)
		selectBtn=new JButton("파일 선택하기");
		add(selectBtn, BorderLayout.NORTH);
		selectBtn.addActionListener(this);
		
		selectBtn2=new JButton(".txt파일 선택하기");
		add(selectBtn2, BorderLayout.SOUTH);
		selectBtn2.addActionListener(this);
		
		//JTextArea 객체 생성
		area=new JTextArea();
		add(area, BorderLayout.CENTER);
		area.setBackground(Color.YELLOW);
		
	}

	//인터페이스 메소드 actionPerformed 강제 재정의 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//액션이 일어난 UI(JButton)의 참조값 얻어오기
		Object obj=e.getSource();
		
		if(obj == selectBtn) { //파일 선택 버튼을 눌렀을 때
			// c:/myFolder 에서 시작되는 JFileChooser  객체 생성
			//-> 이 코드에서 블로킹 되어있다. case1, case2, case3 그림확인 
			//case1, case2, case3을 누르기 전까진 메인스레드가 한개이기때문에 다른 작업을 하지 못한다. 
			//c:/myFolder에서 시작하는
			JFileChooser fc=new JFileChooser("c:/myFolder"); 
			
			//파일을 선택해서 열수 있는 다이얼로그 띄우고 어떤 작업을 했는지 결과를 int 로 받기
			int result=fc.showOpenDialog(this);
//			if(result == 0) {
//				
//			}else if(result == 1) {
//				
//			}
			
			//위의 if~else 처럼 사용하기 보단 아래처럼 사용하는 것이 더 좋은방법!
			//JFileChooser.APPROVE_OPTION의 반환값은 0
			//JFileChooser.CANCEL_OPTION의 반환값은 0
			if(result == JFileChooser.APPROVE_OPTION) {
				
				//File객체를 반환하는 getSelectedFile(), 유저가 선택한 파일객체를 반환한다.
				//선택한 파일을 Access 할수 있는 File 객체의 참조값 얻어오기
				File selectedFile=fc.getSelectedFile();
				//selectedFile. 을 통해 여러가지 기능을 확인해보자
				//selectedFile.delete(); 최종적으로 파일 선택 후 확인을 누르면 선택한 파일이 삭제된다.
				//selectedFile.getName(); 최종적으로 파일 선택 후 확인을 누르면 선택한 파일의 이름을 리턴해준다.
				
				//선택한 파일 이름 얻어오기
				String fileName=selectedFile.getName();
				
				//메세지 다이얼로그 띄우기
				JOptionPane.showMessageDialog(this, fileName+" 파일을 선택했네요?");
			}else if(result == JFileChooser.CANCEL_OPTION) {//취소 버튼을 눌렀을때
				JOptionPane.showMessageDialog(this, "취소 버튼을 눌렀네요?");
			}else if(result == JFileChooser.ERROR_OPTION) {
				JOptionPane.showMessageDialog(this, "그냥 닫았네요? (에러)");
			}
			
		}else if(obj == selectBtn2) { //.txt 파일 선택 버튼을 눌렀을 때
			//파일 확장자가 .txt 인 파일만 선택할 수 있도록 필터 설정
			JFileChooser fc=new JFileChooser("c:/myFolder");
			FileNameExtensionFilter filter=
					new FileNameExtensionFilter("텍스트 파일", "txt");
			fc.setFileFilter(filter);
			
			//선택한 파일을 콘솔창에 출력하기 
			//선택한 결과 받기 
			int result = fc.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				File selectedFile=fc.getSelectedFile();

				try {
					//선택된 파일을 Access 할 수 있는 File 객체를 이용해서
					//문자열을 읽어들일 수 있는 FileReader 객체 생성하기 
					FileReader fr=new FileReader(selectedFile);
					BufferedReader br=new BufferedReader(fr);
					while(true) { //반복문 돌면서 
						String line=br.readLine(); //개행까지 한줄 읽어줌, 개행은 안읽음	 
						//만일 더 이상 읽어드릴 것이 없다면 
						if(line==null) {
							//break 예약어는 반복문을 탈출하는 예약어이다. 
							break; 
						}
						//읽으들인 문자열 콘솔창에 출력 
						//System.out.println(line);//한문자씩 개행해주며 출력하기 (print 로도 해보기)
						//읽어들인 문자열을 JTextArea에 출력
						area.append(line+"\r\n");
						
					}
				//actionPerformed메소드 매개변수로 e가 있음! Duplicated~ 뜨면 변수명 겹쳤다는 뜻!	
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else if(result == JFileChooser.CANCEL_OPTION) {//취소 버튼을 눌렀을때
				JOptionPane.showMessageDialog(this, "취소 버튼을 눌렀네요?");
			}else if(result == JFileChooser.ERROR_OPTION) {
				JOptionPane.showMessageDialog(this, "그냥 닫았네요? (에러)");
			}
			
			
		}
	}
	
	//함수 2개 만들어서 호출식으로 만들어보기 
	
	//메인 메소드 
	public static void main(String[] args) {
		FileChooseFrame f=new FileChooseFrame("파일 선택하는 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	
}
