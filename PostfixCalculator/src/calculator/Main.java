package calculator;

import java.io.File;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) throws Exception{
		File postfix=new File("C:\\Users\\Windows 10\\Documents\\UVG\\CODING\\Algoritmos y estructuras de datos\\HDT\\HDT 2\\datos.txt");
		Scanner sc = new Scanner(postfix);
		StackVector vector=new StackVector();
		while (true==sc.hasNext()) {
			vector.push(sc.next());
			
			
		}
			
	}
}
