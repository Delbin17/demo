package swap;
import java.io.*;
import java.io.FileOutputStream;
	public class fileread {

		public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("E:\\test.txt");

		fout.write(69);
		fout.close();
		System.out.println("Success...");
		}
	}