package service;
import java.util.List;

public interface ProductServiceInterface {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product insertProduct(Product product);
    Product updateProduct(Long id, Product product);
    Product updatePartProduct(Long id, Product product) throws Exception;
    void deleteProductById(Long id);
}