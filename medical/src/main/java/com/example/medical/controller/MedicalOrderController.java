package com.example.medical.controller;

import com.example.medical.domain.MedicalOrder;
import com.example.medical.service.MedicalOrderService;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/medicalOrder")
public class MedicalOrderController {
    private final MedicalOrderService medicalOrderService;

    public MedicalOrderController(MedicalOrderService medicalOrderService) {
        this.medicalOrderService = medicalOrderService;
    }

    @GetMapping("/byOrderNoAndTime")
    public List<MedicalOrder> findByOrderNoAndTime(@RequestParam String orderNo, @RequestParam LocalDateTime time) {
        return medicalOrderService.findByOrderNoAndTime(orderNo, time);
    }

    @GetMapping("/byId")
    public MedicalOrder findById(@RequestParam Long id) {
        return medicalOrderService.findById(id);
    }

    @PostMapping("/saveOrUpdate")
    public boolean saveOrUpdate(@RequestBody MedicalOrder medicalOrder) {
        return medicalOrderService.saveOrUpdate(medicalOrder);
    }

    @GetMapping("/byContentLike")
    public List<MedicalOrder> findByContentLike(@RequestParam String medicalContent) {
        return medicalOrderService.findByContentLike(medicalContent);
    }

    @GetMapping("/countActiveOrders")
    public int countActiveOrders() {
        return medicalOrderService.countActiveOrders();
    }
}
