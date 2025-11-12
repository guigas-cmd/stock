package entities;

    public class ProductClass {
          public String name;
          public double price;
          public int quantity;


    // metodo 1: adiciona produtos ao estoque
    // this. >> usado para diferenciar o atributo classe do parametro do metodo qnd ambos tiverem o msm nome

    public int addProducts(int quantityToAdd){
         this.quantity = this.quantity + quantityToAdd; // ou this.quantity += quantitytoAdd;
         return this.quantity;
    }

    // metodo 2: remove produtos do estoque

    public int removeProducts(int quantityToRemove){
        this.quantity = this.quantity - quantityToRemove;
        return this.quantity;
    }

    // TOTAL
    public double getTotal(){
        return price * quantity;
    }


}
