package factoryppb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLampadaTest {

    @Test
    void deveLigarLampada() {
        IServico servico = ServicoFactory.obterServico("Lampada");
        assertEquals("Lampada ligada", servico.ligar());
    }

    @Test
    void deveDesligarLampada() {
        IServico servico = ServicoFactory.obterServico("Lampada");
        assertEquals("Lampada desligada", servico.desligar());
    }

}