
import java.util.Scanner;

public class entrada_de_dados_int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println("Você digitou: " + num);
		
		sc.close();

	}

}
