package resistor;

import java.util.Scanner;

    public class ValorCor {
    static Scanner scanner = new Scanner (System.in);
    public static void text() {
            System.out.println("Insira o valor da resistência");
            System.out.println ("Digite 0) para a tolerância dourada e 1) para a tolerância prateada");
        String resistencia = scanner.nextLine();
        String tolerancia = scanner.nextLine();
        int multiplicador = 0;
        int primeiraFaixa = 0;
        int segundaFaixa = 0;
        if (resistencia.length() >= 2) { 
            multiplicador = resistencia.length()-2;
            String dezenaStr = resistencia.substring(0,1);
            String unidadeStr = resistencia.substring(1,2);
            primeiraFaixa = Integer.parseInt(dezenaStr);
            segundaFaixa = Integer.parseInt(unidadeStr);
        }
        else if (resistencia.length()== 1) { 
            multiplicador = 8;
            primeiraFaixa = Integer.parseInt(resistencia);
        }
         
        String cor[] = {"Preto", "Marrom", "Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Violeta", "Cinza", "Branco"};
            System.out.println(cor[primeiraFaixa]);
            System.out.println(cor[segundaFaixa]);
            System.out.println(cor[multiplicador]);
        if (tolerancia == "0")  {
            System.out.println("A tolerância é +/- 5% ");
        }
        else {
            System.out.println("A tolerância é +/- 10% ");
        }  
}
    
}

   
