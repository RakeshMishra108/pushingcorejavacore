package daily_practice;

public class RandemAccessFileExample {

	public static void main(String[] args) {
		
		String filePath="./c/Users";
		try(RandemAccessFile rf =new RandemAccessFile(filePath,"r") ){
		long size = rf.length();
		long midPosition = size/2;
		rf.seek(midPosition);
		
		while(true) {
			int data =rf.read();
			if(data== -1)
				break;
			char ch=(char)data;
			System.out.println(ch);
		}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
