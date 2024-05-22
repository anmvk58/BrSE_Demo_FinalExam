package com.vti.backend.business_layer;

import com.vti.entity.ExperienceCandidate;

import java.io.IOException;
import java.sql.SQLException;

public interface IExperienceCandidateService {
    void registerExperienceCandidate(ExperienceCandidate experienceCandidate) throws SQLException, IOException;

    void loginExperienceCandidate(String email, String password) throws SQLException, IOException;
}
