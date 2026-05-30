package com.alpacaflow.meditrack.clinical.clinical.domain.model.commands;

public record UpdateMedicalRecordCommand(
        Long seniorCitizenId,
        String medicalHistoryDescription,
        String allergies
) {}