package ru.university.equiprent.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import ru.university.equiprent.model.Equipment;
import ru.university.equiprent.service.IdGeneratorService;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    boolean existsBySerialNumber(String serialNumber);
    
}
