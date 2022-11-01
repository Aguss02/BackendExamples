package main.model;

import main.connection.Database;
import org.apache.log4j.Logger;

import java.util.Date;

public class Patient {

    private Integer id;
    private String surname;
    private String name;
    private String address;
    private Integer dni;

    private static final Logger LOGGER = Logger.getLogger(Patient.class);

    private Date registrationDate;

    public Patient(Integer id, String surname, String name, String address, Integer dni, Date registrationDate) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.address = address;
        this.dni = dni;
        this.registrationDate = registrationDate;
        LOGGER.info("El paciente: " + name + " fue creado");
    }

    public Patient(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

}
