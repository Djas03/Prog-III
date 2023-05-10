package Aula10.ExemplosAula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class exemp1 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:/Users/djalm/Documents/Algoritmos/Prog 3/Aula10/ExemplosAula/teste.txt");
        

        Scanner sc = new Scanner(file);
        int number;
        
        String name, celfone;
        while (sc.hasNext()){
            number = sc.nextInt();
            name = sc.next();
            celfone = sc.next();
            System.out.println(number + ',' + name + ',' + celfone);
        }
        sc.close();

    }
}
