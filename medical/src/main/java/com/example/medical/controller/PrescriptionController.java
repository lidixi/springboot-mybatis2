package com.example.medical.controller;

import com.example.medical.domain.Prescription;
import com.example.medical.service.PrescriptionService;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    private final PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping("/byOrderNoAndSubOrderNo")
    public List<Prescription> findByOrderNoAndSubOrderNo(@RequestParam String orderNo, @RequestParam String subOrderNo) {
        return prescriptionService.findByOrderNoAndSubOrderNo(orderNo, subOrderNo);
    }

    @GetMapping("/byId")
    public Prescription findById(@RequestParam Long id) {
        return prescriptionService.findById(id);
    }

    @PostMapping("/saveOrUpdate")
    public void saveOrUpdate(@RequestBody Prescription prescription) {
        prescriptionService.saveOrUpdate(prescription);
    }
}
