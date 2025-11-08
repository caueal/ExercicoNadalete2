package Classes;

public class MsgTexto extends Mensagem{

    private Integer numChar; 

    public MsgTexto(Contatinho destinatario, String horario, String conteudo, Integer numChar) {
        super(destinatario, horario, conteudo);
        this.numChar = numChar;
    }   

    @Override 
    public String toString() {
        return "MsgTexto [numChar=" + numChar + "]";
    }

}
