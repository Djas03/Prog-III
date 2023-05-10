import java.security.SecureRandom;
import java.util.Scanner;

public class CAI6_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level;
        int control = 0;
        while(true){
            
            //o nivel vai indicar a quantidade de digitos permitidos nos numeros
            System.out.println("Insira o nível de dificuldade ( 1 a 3 ): ");
            level = input.nextInt();
            if(level == 1){
                level = 10;
                control = 0;
            }else if (level == 2){
                level = 100;
                control = 10;
            }else if (level == 3){
                level = 1000;
                control = 100;
            }else if (level == 0 || level < 0 || level > 3){
                while (level == 0 || level < 0 || level > 3){
                    System.out.println("Erro! nivel invalido! Digite novamente o nivel ( 1 a 3 ):");
                    level = input.nextInt();
                }
            }


            int cont = 0;
            int contCorreta = 0;
            int contErrada = 0;
            Questions(input, cont, contCorreta, contErrada, level, control);
        }
    }

    public static void Questions(Scanner scan, int cont, int contCorreta, int contErrada, int level, int control){
        SecureRandom randomNumbers = new SecureRandom();// objeto que gera numeros aleatorios suguro
 
        int num1 = randomNumbers.nextInt(level);
        while(num1 < control){
            num1 = randomNumbers.nextInt(level);
        } 
        int num2 = randomNumbers.nextInt(level); 
        while(num2 < control){
            num2 = randomNumbers.nextInt(level);
        } 
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
                num1 = randomNumbers.nextInt(level);
                while(num1 < control){
                    num1 = randomNumbers.nextInt(level);
                } 
                num2 = randomNumbers.nextInt(level); 
                while(num2 < control){
                    num2 = randomNumbers.nextInt(level);
                } 

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



