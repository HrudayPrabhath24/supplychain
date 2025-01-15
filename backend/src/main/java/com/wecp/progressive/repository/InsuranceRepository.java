package com.wecp.progressive.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer>{
=======
import com.wecp.progressive.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

    Insurance findByInsuranceId(int insuranceId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Insurance ins WHERE ins.shipment.shipmentId = :shipmentId")
    void deleteByShipmentId(@Param("shipmentId") int shipmentId);
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
}
