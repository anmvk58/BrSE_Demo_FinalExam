package com.vti.backend.business_layer;

import com.vti.backend.data_layer.ExperienceCandidateRepository;
import com.vti.backend.data_layer.IExperienceCandidateRepository;
import com.vti.entity.ExperienceCandidate;

import java.io.IOException;
import java.sql.SQLException;

public class ExperienceCandidateService implements IExperienceCandidateService{
    private IExperienceCandidateRepository repository;

    public ExperienceCandidateService() {
        this.repository = new ExperienceCandidateRepository();
    }

    @Override
    public void registerExperienceCandidate(ExperienceCandidate experienceCandidate) throws SQLException, IOException {
        repository.registerExperienceCandidate(experienceCandidate);
    }

    @Override
    public void loginExperienceCandidate(String email, String password) throws SQLException, IOException {
        String dbPassword = repository.getPasswordByEmail(email);

        if (dbPassword.equals("NOT_EXSIST")){
            System.out.println("Email không tồn tại trong hệ thống !");
        } else {
            if (dbPassword.equals(password)){
                System.out.println("Đăng nhập thành công !!!");
            } else {
                System.out.println("Mật khẩu không chính xác !!!");
            }
        }


    }
}
