package com.alpacaflow.meditrack.clinical.clinical.domain.services;

import com.alpacaflow.meditrack.clinical.clinical.domain.model.aggregates.MedicalRecord;
import com.alpacaflow.meditrack.clinical.clinical.domain.model.commands.CreateMedicalRecordCommand;
import com.alpacaflow.meditrack.clinical.clinical.domain.model.commands.UpdateMedicalRecordCommand;
import java.util.Optional;

public interface MedicalRecordCommandService {
    Optional<MedicalRecord> handle(CreateMedicalRecordCommand command);
    Optional<MedicalRecord> handle(UpdateMedicalRecordCommand command);
}