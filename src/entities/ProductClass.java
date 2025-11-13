package entities;

    public class ProductClass {
          public String name;
          public double price;
          public int quantity;


    public double getTotal(){
         return price * quantity;
        }

    // metodo 1: adiciona produtos ao estoque
    // this. >> usado para diferenciar o atributo classe do parametro do metodo qnd ambos tiverem o msm nome
    public void addProducts(int quantityToAdd){
         this.quantity += quantityToAdd;
    }

    // metodo 2: remove produtos do estoque
    public void removeProducts(int quantityToRemove){
        this.quantity -= quantityToRemove;
    }

    // toString faz chamado normal no App.java, n e necessario declarar product.toString()
    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", getTotal());
    }
}
