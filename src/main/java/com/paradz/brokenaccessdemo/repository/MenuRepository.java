package com.paradz.brokenaccessdemo.repository;

import com.paradz.brokenaccessdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Product, Long> {
}
