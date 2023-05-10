import java.security.SecureRandom;
import java.util.Scanner;

public class CAI6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int cont = 0;
            int contCorreta = 0;
            int contErrada = 0;
            Questions(input, cont, contCorreta, contErrada);
        }
    }

    public static void Questions(Scanner scan, int cont, int contCorreta, int contErrada){
        SecureRandom randomNumbers = new SecureRandom();// objeto que gera numeros aleatorios suguro
 
        int num1 = randomNumbers.nextInt(10); // gera numeros aleatorios de 0 a 9
        int num2 = randomNumbers.nextInt(10); // gera numeros aleatorios de 0 a 9

        int answer;
    
        
        while(cont < 10){
            System.out.printf("Quanto é %d vezes %d?\n", num1,num2);
            answer = scan.nextInt();
            if (answer == (num1 * num2)){
                int alternative = randomNumbers.nextInt(4);//gera um numero aleatório de 0 a 3

                switch(alternative + 1){

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
                
                contCorreta++;
                cont++;
                num1 = randomNumbers.nextInt(10);
                num2 = randomNumbers.nextInt(10);

            }else{
                int alternative = randomNumbers.nextInt(4);//gera um numero aleatório de 0 a 3

                switch(alternative + 1){

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
                contErrada++;
                cont++;
            }
            
        }
        
        int porcentagem = contCorreta * 100/ 10;
        System.out.println("porcentagem: " + porcentagem + "%");

        if (porcentagem < 75){
            System.out.println("Peca ajuda extra ao seu professor.");
        }else{
            System.out.println("Parabens, voce esta pronto para avancar para o proximo nivel!");
        }
    
        

    }
    
}

