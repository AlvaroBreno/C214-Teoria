package Observer.impl;
import Observer.interfaces.interface_Obser;

public class Observador implements interface_Obser {
    private String productName, modelo, tipo;
    int idProduto;

    public Observador(int id) {
        this.id = id;
    }
    @Override
    public void update(Observavel ThinkNews) {
        System.out.println("Produto: "+this.id);
        System.out.println("Nome do Produto: " + think.getProductName());
        System.out.println("Modelo: " + think.getModelo());
        System.out.println("Tipo: " + think.getTipo());
    }
}
