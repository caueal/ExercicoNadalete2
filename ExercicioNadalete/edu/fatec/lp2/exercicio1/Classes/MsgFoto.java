package Classes;

public class MsgFoto extends Mensagem{

    private Integer tamanho;

    public MsgFoto(Contatinho destinatario, String horario, String conteudo, Integer tamanho) {
        super(destinatario, horario, conteudo);
        this.tamanho = tamanho;
    }   

    @Override 
    public String toString() {
        return "MsgFoto [tamanho=" + tamanho + "]";
    }

}
