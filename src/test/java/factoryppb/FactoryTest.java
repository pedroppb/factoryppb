package factoryppb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FactoryTest {
        @Test
        void deveRetornarExcecaoParaServicoInexistente() {
            try {
               IServico servico = ServicoFactory.obterServico("ComputadorQuebrado");
               fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Serviço inexistente", e.getMessage());
            }
        }
        @Test
        void deveRetornarExcecaoParaServicoInvalido() {
            try {
                IServico servico = ServicoFactory.obterServico("ArCondicionado");
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Serviço inválido", e.getMessage());
            }
        }
}
