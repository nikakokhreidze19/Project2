package Data.Database;

import Data.DataOfInsertQuery;

import java.sql.*;

public class InsertUserInfo {


    public static void insertData() {

        String insertInfo = "INSERT INTO users(firstName,lastName,phone,email,dateOfBirth,password) "
                + "VALUES(?,?,?,?,?,?)";

        try (
                Connection connection = DbConnection.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(insertInfo);

        ) {


            pstmt.setString(1, DataOfInsertQuery.name);
            pstmt.setString(2, DataOfInsertQuery.lastName);
            pstmt.setString(3, DataOfInsertQuery.phone);
            pstmt.setString(4, DataOfInsertQuery.email);
            pstmt.setString(5, String.valueOf(DataOfInsertQuery.dateOfBirth));
            pstmt.setString(6, DataOfInsertQuery.password);

            pstmt.execute();


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }
}



