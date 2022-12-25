package padroescomportamentais;

public class FechamentoServicoLigacaoTarefa implements Tarefa{

    private  ServicoLigacao servicoLigacao;

    public FechamentoServicoLigacaoTarefa(ServicoLigacao servicoLigacao){
        this.servicoLigacao = servicoLigacao;
    }
    @Override
    public void executar() {
        this.servicoLigacao.fecharServicoLigacao();
    }

    @Override
    public void cancelar() {
        this.servicoLigacao.abrirServicoLigacao();
    }
}
