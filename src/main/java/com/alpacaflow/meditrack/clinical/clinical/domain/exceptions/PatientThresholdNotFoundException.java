package com.alpacaflow.meditrack.clinical.clinical.domain.exceptions;

public class PatientThresholdNotFoundException extends RuntimeException {
    public PatientThresholdNotFoundException(String message) {
        super(message);
    }
}
