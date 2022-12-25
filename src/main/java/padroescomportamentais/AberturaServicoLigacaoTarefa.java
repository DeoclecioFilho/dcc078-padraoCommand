package padroescomportamentais;

public class AberturaServicoLigacaoTarefa implements Tarefa{

    private  ServicoLigacao servicoLigacao;

    public AberturaServicoLigacaoTarefa (ServicoLigacao servicoLigacao){
       this.servicoLigacao = servicoLigacao;
    }

    @Override
    public void executar() {
        this.servicoLigacao.abrirServicoLigacao();
    }

    @Override
    public void cancelar() {
        this.servicoLigacao.fecharServicoLigacao();
    }
}
