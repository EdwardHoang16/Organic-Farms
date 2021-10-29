package com.hulk.organicfarm.repositories;

import com.hulk.organicfarm.models.Farm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FarmRepository extends JpaRepository<Farm,String> {
//    @Query(value = String.valueOf("Select from Farm where city = %s ;", city))
//    public List<Farm> getFarmsNearACity(String city);
}

