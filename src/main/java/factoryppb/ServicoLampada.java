package factoryppb;

public class ServicoLampada implements IServico{
    public String ligar() {
        return "Lampada ligada";
    }

    public String desligar() {
        return "Lampada desligada";
    }
}
