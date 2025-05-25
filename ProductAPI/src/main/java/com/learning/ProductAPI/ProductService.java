package com.learning.ProductAPI;

import com.learning.ProductAPI.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    //simulate an in memory
    private List<Product> products = new ArrayList<>();

    //GET all products

    public List<Product> getProducts() {
        return products;
    }

    //GET a single product
    //optional class in Java helps deal with nullPointerException issue
    public Optional<Product> getProductById(Long id){
        return products.stream().filter(
                product-> product.getId().
                        equals(id)).findAny();

    }
    //add a new products
    public void addProduct(Product product){
        products.add(product);
    }
    //updating an existing product
    public boolean updateProduct(
            Long id, Product product
    ){
        Optional<Product> existingProduct = getProductById(id);
        if(existingProduct.isPresent()){
            //get product and set the name and price
            existingProduct.get().setName(product.getName());
            existingProduct.get().setPrice(product.getPrice());
            return true;
        }
        return false;
    }
    //delete a product
    public boolean deleteProduct(Long id){
        return products.removeIf(
                product-> product.getId().equals(id));
    }

}
