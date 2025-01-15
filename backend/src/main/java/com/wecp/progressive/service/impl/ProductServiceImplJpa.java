package com.wecp.progressive.service.impl;
<<<<<<< HEAD

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.exception.InsufficientCapacityException;
import com.wecp.progressive.repository.ProductRepository;
=======
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.exception.InsufficientCapacityException;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.ShipmentRepository;
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductServiceImplJpa implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    ShipmentRepository shipmentRepository;

    @Autowired
<<<<<<< HEAD
    WarehouseRepository warehouseRepository;

    public ProductServiceImplJpa (ProductRepository productRepository) {
=======
    public ProductServiceImplJpa(ProductRepository productRepository) {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() throws SQLException {
        return productRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public Product getProductById(int productId) {
=======
    public Product getProductById(int productId) throws SQLException {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        return productRepository.findByProductId(productId);
    }

    @Override
<<<<<<< HEAD
    public int addProduct(Product product) {
        if(product.getWarehouse().getCapacity() < 1)
            throw new InsufficientCapacityException("Warehouse full");
=======
    public int addProduct(Product product) throws InsufficientCapacityException {
        Warehouse warehouse = warehouseRepository.findByWarehouseId(product.getWarehouse().getWarehouseId());
        int productCount = productRepository.countByWarehouse_WarehouseId(warehouse.getWarehouseId());
        if (warehouse.getCapacity() == productCount) {
            throw new InsufficientCapacityException(
                    "Warehouse with ID " + warehouse.getWarehouseId() + " has reached its maximum capacity of " + warehouse.getCapacity() + " products."
            );
        }
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        return productRepository.save(product).getProductId();
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        productRepository.save(product).getProductId();
    }

    @Override
    public void deleteProduct(int productId) throws SQLException {
        shipmentRepository.deleteByProductId(productId);
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> getAllProductByWarehouse(int warehouseId) throws SQLException {
        return productRepository.findAllByWarehouse_WarehouseId(warehouseId);
    }
}