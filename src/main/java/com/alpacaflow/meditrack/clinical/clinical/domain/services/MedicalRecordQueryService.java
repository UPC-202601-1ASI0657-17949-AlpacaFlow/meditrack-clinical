package com.alpacaflow.meditrack.clinical.clinical.domain.services;

import com.alpacaflow.meditrack.clinical.clinical.domain.model.aggregates.MedicalRecord;
import com.alpacaflow.meditrack.clinical.clinical.domain.model.queries.GetAllMedicalRecordsQuery;
import com.alpacaflow.meditrack.clinical.clinical.domain.model.queries.GetMedicalRecordBySeniorCitizenIdQuery;

import java.util.List;
import java.util.Optional;

public interface MedicalRecordQueryService {
    Optional<MedicalRecord> handle(GetMedicalRecordBySeniorCitizenIdQuery query);
    List<MedicalRecord> handle(GetAllMedicalRecordsQuery query);

}