import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test_P40 {

	public static void main(String[] args) {
		if(args.length !=1)
		{
			System.out.println("�Ы��X���T���ɮצW��");
			System.exit(1);
		}
		
		try {
			BufferedReader br =new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}

		catch (IOException e) {
			
			System.out.println("��X�J���~");
		}
	}

}
