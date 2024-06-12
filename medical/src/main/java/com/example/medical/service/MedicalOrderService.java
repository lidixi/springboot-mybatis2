package com.example.medical.service;

import com.example.medical.domain.MedicalOrder;
import com.example.medical.mapper.MedicalOrderMapper;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MedicalOrderService {

    private final MedicalOrderMapper medicalOrderMapper;
    public MedicalOrderService(MedicalOrderMapper medicalOrderMapper) {

        this.medicalOrderMapper = medicalOrderMapper;
    }

    public List<MedicalOrder> findByOrderNoAndTime(String orderNo, LocalDateTime time) {
        return medicalOrderMapper.findByOrderNoAndTime(orderNo, time);
    }

    public MedicalOrder findById(Long id) {
        return medicalOrderMapper.findById(id);
    }

    public boolean saveOrUpdate(MedicalOrder medicalOrder) {
        return medicalOrderMapper.saveOrUpdate(medicalOrder);
    }

    public List<MedicalOrder> findByContentLike(String medicalContent) {
        return medicalOrderMapper.findByContentLike(medicalContent);
    }

    //计数结束时间大于当前系统时间的医嘱数量
    public int countActiveOrders() {
        List<MedicalOrder> orders = medicalOrderMapper.findAll();
        int count = 0;
        for (MedicalOrder order : orders) {
            if (order.getEndTime().isAfter(LocalDateTime.now())) {
                count++;
            }
        }
        return count;
    }
}
