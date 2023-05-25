package ex02;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(5350);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2500);

        SeguroDeVida seguro = new SeguroDeVida();

        System.out.println("Tributo Conta Corrente: " + contaCorrente.calcularTributos());
        System.out.println("Tributo Conta Poupança: " + contaPoupanca.calcularTributos());
        System.out.println("Tributo Seguro Vida: " + seguro.calcularTributos());
    }
}
