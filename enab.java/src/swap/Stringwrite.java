package swap;
import java.io.FileOutputStream;


public class Stringwrite {
	
public static void main(String args[]){
	
try{
FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
String s="Welcome to my files";
byte b[]=s.getBytes();//converting string into byte array
fout.write(b);
fout.close();
System.out.println("success...");
}catch(Exception e){System.out.println(e);}
}


}