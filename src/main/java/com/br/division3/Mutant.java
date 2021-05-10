package com.br.division3;

import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

import java.util.Objects;

@Entity
public class Mutant {

    public Mutant() {
    }

    public Mutant(String firstName, String lastName, String address, String pictureLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pictureLocation = pictureLocation;
    }

    @PartitionKey
    private String firstName;
    @PartitionKey(1)
    private String lastName;
    private String address;
    private String pictureLocation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mutant mutant = (Mutant) o;
        return Objects.equals(firstName, mutant.firstName)
                && Objects.equals(lastName, mutant.lastName)
                && Objects.equals(address, mutant.address)
                && Objects.equals(pictureLocation, mutant.pictureLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, pictureLocation);
    }

    @Override
    public String toString() {
        return "Mutant{"
                + "firstName='"
                + firstName
                + '\''
                + ", lastName='"
                + lastName
                + '\''
                + ", address='"
                + address
                + '\''
                + ", pictureLocation='"
                + pictureLocation
                + '\''
                + '}';
    }
}
