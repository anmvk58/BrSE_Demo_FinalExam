package com.vti.backend.data_layer;

import com.vti.entity.ExperienceCandidate;
import com.vti.utils.JDBCUtils;

import java.io.IOException;
import java.sql.*;

public class ExperienceCandidateRepository implements IExperienceCandidateRepository{
    private JDBCUtils jdbcUtils;

    public ExperienceCandidateRepository() {
        this.jdbcUtils = new JDBCUtils();
    }

    // Đăng kí một thành viên cho ExperienceCandidate
    public void registerExperienceCandidate(ExperienceCandidate experienceCandidate) throws SQLException, IOException {
        Connection connection = jdbcUtils.getConnection();

        String sql = "insert into experience_candidate(FIRST_NAME, LAST_NAME, PHONE, EMAIL, EXP_IN_YEAR, PRO_SKILL) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, experienceCandidate.getFirstName());
        preparedStatement.setString(2, experienceCandidate.getLastName());
        preparedStatement.setString(3, experienceCandidate.getPhone());
        preparedStatement.setString(4, experienceCandidate.getEmail());
        preparedStatement.setInt(5, experienceCandidate.getExpInYear());
        preparedStatement.setString(6, experienceCandidate.getProSkill());

        // Thực hiện lệnh insert:
        int effectedRows = preparedStatement.executeUpdate();

        if(effectedRows == 1) {
            System.out.println("Experience Candidate Create Successfully");
        } else {
            System.out.println("Experience Candidate Create Failed");
        }

        jdbcUtils.disconnect();
    }

    @Override
    public String getPasswordByEmail(String email) throws SQLException, IOException {
        Connection connection = jdbcUtils.getConnection();
        String password = "";
        String sql = "select password from experience_candidate where email = '" + email +"'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (!resultSet.next()) {
            password = "NOT_EXSIST";
        } else {
            while (resultSet.next()) {
                password = resultSet.getString("password");
            }
        }

        return password;
    }
}
