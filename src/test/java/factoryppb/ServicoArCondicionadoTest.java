package factoryppb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ServicoArCondicionadoTest {
        @Test
        void deveLigarArCondicionado () {
            IServico servico = ServicoFactory.obterServico("ArCondicionado");
            assertEquals("ArCondicionado ligado", servico.ligar());
        }
        @Test
        void deveDesligarArCondicionado() {
            IServico servico = ServicoFactory.obterServico("ArCondicionado");
            assertEquals("ArCondicionado desligado", servico.desligar());
        }
}
