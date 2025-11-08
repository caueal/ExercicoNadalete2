public class Produto {

    private String nome;
    private double preco;
    private String unidade;
    private Supermercado supermercado;

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }
    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public String getNome() {
        return nome;
    }   

}
