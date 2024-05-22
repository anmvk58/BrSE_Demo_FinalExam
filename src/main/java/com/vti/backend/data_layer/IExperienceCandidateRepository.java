package com.vti.backend.data_layer;

import com.vti.entity.ExperienceCandidate;

import java.io.IOException;
import java.sql.SQLException;

public interface IExperienceCandidateRepository {
    // Phương thức tạo 1 Experience User mới
    void registerExperienceCandidate(ExperienceCandidate experienceCandidate) throws SQLException, IOException;

    // Phương thức lấy dữ liệu password từ DB
    String getPasswordByEmail(String email) throws SQLException, IOException;
}
