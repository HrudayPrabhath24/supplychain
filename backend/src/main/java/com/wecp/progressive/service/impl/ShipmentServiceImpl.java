// @Service
// public class ShipmentServiceImpl implements ShipmentService  {

<<<<<<< HEAD
//     @Autowired
//     ShipmentRepository shipmentRepository;

//     @Override
//     public List<Shipment> getAllShipments() {
//         return shipmentRepository.findAll();
//     }

//     @Override
//     public Shipment getShipmentById(int shipmentId) {
//         return shipmentRepository.findByShipmentId(shipmentId);
//     }

//     @Override
//     public int addShipment(Shipment shipment) {
//         return shipmentRepository.save(shipment).getShipmentId();
//     }

//     @Override
//     public void updateShipment(Shipment shipment) {
//         shipmentRepository.save(shipment);
//     }

//     @Override
//     public void deleteShipment(int shipmentId) {
//         shipmentRepository.deleteById(shipmentId);
//     }

// }

package com.wecp.progressive.service.impl;

=======
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
import com.wecp.progressive.entity.Shipment;
import com.wecp.progressive.repository.InsuranceRepository;
import com.wecp.progressive.repository.ShipmentRepository;
import com.wecp.progressive.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD

import java.sql.SQLException;
import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {
=======

import java.sql.SQLException;
import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    ShipmentRepository shipmentRepository;

    @Autowired
    InsuranceRepository insuranceRepository;
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758

    @Autowired
    ShipmentRepository shipmentRepository;
    
    @Override
    public List<Shipment> getAllShipments() throws SQLException {
        return shipmentRepository.findAll();
    }

    @Override
    public Shipment getShipmentById(int shipmentId) throws SQLException {
        return shipmentRepository.findByShipmentId(shipmentId);
    }

    @Override
    public int addShipment(Shipment shipment) throws SQLException {
        return shipmentRepository.save(shipment).getShipmentId();
    }

    @Override
    public void updateShipment(Shipment shipment) throws SQLException {
        shipmentRepository.save(shipment);
    }

    @Override
    public void deleteShipment(int shipmentId) throws SQLException {
<<<<<<< HEAD
=======
        insuranceRepository.deleteByShipmentId(shipmentId);
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        shipmentRepository.deleteById(shipmentId);
    }
}