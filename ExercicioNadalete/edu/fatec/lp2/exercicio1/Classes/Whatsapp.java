package Classes;

public class Whatsapp {

    private Contatinho[] listaContatos; 
    private Mensagem[] listaMensagens;

    public Whatsapp(Contatinho[] listaContatos, Mensagem[] listaMensagens) {
        this.listaContatos = listaContatos;
        this.listaMensagens = listaMensagens;
    }

    public void listarContatos() {
        for (Contatinho contato : listaContatos) {
            System.out.println(contato);
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : listaMensagens) {
            System.out.println(mensagem);
        }
    }


}
