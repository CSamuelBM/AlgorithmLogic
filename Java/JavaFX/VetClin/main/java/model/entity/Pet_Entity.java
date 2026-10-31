package model.entity;

import java.time.LocalDate;

public class Pet_Entity {

    private int idPet;
    private String name;
    private String species;
    private String breed;
    private LocalDate birthday;
    private Customer_Entity customer;

    public Pet_Entity(String name, String species, String breed, LocalDate birthday, Customer_Entity customer) {
        setName(name);
        setSpecies(species);
        setBreed(breed);
        setBirthday(birthday);
        setCustomer(customer);
    }

    public long getIdPet() {
        return idPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Customer_Entity getCustomer() {
        return customer;
    }

    public void setCustomer(Customer_Entity customer) {
        this.customer = customer;
    }

}
