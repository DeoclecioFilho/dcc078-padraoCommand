package padroescomportamentais;

public class ServicoLigacao {
    private int numCliente;
    private int numServico;
    private String situacao;

    public ServicoLigacao(int numCliente, int numServico) {
        this.numCliente = numCliente;
        this.numServico = numServico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirServicoLigacao() {
        this.situacao = "Servico de ligação aberto";
    }

    public void fecharServicoLigacao() {
        this.situacao = "Serviço de ligação fechado";
    }
}

