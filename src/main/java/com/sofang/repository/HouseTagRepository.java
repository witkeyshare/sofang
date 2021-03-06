package com.sofang.repository;

import java.util.List;

import com.sofang.entity.HouseTag;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gegf.
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {

    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
