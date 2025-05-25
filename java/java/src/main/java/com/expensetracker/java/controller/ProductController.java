package com.expensetracker.java.controller;

import com.expensetracker.java.model.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class ProductController {

    private Product product;
    private static final String FILE_PATH = "product.json";
    private ObjectMapper objectMapper = new ObjectMapper();


    //create a new product
    @PostMapping("/products")
    public ResponseEntity<List<Product>> createNewProduct(
            @RequestBody Product product
    ) throws IOException {
        List<Product> products = readProductsFromFile();
        products.add(product);
        writeProductsToFile(products);

        return new ResponseEntity<>(products, HttpStatus.CREATED);


    }
    private List<Product> readProductsFromFile() throws IOException {
        File file = new File(FILE_PATH);
        if(!file.exists()){
            return new ArrayList<>();
        }
        return objectMapper.readValue(file, new TypeReference<List<Product>>() {
        });
    }
    public void writeProductsToFile(List<Product> products) throws IOException {
        objectMapper.writeValue(new File(FILE_PATH),products);
    }

    //get all product
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() throws IOException {
        List<Product> products = readProductsFromFile();
        return new ResponseEntity<>(products,  HttpStatus.OK);
    }
    //get one product
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getOneProductById(
            @PathVariable("id") Long id) throws IOException {

        List<Product> products = readProductsFromFile();
        for (Product product: products){
            if(product.getId().equals(id)){
                return new ResponseEntity<>(product,HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    //update a product
    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable("id") Long id,
            @RequestBody Product updatedProduct
    ) throws IOException {
        List<Product> products = readProductsFromFile();
        for (Product product: products){
            if(product.getId().equals(id)){
                //make the update
                product.setName(updatedProduct.getName());
                product.setAmount(updatedProduct.getAmount());
                writeProductsToFile(products);
                return new ResponseEntity<>(product,HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
    //delete item
    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(
            @PathVariable("id")Long id
    ) throws IOException {
        List<Product> products = readProductsFromFile();
        //we use an iterator because it eliminates errors when removing a product
        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if(product.getId().equals(id)){
                iterator.remove();
                writeProductsToFile(products);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }
}
