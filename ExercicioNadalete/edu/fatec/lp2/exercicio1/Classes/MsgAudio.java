package Classes;

public class MsgAudio extends Mensagem {

    private Integer duracao;

    public MsgAudio(Contatinho destinatario, String horario, String conteudo, Integer duracao) {
        super(destinatario, horario, conteudo);
        this.duracao = duracao;
    }

    @Override 
    public String toString() {
        return "MsgAudio [duracao=" + duracao + "]";
    }


}
