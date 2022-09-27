public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "idl");
        //  product.setName("Laptop");
        //  product.getId(1);
        // product.setDescription("Asus Laptop");
        //  product.setPrice(5000);
        // product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        //Classlar ilgili operasyonları ilgili özellikleri tutarlar


        System.out.println(product.getCode());

    }
}