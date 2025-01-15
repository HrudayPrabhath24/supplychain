package com.wecp.progressive.service;

import com.wecp.progressive.entity.Shipment;

import java.sql.SQLException;
import java.util.List;

public interface ShipmentService {
    List<Shipment> getAllShipments() throws SQLException;

    Shipment getShipmentById(int shipmentId) throws SQLException;

<<<<<<< HEAD
    int addShipment(Shipment shipment)throws SQLException;
=======
    int addShipment(Shipment shipment) throws SQLException;
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758

    void updateShipment(Shipment shipment) throws SQLException;

    void deleteShipment(int shipmentId) throws SQLException;

}
