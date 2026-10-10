package ru.university.equiprent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.university.equiprent.model.EquipmentCategory;
import java.util.List;


public interface EquipmentCategoryRepository
extends JpaRepository<EquipmentCategory,Long> {
    List<EquipmentCategory> findByName(
        String name);
}
