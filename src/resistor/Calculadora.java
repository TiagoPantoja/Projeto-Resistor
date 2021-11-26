package resistor;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import resistor.ValorCor;

public class Calculadora {
    
    static Resistor4Bandas Resistor4bandas;
    static Scanner scanner = new Scanner (System.in);
    static double valorResistencia;
    static double[] historicoPesquisa = new double[5];
            
    public static void main(String[] args) {
    int selecao;
    int aux = 0;
    System.out.println ("**************************************");
    System.out.println ("Bem vindo a Calculadora de Resistores!");
    
    while(aux < 5) {
    System.out.println ("Selecione uma função da calculadora: ");
    System.out.println ("1) Cores para Resistência e 2) Resistência para Cores e 3) Histórico de Pesquisa");
    try {
        selecao = scanner.nextInt();
        switch(selecao) {
            case 1: corValor (aux);
                break;
            case 2: ValorCor.text();
                break;
            case 3: historicoPesquisa();
                break;
        }
    } catch(InputMismatchException e) {
        JOptionPane.showMessageDialog (null, "Digite um número válido");
        
    }
        aux++;
  }
}
    public static void corValor(int aux) {
        scanner.nextLine();
        Resistor4bandas = new Resistor4Bandas();
        System.out.println ("Você escolheu o resistor de 4 faixas");
        Resistor4bandas.mostrarCores();
        String[] selections = new String[4];
        
        System.out.print ("Insira a cor da primeira faixa: ");
        selections[0] = scanner.nextLine();
        selections[0] = selections[0].toLowerCase();
        Resistor4bandas.setFaixa1(Resistor.corValor(selections[0]));
        
        System.out.print ("Insira a cor da segunda faixa: ");
        selections[1] = scanner.nextLine();
        selections[1] = selections[1].toLowerCase();
        Resistor4bandas.setFaixa2(Resistor.corValor(selections[1]));
        
        System.out.print ("Insira a cor da terceira faixa: ");
        selections[2] = scanner.nextLine();
        selections[2] = selections[2].toLowerCase();
        Resistor4bandas.setFaixa3(Resistor.corValor(selections[2]));
        
        Resistor4bandas.mostrarTolerancia();
        System.out.print ("Insira a cor da quarta faixa: ");
        selections [3] = scanner.nextLine();
        selections [3] = selections[3].toLowerCase();
        Resistor4bandas.setFaixa4(Resistor.corTolerancia(selections[3]));
        
        Resistor4bandas.printResistor(selections[0], selections[1], selections[2], selections[3]);
        valorResistencia = Resistor4bandas.calcularValorResistencia();
        System.out.println ("Esse resistor tem uma resistência de " + valorResistencia + " Ohms com tolerância de " + Resistor4bandas.getFaixa4());
        historicoPesquisa[aux] = valorResistencia;
    }        

    private static void historicoPesquisa() {
        int exibirHistorico = 0;
        
        System.out.println ("Os valores pesquisados anteriormente estão listados a seguir: ");
        for (exibirHistorico = 0; exibirHistorico < 5; exibirHistorico++) {
        System.out.println (historicoPesquisa[exibirHistorico] + " - " + exibirHistorico);
        }
    }
}       
   