package resistor;

    abstract class Resistor {
        
    public double calcularValorResistencia() {
        return 0.00d;
    }
    
    public String getvalorTolerancia() {
        return null;
    }
    
    public void mostrarCores() {
        System.out.println("********************");
        System.out.println("Lista de Cores");
        System.out.println("Preto");
        System.out.println("Marrom");
        System.out.println("Vermelho");
        System.out.println("Laranja");
        System.out.println("Amarelo");
        System.out.println("Verde");
        System.out.println("Azul");
        System.out.println("Violeta");
        System.out.println("Cinza");
        System.out.println("********************");
    }
    
    public void mostrarTolerancia () {
        System.out.println("********************");
        System.out.println("Lista de Tolerâncias");
        System.out.println("Dourado");
        System.out.println("Prata");
        System.out.println("********************");
    }
    
    public static int corValor (String mostrarCores) {
        int valor = 0;
        switch (mostrarCores) {
            case "preto": valor = Cores.preto;
                break; 
            case "marrom": valor = Cores.marrom;
                break;
            case "vermelho": valor = Cores.vermelho;
                break;
            case "laranja": valor = Cores.laranja;
                break;
            case "amarelo": valor = Cores.amarelo;
                break;
            case "verde": valor = Cores.verde;
                break;
            case "azul": valor = Cores.azul;
                break;
            case "violeta": valor = Cores.violeta;
                break;
            case "cinza": valor = Cores.cinza;
                break;
            case "branco": valor = Cores.branco;
            default: System.out.println("Você informou alguma cor inválida");
                break;
        }
                return valor;
    }       
    
    public static float corTolerancia (String cor) {
        float valor;
        switch (cor) {
            case "dourado": valor = Tolerancia.dourado;
                break;
            case "prata": valor = Tolerancia.prata;
                break;
            default: valor = 999.99f;
                break;
        }
        return valor;
    }
    
   public void printResistor(String c1, String c2, String c3, String c4) {
        String printar = " ==[ " + c1.toUpperCase() + " " + c2.toUpperCase() + " " + c3.toUpperCase() + " " + c4.toUpperCase() + " ]== ";
        System.out.println(printar);
 }
}
