package com.letstart.springbootrestapi.dao;

import com.letstart.springbootrestapi.payAm.core.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseDAORepository extends JpaRepository<BaseEntity, Serializable> {
}
