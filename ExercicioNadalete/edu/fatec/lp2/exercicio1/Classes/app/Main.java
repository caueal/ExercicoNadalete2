package Classes.app;

import Classes.Contatinho;
import Classes.Mensagem;
import Classes.MsgAudio;
import Classes.MsgTexto;

public class Main {

    public static void main(String[] args) {
        Contatinho joao = new Contatinho("joao", "11999999999");

        MsgTexto msg1 = new MsgTexto(joao, "10:30", "Ola, tudo bem?", 15);

        MsgAudio msg2 = new MsgAudio(joao, "11:00", "Mensagem de voz", 30);
    }

}
