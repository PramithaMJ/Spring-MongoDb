package com.mongo.springmongo.repository;

import com.mongo.springmongo.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface ProductRepository extends MongoRepository < Product, Long > {

}