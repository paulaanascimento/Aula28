package ex01;

public class Incandescente extends FabricaLampada implements Lampada{
    @Override
    public void ligar() {
        System.out.println("Lampada Incandescente ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada Incandescente desligada!");
    }
}
