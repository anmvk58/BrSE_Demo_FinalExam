package com.vti.backend.presentation_layer;

import com.vti.backend.business_layer.ExperienceCandidateService;
import com.vti.backend.business_layer.IExperienceCandidateService;
import com.vti.entity.ExperienceCandidate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExperienceCandidateController {
    private IExperienceCandidateService service;
    private Scanner scanner;

    public ExperienceCandidateController() {
        this.service = new ExperienceCandidateService();
        this.scanner = new Scanner(System.in);
    }

    public void registerExperienceCandidate() throws SQLException, IOException {
        System.out.println("Mời nhập thông tin Experience Candidate:");
        System.out.println("Nhập FirstName: ");
        String inputFirstName = scanner.nextLine();
        System.out.println("Nhập LastName: ");
        String inputLastName = scanner.nextLine();
        System.out.println("Nhập Phone: ");
        String inputPhone = scanner.nextLine();
        // validate Phone:
        if (inputPhone.length() != 10){
            System.out.println("Phone is not Valid, please try again");
            System.exit(1);
        }

        System.out.println("Nhập Email: ");
        String inputEmail = scanner.nextLine();
        // validate email
        if(!inputEmail.contains("@")){
            System.out.println("Email is not Valid, please try again");
            System.exit(1);
        }

        System.out.println("Nhập Exp In Year: ");
        int inputExp = scanner.nextInt();
        // validate Exp in Year
        if (inputExp <= 0 || inputExp >= 10){
            System.out.println("Exp In Year is not Valid, please try again");
            System.exit(1);
        }

        scanner.nextLine();
        System.out.println("Nhập Pro Skill: ");
        String inputProSkill = scanner.nextLine();

        ExperienceCandidate experienceCandidate = new ExperienceCandidate(
                inputFirstName,
                inputLastName,
                inputPhone,
                inputEmail,
                inputExp,
                inputProSkill
        );

        System.out.println("Đang thực hiện tạo user mới ...");
        service.registerExperienceCandidate(experienceCandidate);
    }

    public void loginExperienceCandidate() throws SQLException, IOException {
        System.out.println("------- LOGIN -------");
        System.out.println("Mời nhập Email");
        String inputEmail = scanner.nextLine();
        // validate email
        if(!inputEmail.contains("@")){
            System.out.println("Email is not Valid, please try again");
            System.exit(1);
        }
        System.out.println("Mời nhập Password");
        String inputPassword = scanner.nextLine();

        service.loginExperienceCandidate(inputEmail, inputPassword);
    }
}
