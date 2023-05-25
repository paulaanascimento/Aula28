package ex01;

public class Fluorescente extends FabricaLampada implements Lampada{
    @Override
    public void ligar() {
        System.out.println("Lampada Fluorescente ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("Lampada Fluorescente desligada!");
    }
}
