
import java.util.Locale;
import java.util.Scanner;

public class operadores_atribucao_cumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta a pagar = R$ %.2f\n", conta);
		
		sc.close();
	}

}
