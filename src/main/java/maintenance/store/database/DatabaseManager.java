package maintenance.store.database;

import maintenance.store.interfaces.ICrud;
import maintenance.store.model.Part;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager implements ICrud {
    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:./maintenanceDB";
    private static final String DB_USERNAME = "";
    private static final String DB_PASSWORD = "";
    private Connection connection;
    private Statement stmt;

    private static final String CREATE_TABLE = " CREATE TABLE IF NOT EXISTS PARTS " +
            "(id bigint auto_increment NOT NULL PRIMARY KEY, " +
            "company VARCHAR(255), " +
            "model VARCHAR (255), " +
            "description VARCHAR(255 ), " +
            "quantity bigint, " +
            "sap_actual_quantity bigint) ";

    public DatabaseManager() {
        openConnection();
    }

    private void openConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            stmt = connection.createStatement();
            stmt.execute(CREATE_TABLE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Part> getAllParts() {
        String sql = "SELECT * FROM parts";
        ArrayList<Part> parts = new ArrayList<Part>();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Part part = new Part();
                parts.add(part);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return parts;
    }
}
