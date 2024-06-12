package com.example.medical.domain;

import java.time.LocalDateTime;

public class Prescription extends MedicalOrder {
    private String item_name;
    private String content;
    private String dosage;

    public String getItemName() {
        return item_name;
    }

    public void setItemName(String itemName) {
        this.item_name = itemName;
    }

    public String getPrescriptionContent() {
        return content;
    }

    public void setPrescriptionContent(String prescriptionContent) {
        this.content = prescriptionContent;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
