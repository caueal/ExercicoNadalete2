import java.util.ArrayList;
import java.util.List;

public class ListaCompra implements Calculavel {

    private int limiteMax;
    private List<ItemCompra> itens;

    public int getLimiteMax() {
        return limiteMax;
    }

    public void setLimiteMax(int limiteMax) {
        this.limiteMax = limiteMax;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    
    public boolean adicionarItem(ItemCompra item) {
        if (itens.size() < limiteMax) {
            itens.add(item);
            return true;
        }
        return false;
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (ItemCompra item : itens) {
            total += item.calcularPreco();
        }
        return total;
    }
}
