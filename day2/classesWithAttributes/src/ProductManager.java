public class ProductManager {
    public void Add(Product product){
        //JDBC codes (veri tabanına kaydetme)
        System.out.println("Ürün eklendi." + product.getName());
    }
    //aynı isim vermeye overloading denir.
    public void Add2(int id, String name, String description, int stockAmount, double price){

    }
}
