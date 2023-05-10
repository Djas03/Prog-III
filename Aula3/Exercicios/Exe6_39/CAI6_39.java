import java.util.Scanner;

public class CAI6_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int level;
        int control = 0;
        int home;
        while(true){
            System.out.println("\n\n----------Home-----------");
            System.out.println("Digite 1 para comecar\nDigite 0 para sair\n");
            home = input.nextInt();
            if(home == 1){
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

                //impressao do menu de escolha de problema aritmetico
                System.out.println("Digite o tipo de problema aritmetico desejado:\n1 - adicao\n2 - subtracao\n3 - multiplicacao\n4 - divisao\n5 - mix aleatorio");
                int opcao;
                opcao = input.nextInt();
                while(opcao == 0 || opcao < 0){
                    System.out.println("Erro! opcao invalida! tente novamente!");
                    System.out.println("Digite o tipo de problema aritmetico desejado:\n1 - adicao\n2 - subtracao\n3 - multiplicacao\n4 - divisao\n5 - mix aleatorio");


                }
                
                //incializacao e reinicializacao das variaveis de controle
                int cont = 0;
                int contCorreta = 0;
                int contErrada = 0;
                switch(opcao){
                    case 1:
                        Soma.soma(input, cont, contCorreta, contErrada, level, control);
                        break;
                    
                    case 2:
                        Subtracao.Sub(input, cont, contCorreta, contErrada, level, control);
                        break;

                    case 3:
                        Multiplicacao.Multi(input, cont, contCorreta, contErrada, level, control);
                        break;

                    case 4:
                        Divisao.divisao(input, cont, contCorreta, contErrada, level, control);
                        break;
                    
                    case 5:
                        Mix.mix(input, cont, contCorreta, contErrada, level, control);
                        break;

                }
            }else if (home == 0){
                System.out.println("\nSaindo...\n\n");
                break;
            }else if(home < 0 || home > 1){
                System.out.println("\n\nOpcao Invalida! Tente novamente!");

            }


        }
    }

}

