package com.example.medical.domain;

import java.time.LocalDateTime;

public class MedicalOrder {
    private Long id;
    private String order_no;
    private String sub_order_no;
    private String medical_content;
    private LocalDateTime start_time;
    private LocalDateTime end_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return order_no;
    }

    public void setOrderNo(String orderNo) {
        this.order_no = orderNo;
    }

    public String getSubOrderNo() {
        return sub_order_no;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.sub_order_no = subOrderNo;
    }

    public String getMedicalContent() {
        return medical_content;
    }

    public void setMedicalContent(String medicalContent) {
        this.medical_content = medicalContent;
    }

    public LocalDateTime getStartTime() {
        return start_time;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.start_time = startTime;
    }

    public LocalDateTime getEndTime() {
        return end_time;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.end_time = endTime;
    }
}