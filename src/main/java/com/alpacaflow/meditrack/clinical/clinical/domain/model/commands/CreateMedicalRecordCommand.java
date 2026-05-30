package com.alpacaflow.meditrack.clinical.clinical.domain.model.commands;

public record CreateMedicalRecordCommand(
        Long seniorCitizenId,
        String medicalHistoryDescription,
        String allergies
) {}