package model.entity;

import model.enums.Appointment_Enums;

import java.time.LocalDateTime;

public class Appointment_Entity {
    private int idAppointment;
    private String observations;
    private LocalDateTime date;
    private Appointment_Enums status;
    private Pet_Entity pet;
    private Customer_Entity customer;
    private Veterinary_Entity veterinary;

    public Appointment_Entity(String observations, LocalDateTime date, Appointment_Enums status, Pet_Entity pet, Customer_Entity customer, Veterinary_Entity veterinary) {
        setObservations(observations);
        setDate(date);
        setStatus(status);
        setPet(pet);
        setCustomer(customer);
        setVeterinary(veterinary);
    }

    public long getId() {
        return idAppointment;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Appointment_Enums getStatus() {
        return status;
    }

    public void setStatus(Appointment_Enums status) {
        this.status = status;
    }

    public Pet_Entity getPet() {
        return pet;
    }

    public void setPet(Pet_Entity pet) {
        this.pet = pet;
    }

    public Customer_Entity getCustomer() {
        return customer;
    }

    public void setCustomer(Customer_Entity customer) {
        this.customer = customer;
    }

    public Veterinary_Entity getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary_Entity veterinary) {
        this.veterinary = veterinary;
    }
}
