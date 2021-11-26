package resistor;

public class Resistor4Bandas extends Resistor {
    private int faixa1;
    private int faixa2;
    private int faixa3;
    private float faixa4;
    private double valorResistencia;
    
    public Resistor4Bandas() {
        System.out.println ("*************************************");
        System.out.println ("O resistor de 4 faixas possui 4 cores");
        System.out.println ("A primeira e a segunda são os valores");
        System.out.println ("A terceira é o multiplicador do valor");
        System.out.println ("A quarta é mais ou menos a tolerância");
        System.out.println ("*************************************");
    }

    public int getFaixa1() {
        return faixa1;
    }

    public void setFaixa1(int faixa1) {
        this.faixa1 = faixa1;
    }
    
    public int getFaixa2() {
        return faixa2;
    }
    
    public void setFaixa2(int faixa2) {
        this.faixa2 = faixa2;
    }
    
    public int getFaixa3() {
        return faixa3;
    }
    
    public void setFaixa3(int faixa3) {
        this.faixa3 = faixa3;
    }
   
    public float getFaixa4() {
        return faixa4;
    }
    
    public void setFaixa4(float faixa4) {
        this.faixa4 = faixa4;
    }
    
    @Override
    public double calcularValorResistencia() {
        valorResistencia = ((faixa1*10)+faixa2) * Math.pow (10, faixa3);
        return valorResistencia;
    }  
    
    @Override
    public String getvalorTolerancia() {
        return "+/-" + faixa4 + "%";
    }
}
