package Data.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectUserInfo {
    public static List<Object[]> getInfo() throws SQLException {

        String selectStatement = "SELECT * FROM users ;";

        try (
                Connection connection = DbConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectStatement);
        ) {
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int colCount = resultSetMetaData.getColumnCount();
            List<Object[]> dataList = new ArrayList<>();

            while (resultSet.next()) {
                Object[] rowData = new Object[colCount - 1];
                for (int i = 2; i <= colCount; i++) {
                    rowData[i - 2] = resultSet.getObject(i);
                }
                dataList.add(rowData);
            }

            return dataList;
        }
    }
}
