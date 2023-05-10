import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplicacao {
        //-----------------------------Operacoes de Multiplicacao---------------------------------
        public static void Multi(Scanner scan, int cont, int contCorreta, int contErrada, int level, int control){ 
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
            System.out.println("\nporcentagem: " + porcentagem + "%");
    
            if (porcentagem < 75){
                System.out.println("\nPeca ajuda extra ao seu professor.\n");
            }else{
                System.out.println("\nParabens, voce esta pronto para avancar para o proximo nivel!\n");
            }
        
            
    
        }
    
    
       
        
}
