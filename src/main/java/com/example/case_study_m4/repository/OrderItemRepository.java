package com.example.case_study_m4.repository;

import com.example.case_study_m4.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Integer> {

    List<OrderItem> findByOrderId(Integer orderId);
}