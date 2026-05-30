package com.alpacaflow.meditrack.clinical.clinical.domain.exceptions;

public class MedicalRecordNotFoundException extends RuntimeException {
    public MedicalRecordNotFoundException(String message) {
        super(message);
    }
}
