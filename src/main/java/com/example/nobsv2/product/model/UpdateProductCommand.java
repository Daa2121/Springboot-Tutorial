package com.example.nobsv2.product.model;


public class UpdateProductCommand {
    private Integer id;

    private Product product;

    public Integer getId() {
        return id;
    }

    public UpdateProductCommand() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public UpdateProductCommand(Integer id, Product product) {
        this.product = product;
        this.id = id;
    }
}
