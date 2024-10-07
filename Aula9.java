import java.util.Scanner;

public class Aula9 {

	public static void main(String[] args) {
		int i;
		double num, rNum;
		
		Scanner sc = new Scanner(System.in);
		i=0;
		do {
			
		
		System.out.println("Digite um número: ");
		 num= sc.nextDouble();
		 rNum= num/2;
		 System.out.println("Metade "+rNum);
		 i++;
	}while(i<10);


	}

}