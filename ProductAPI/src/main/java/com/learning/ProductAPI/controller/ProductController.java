package com.learning.ProductAPI.controller;

import com.learning.ProductAPI.ProductService;
import com.learning.ProductAPI.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;


    //constructor injection

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //GET ALL Endpoint
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }
    //GET ONE Endpoint
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id){
        Optional<Product> product = productService.getProductById(id);
        return product.map(p-> new ResponseEntity<>(p,HttpStatus.OK)) //if product is present, a body is returned of p
                .orElseGet(() ->new ResponseEntity<>(HttpStatus.NOT_FOUND)); //() takes no parameters and returns the status
    }
    //POST Endpoint
    @PostMapping
    public ResponseEntity<String> addProduct(
            @RequestBody Product product
    ){
        productService.addProduct(product);
        return new ResponseEntity<>(
                "product created successfully!" + product.getName(), HttpStatus.CREATED);
    }
    //PUT Endpoint
    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable Long id,@RequestBody Product product){
        if(productService.updateProduct(id,product)){
            return new ResponseEntity<>("Product updated successfully!" + product.getName(), HttpStatus.OK);

        }else{
            return new ResponseEntity<>("Product not found!" , HttpStatus.NOT_FOUND);
        }
    }
    //DELETE endpoint
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        if(productService.deleteProduct(id)){
            return new ResponseEntity<>("Product deleted successfully", HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }
}
