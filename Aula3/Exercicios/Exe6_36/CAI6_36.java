import java.security.SecureRandom;
import java.util.Scanner;

public class CAI6_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Questions(input);
    }

    public static void Questions(Scanner scan){
        SecureRandom randomNumbers = new SecureRandom();// objeto que gera numeros aleatorios suguro

        int num1 = randomNumbers.nextInt(10); // gera numeros aleatorios de 0 a 9
        int num2 = randomNumbers.nextInt(10); // gera numeros aleatorios de 0 a 9
        
        int answer;
        
        while(true){
            System.out.printf("Quanto é %d vezes %d?\n", num1,num2);
            answer = scan.nextInt();
            if (answer == (num1 * num2)){
                int alternativec = randomNumbers.nextInt(4);//gera um numero aleatório de 0 a 3

                    switch(alternativec + 1){

                        case 1:
                            System.out.println("Muito bem!");
                           break;
                        case 2:
                            System.out.println("Exelente!");
                            break;
                        case 3:
                            System.out.println("Bom Trabalho!");
                           break;
                        case 4:
                            System.out.println("Mantenha um bom trabalho!");
                            break;
                    }


                Questions(scan);
            }else{
                int alternativec = randomNumbers.nextInt(4);//gera um numero aleatório de 0 a 3

                     switch(alternativec + 1){

                        case 1:
                            System.out.println("Não. Por favor, tente de novo.");
                            break;
                        case 2:
                            System.out.println("Errado. Tente mais uma vez.");
                            break;
                        case 3:
                            System.out.println("Não desista!");
                            break;
                        case 4:
                            System.out.println("Não. Continue tentando!");
                            break;
                     }

                

            }
            
        }
    }
    
}

