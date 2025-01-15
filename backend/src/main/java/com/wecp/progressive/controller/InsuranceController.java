package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Insurance;
<<<<<<< HEAD
import com.wecp.progressive.service.InsuranceService;
import com.wecp.progressive.service.impl.InsuranceServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.wecp.progressive.service.impl.InsuranceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    @Autowired
<<<<<<< HEAD
    InsuranceServiceImpl insuranceServiceImpl;
=======
    InsuranceServiceImpl insuranceService;
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758

    @GetMapping
    public ResponseEntity<List<Insurance>> getAllInsurances() {
        try {
<<<<<<< HEAD
            return new ResponseEntity<>(insuranceServiceImpl.getAllInsurances(), HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
=======
            List<Insurance> insuranceList = insuranceService.getAllInsurances();
            return new ResponseEntity<>(insuranceList, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
    }

    @GetMapping("/{insuranceId}")
    public ResponseEntity<Insurance> getInsuranceById(@PathVariable int insuranceId) {
        try {
<<<<<<< HEAD
            Insurance inr = insuranceServiceImpl.getInsuranceById(insuranceId);
            if(inr == null)
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            return new ResponseEntity<>(inr, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
=======
            Insurance insurance = insuranceService.getInsuranceById(insuranceId);
            if (insurance != null) {
                return new ResponseEntity<>(insurance, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (SQLException e) {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
<<<<<<< HEAD
    public ResponseEntity<?> createInsurance(Insurance insurance) {
        try {
            return new ResponseEntity<>(insuranceServiceImpl.getAllInsurances(), HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
=======
    public ResponseEntity<Integer> createInsurance(@RequestBody Insurance insurance) {
        try {
            int insuranceId = insuranceService.addInsurance(insurance);
            return new ResponseEntity<>(insuranceId, HttpStatus.CREATED);
        } catch (SQLException e) {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{insuranceId}")
<<<<<<< HEAD
    public ResponseEntity<Void> updateInsurance(int insuranceId, Insurance insurance) {
        try {
            insurance.setInsuranceId(insuranceId);
            insuranceServiceImpl.updateInsurance(insurance);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
=======
    public ResponseEntity<Void> updateInsurance(@PathVariable int insuranceId, @RequestBody Insurance insurance) {
        try {
            insurance.setInsuranceId(insuranceId);
            insuranceService.updateInsurance(insurance);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (SQLException e) {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

<<<<<<< HEAD
    public ResponseEntity<Void> deleteInsurance(int insuranceId) {
        try {
            insuranceServiceImpl.getAllInsurances();
            return new ResponseEntity<>( HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
=======
    @DeleteMapping("/{insuranceId}")
    public ResponseEntity<Void> deleteInsurance(@PathVariable int insuranceId) {
        try {
            insuranceService.deleteInsurance(insuranceId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
