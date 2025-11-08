public class ItemCompra implements Calculavel {

    private int quantidade;
    private double desconto;
    private Produto produto;


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    

    public void setDesconto(double desconto) {
        if (desconto < 0) desconto = 0;
        if (desconto > 1) desconto = 1;
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        return produto.getPreco() * quantidade * (1 - desconto);
    }

    public Produto getProduto() {
        return produto;
    }
}
