package com.paradz.brokenaccessdemo.controller;

import com.paradz.brokenaccessdemo.model.Product;
import com.paradz.brokenaccessdemo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuController {

    MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/admin/menu")
    public ResponseEntity addProduct(@RequestBody Product product){
        Product addedProduct = menuService.addProduct(product);
        return new ResponseEntity<>(addedProduct,HttpStatus.OK);
    }

    @DeleteMapping("/admin/menu/delete/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id){
        menuService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PatchMapping("/admin/menu/updateProduct")
    public ResponseEntity updatePrice(@RequestBody Product product){
        Product updatedProduct = menuService.saveProduct(product);
        return new ResponseEntity<>(updatedProduct,HttpStatus.OK);
    }


    @GetMapping("/user/menu")
    public ResponseEntity getMenu(){
        return new ResponseEntity<>(menuService.getMenu(), HttpStatus.OK);
    }
}
