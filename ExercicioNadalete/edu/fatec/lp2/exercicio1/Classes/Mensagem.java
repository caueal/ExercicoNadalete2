package Classes;

public abstract class Mensagem {

    private Contatinho destinatario;
    private String horario;
    private String conteudo;

    public Mensagem (Contatinho destinatario, String horario, String conteudo) {
        this.destinatario = destinatario;
        this.horario = horario;
        this.conteudo = conteudo;
    }

    @Override 
    public String toString() {
        return "Mensagem [destinatario=" + destinatario + ", horario=" + horario + ", conteudo=" + conteudo + "]";
    }
}
