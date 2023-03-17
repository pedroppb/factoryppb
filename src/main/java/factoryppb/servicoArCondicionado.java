package factoryppb;

public class servicoArCondicionado {

    public class Lampada implements IServico{
        public String ligar() {
            return "ArCondicionado ligado";
        }

        public String desligar() {
            return "ArCondicionado desligada";
        }
    }

}
