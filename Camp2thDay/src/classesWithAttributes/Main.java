package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "Asus", 5000, 60);
		/*product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(6000);
		product.setStockAmount(3);
		System.out.println(product.getName());*/
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
