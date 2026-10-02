package com.distribuidos.Autos.Repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribuidos.Autos.Model.Auto;

@Repository
public interface IAutoRepository extends JpaRepository<Auto,Long> {

}
