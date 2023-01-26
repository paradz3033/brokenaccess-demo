package com.paradz.brokenaccessdemo.service;


import com.paradz.brokenaccessdemo.model.Product;

import java.util.List;

public interface MenuService {

    List<Product> getMenu();
    void deleteProduct (Long id);
    Product addProduct (Product product);
    Product saveProduct (Product product);

}
