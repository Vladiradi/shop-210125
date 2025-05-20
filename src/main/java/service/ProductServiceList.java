package service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("productServiceList") // чтобы использовать через @Qualifier
public class ProductServiceList implements ProductServiceInterface {

    private List<Product> localStorage = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return localStorage;
    }

    @Override
    public Product getProductById(Long id) {
        return localStorage.stream()
                .filter(p -> p.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Product insertProduct(Product product) {
        localStorage.add(product);
        return product;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        for (int i = 0; i < localStorage.size(); i++) {
            if (localStorage.get(i).getProductId().equals(id)) {
                localStorage.set(i, product);
                return product;
            }
        }
        return null;
    }

    @Override
    public Product updatePartProduct(Long id, Product updateProduct) throws Exception {
        for (Product product : localStorage) {
            if (product.getProductId().equals(id)) {
                if (updateProduct.getName() != null) product.setName(updateProduct.getName());
                if (updateProduct.getPrice() != null) product.setPrice(updateProduct.getPrice());
                return product;
            }
        }
        throw new Exception("Product not found");
    }

    @Override
    public void deleteProductById(Long id) {
        localStorage.removeIf(p -> p.getProductId().equals(id));
    }
}