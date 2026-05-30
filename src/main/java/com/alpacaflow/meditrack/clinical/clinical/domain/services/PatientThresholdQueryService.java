package com.alpacaflow.meditrack.clinical.clinical.domain.services;

import com.alpacaflow.meditrack.clinical.clinical.domain.model.aggregates.PatientThreshold;
import com.alpacaflow.meditrack.clinical.clinical.domain.model.queries.GetAllPatientThresholdQuery;
import com.alpacaflow.meditrack.clinical.clinical.domain.model.queries.GetPatientThresholdBySeniorCitizenIdQuery;

import java.util.List;
import java.util.Optional;

public interface PatientThresholdQueryService {
    Optional<PatientThreshold> handle(GetPatientThresholdBySeniorCitizenIdQuery query);
    List<PatientThreshold> handle(GetAllPatientThresholdQuery query);
}