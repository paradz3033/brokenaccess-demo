package com.paradz.brokenaccessdemo.service;


import com.paradz.brokenaccessdemo.model.Product;
import com.paradz.brokenaccessdemo.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements MenuService {

   private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Product> getMenu() {
        return menuRepository.findAll();
    }

    @Override
    public void deleteProduct(Long id) {
        menuRepository.deleteById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return menuRepository.save(product);
    }

    @Override
    public Product saveProduct(Product product) {
        return menuRepository.save(product);
    }

}
