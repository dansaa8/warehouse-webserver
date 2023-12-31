package com.example.warehousewebserver.service;

import com.example.warehousewebserver.entities.Category;
import com.example.warehousewebserver.entities.ProductRecord;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface WarehouseService {
     boolean addProduct(ProductRecord p);
     boolean modifyProduct(ProductRecord p);
     Optional getProduct(int id);
     List getAllProducts();
     List getProductsByCategory(Category desiredCategory);
     List getProductsCreatedAfterDate(LocalDate desiredDate);
     List getProductsModifiedAfterDate(LocalDate desiredDate);
     Map<String, List<String>> getExistingCategories();
     Map getFirstLetters();
     List getProductsWithMaxRating(LocalDate date);

}
