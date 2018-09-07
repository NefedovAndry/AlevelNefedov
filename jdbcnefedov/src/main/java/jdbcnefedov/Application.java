package jdbcnefedov;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        Properties connectionProps = new Properties();
        try (InputStream props = Application.class.getResourceAsStream("/datasource.properties")) {
            connectionProps.load(props);
        } catch (IOException e) {
            panic(e);
        }
        String url = connectionProps.getProperty("url");
        try (Connection connection = DriverManager.getConnection(url, connectionProps)) {
            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ranks")) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    long id = resultSet.getLong("id");
                    String name = resultSet.getString("name");
                    long lowerThreshold = resultSet.getLong("lower_t");
                    long upperThreshold = resultSet.getLong("upper_t");
                    System.out.printf("id: %d, name: %s, lower_t: %d, upper_t: %d;\n",
                            id, name, lowerThreshold, upperThreshold);
                }
            }
        } catch (SQLException e) {
            panic(e);
        }


    }

    public static void panic(Throwable e) {
        e.printStackTrace();
        System.exit(1);
    }

}
