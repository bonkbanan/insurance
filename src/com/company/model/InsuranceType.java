package com.company.model;/*
@USER: dench
@DATE: 24.4
@NAME: InsuranceType
@TIME: 13:58
*/

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InsuranceType {
    private String id;
    private String name;
    private String description;
    private LocalDate day;
    private int insuranceSum;
    private int tarif;
    private Filiya filiya;
    private InsuranceType type;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
