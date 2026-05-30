package com.alpacaflow.meditrack.clinical.clinical.domain.model.commands;

public record UpdatePatientThresholdCommand(
        Long seniorCitizenId,
        int minBpm,
        int maxBpm,
        int minSpo2,
        double minCelsius,
        double maxCelsius
) {}