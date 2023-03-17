package factoryppb;

public class ServicoArCondicionado implements IServico{
        public String ligar() {
            return "ArCondicionado ligado";
        }

        public String desligar() {
            return "ArCondicionado desligado";
        }
}