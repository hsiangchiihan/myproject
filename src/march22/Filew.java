package march22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    wonderful();
    FileReader in = new FileReader("data.txt");
    int n = in.read();
	}

	private static void wonderful() {
		try{
			FileWriter out = new FileWriter("data.txt");
			out.write("666");
			out.write("\n");
			out.write(48);
			out.flush();
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
