import java.security.SecureRandom;
import java.util.Scanner;

public class CAI6_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Questions(input);
    }

    public static void Questions(Scanner scan){
        SecureRandom randomNumbers = new SecureRandom();// objeto que gera numeros aleatorios suguro

        int num1 = randomNumbers.nextInt(10); // gera numeros aleatorios de 0 a 10
        int num2 = randomNumbers.nextInt(10); // gera numeros aleatorios de 0 a 10
        int answer;
        
        while(true){
            System.out.printf("Quanto é %d vezes %d?\n", num1,num2);
            answer = scan.nextInt();
            if (answer == (num1 * num2)){
                System.out.println("Muito bem!");
                Questions(scan);
            }else{
                System.out.println("Não. Por favor, tente de novo.");

            }
            
        }
   
    }
    
}

