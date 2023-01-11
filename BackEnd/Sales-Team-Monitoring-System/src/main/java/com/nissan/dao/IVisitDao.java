package com.nissan.dao;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Visit;

@Repository
public interface IVisitDao extends JpaRepository<Visit, Integer> {

}
