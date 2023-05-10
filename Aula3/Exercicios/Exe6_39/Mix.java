import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

//mix aleatorio de tidas as operações aritmeticas
public class Mix {
    public static void mix(Scanner scan, int cont, int contCorreta, int contErrada, int level, int control){
        SecureRandom randomNumbers = new SecureRandom();// objeto que gera numeros aleatorios suguro
        int escolha;
        int num1 = randomNumbers.nextInt(level);
            while(num1 < control){
                num1 = randomNumbers.nextInt(level);
            } 
        int num2 = randomNumbers.nextInt(level); 
            while(num2 < control){
                num2 = randomNumbers.nextInt(level);
            } 

        int answer;
        while (cont < 10){
            escolha = randomNumbers.nextInt(4);
            switch(escolha + 1){

                //-----------soma-----------
                case 1:
                    
                    while(cont < 10){
                    System.out.printf("Quanto é %d mais %d?\n", num1,num2);
                    answer = scan.nextInt();
                    if (answer == (num1 + num2)){
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
                            
                        break;
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
                    break;

                //-----------------subtracao-----------------    
                case 2:

                    while(cont < 10){
                    System.out.printf("Quanto é %d menos %d?\n", num1,num2);
                    answer = scan.nextInt();
                    if (answer == (num1 - num2)){
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
                        
                        break;
        
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
                    break;
                    
                
                //-------------multiplicacao--------------    
                case 3:
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

                        break;
        
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
                    break;


                //---------------divisao---------------    
                case 4:
                    while(cont < 10){
                    num1 = randomNumbers.nextInt(level);
                    if(num1 == 0)
                        while(num1 == 0 || num1 < control)
                        num1 = randomNumbers.nextInt(level);
                
                    num2 = randomNumbers.nextInt(level);
                    if(num2 == 0)
                        while(num2 == 0 || num2 < control)
                        num2 = randomNumbers.nextInt(level); 
            
                    double answer1;
                    double result = (double)num1 / num2;
                    
                    
                    System.out.printf("Quanto é %d dividido %d?\n", num1,num2);
                    answer1 = scan.nextDouble();
                    if (Math.abs(answer1 - result) < 0.1){
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
                            if(num1 == 0)
                                while(num1 == 0 || num1 < control)
                                num1 = randomNumbers.nextInt(level);
                
                        num2 = randomNumbers.nextInt(level);
                            if(num2 == 0)
                                while(num2 == 0 || num2 < control)
                                num2 = randomNumbers.nextInt(level); 
            
                        break;
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
                    break;

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
