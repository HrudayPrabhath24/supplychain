package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
import com.wecp.progressive.entity.Insurance;
import com.wecp.progressive.repository.InsuranceRepository;
import com.wecp.progressive.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    InsuranceRepository insuranceRepository;

<<<<<<< HEAD
@Service
public class InsuranceServiceImpl implements InsuranceService  {
    
    @Autowired
    InsuranceRepository insuranceRepository;

    @Override
    public List<Insurance> getAllInsurances() {
        // TODO Auto-generated method stub
=======
    @Override
    public List<Insurance> getAllInsurances() throws SQLException {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        return insuranceRepository.findAll();
    }

    @Override
<<<<<<< HEAD
    public int addInsurance(Insurance insurance) {
        // TODO Auto-generated method stub
=======
    public int addInsurance(Insurance insurance) throws SQLException {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        return insuranceRepository.save(insurance).getInsuranceId();
    }

    @Override
<<<<<<< HEAD
    public Insurance getInsuranceById(int insuranceId) {
        // TODO Auto-generated method stub
        return insuranceRepository.findById(insuranceId).orElse(null);
    }

    @Override
    public void updateInsurance(Insurance insurance) {
        insuranceRepository.save(insurance);
        
    }

    @Override
    public void deleteInsurance(int insuranceId) {
        // TODO Auto-generated method stub
=======
    public Insurance getInsuranceById(int insuranceId) throws SQLException {
        return insuranceRepository.findByInsuranceId(insuranceId);
    }

    @Override
    public void updateInsurance(Insurance insurance) throws SQLException {
        insuranceRepository.save(insurance);
    }

    @Override
    public void deleteInsurance(int insuranceId) throws SQLException {
>>>>>>> 1eee3bb0ecd58eb6a992a32ee4e9dc8c3743f758
        insuranceRepository.deleteById(insuranceId);
    }
}