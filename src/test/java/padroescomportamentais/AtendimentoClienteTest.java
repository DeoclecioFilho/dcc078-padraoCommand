package padroescomportamentais;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoClienteTest {

    AtendimentoCliente atendimentoCliente;
    ServicoLigacao servicoLigacao;

    @BeforeEach
    void setUp() {
        atendimentoCliente = new AtendimentoCliente();
        servicoLigacao = new ServicoLigacao (300548754, 20221234);
    }

    @Test
    void deveAbrirServicoDeLigacao() {
        Tarefa aberturaServico = new AberturaServicoLigacaoTarefa(servicoLigacao);
        atendimentoCliente.executarTarefa(aberturaServico);

        assertEquals("Servico de ligação aberto", servicoLigacao.getSituacao());
    }

    @Test
    void deveFecharServicoDeLigacao() {
        Tarefa fechamentoServico = new FechamentoServicoLigacaoTarefa(servicoLigacao);
        atendimentoCliente.executarTarefa(fechamentoServico);

        assertEquals("Serviço de ligação fechado", servicoLigacao.getSituacao());
    }

    @Test
    void deveCancelarFechamentoServicoDeLigacao() {
        Tarefa aberturaServico = new AberturaServicoLigacaoTarefa(servicoLigacao);
        Tarefa fechamentoServico = new FechamentoServicoLigacaoTarefa(servicoLigacao);

        atendimentoCliente.executarTarefa(aberturaServico);
        atendimentoCliente.executarTarefa(fechamentoServico);

        atendimentoCliente.cancelarUltimaTarefa();

        assertEquals("Servico de ligação aberto", servicoLigacao.getSituacao());
    }


}