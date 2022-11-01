package main;

import main.connection.Database;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static final String SQL_CREATE_TABLE_DENTIST = "DROP TABLE IF EXISTS DENTIST; CREATE TABLE DENTIST "
            + "("
            + " ID INT PRIMARY KEY,"
            + " SURNAME varchar(100) NOT NULL, "
            + " NAME varchar(100) NOT NULL, "
            + " MEDICALLICENSE varchar(100) NOT NULL "
            + " )";

    private static final String SQL_INSERT_DENTIST1 = "INSERT INTO DENTIST (ID, SURNAME, NAME, MEDICALLICENSE) VALUES (1, 'Perez', 'Pancho', '12345abc')";

    private static final String SQL_INSERT_DENTIST2 = "INSERT INTO DENTIST (ID, SURNAME, NAME, MEDICALLICENSE) VALUES (2, 'Gonzalez', 'Panchito', '12346abc')";

    private static final String SQL_CREATE_TABLE_PATIENT = "DROP TABLE IF EXISTS PATIENT; CREATE TABLE PATIENT "
            + "("
            + " ID INT PRIMARY KEY,"
            + " SURNAME varchar(100) NOT NULL, "
            + " NAME varchar(100) NOT NULL, "
            + " ADDRESS varchar(100) NOT NULL, "
            + " DNI varchar(100) NOT NULL, "
            + " REGISTRATIONDATE date NOT NULL "
            + " )";

    private static final String SQL_INSERT_PATIENT1 = "INSERT INTO PATIENT (ID, SURNAME, NAME, ADDRESS, DNI, REGISTRATIONDATE) VALUES (1, 'Fernandez', 'Matias', 'Avenida siempre viva', '6789abc', '2022-11-01')";

    private static final String SQL_INSERT_PATIENT2 = "INSERT INTO PATIENT (ID, SURNAME, NAME, ADDRESS, DNI, REGISTRATIONDATE) VALUES (2, 'Garcia', 'Malena', 'Calle false 123', '223344abc', '2022-11-02')";

    public static void showDataPatient(Connection connection) throws SQLException {
        String selectPatient = "SELECT * FROM PATIENT";
        Statement statementSelect = connection.createStatement();
        ResultSet rs = statementSelect.executeQuery(selectPatient);
        while (rs.next()) {
            LOGGER.info(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + " - " + rs.getString(6));
        }
    }


    public static void main(String[] args) {

        Connection connection = Database.getConnection();

        try {
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE_DENTIST);

            Statement statement1 = connection.createStatement();
            statement1.execute(SQL_INSERT_DENTIST1);

            Statement statement2 = connection.createStatement();
            statement2.execute(SQL_INSERT_DENTIST2);

            Statement statement3 = connection.createStatement();
            statement3.execute(SQL_CREATE_TABLE_PATIENT);

            Statement statement4 = connection.createStatement();
            statement4.execute(SQL_INSERT_PATIENT1);

            Statement statement5 = connection.createStatement();
            statement5.execute(SQL_INSERT_PATIENT2);

            showDataPatient(connection);

        } catch (Exception e) {
            LOGGER.error("An error has occurred", e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
