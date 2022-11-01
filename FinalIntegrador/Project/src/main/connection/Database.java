package main.connection;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class);

    public static Connection getConnection(){

        Connection connection = null;
        DriverManager driverManager = null;

        try {
            Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
            connection = driverManager.getConnection("jdbc:h2:~/h2-project", "sa", "");

        } catch (Exception e){
            LOGGER.error("Error1", e);
        }

        return connection;
    }



}
