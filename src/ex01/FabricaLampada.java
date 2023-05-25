package ex01;

public class FabricaLampada {
    public Lampada construir(String tipoLampada){
        if(tipoLampada.equals("incandescente")){
            return new Incandescente();
        } else return new Fluorescente();
    }
}
