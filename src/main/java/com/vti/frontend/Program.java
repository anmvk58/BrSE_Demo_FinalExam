package com.vti.frontend;

import com.vti.backend.presentation_layer.ExperienceCandidateController;
import com.vti.backend.presentation_layer.FresherCandidateController;
import sun.security.rsa.RSAUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException, IOException {
        ExperienceCandidateController experienceCandidateController = new ExperienceCandidateController();
        FresherCandidateController fresherCandidateController = new FresherCandidateController();
        Scanner scanner = new Scanner(System.in);

        experienceCandidateController.loginExperienceCandidate();

//        System.out.println("Bạn muốn tạo User loại nào ???");
//        System.out.println("1-Experience User  |  2-Fresher User");
//        int choice = scanner.nextInt();
//
//        switch (choice){
//            case 1:
//                experienceCandidateController.registerExperienceCandidate();
//                break;
//            case 2:
////                fresherCandidateController
//                break;
//            default:
//                System.out.println("Chọn sai lựa chọn, mời thử lại");
//                System.exit(1);
//        }

    }
}
