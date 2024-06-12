package com.example.medical.service;

import com.example.medical.domain.Prescription;
import com.example.medical.mapper.PrescriptionMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PrescriptionService {
    private final PrescriptionMapper prescriptionMapper;

    public PrescriptionService(PrescriptionMapper prescriptionMapper) {
        this.prescriptionMapper = prescriptionMapper;
    }

    public List<Prescription> findByOrderNoAndSubOrderNo(String orderNo, String subOrderNo) {
        return prescriptionMapper.findByOrderNoAndSubOrderNo(orderNo, subOrderNo);
    }

    public Prescription findById(Long id) {
        return prescriptionMapper.findById(id);
    }

    public void saveOrUpdate(Prescription prescription) {
        prescriptionMapper.saveOrUpdate(prescription);
    }
}
