package lab29;

import java.io.Serializable;
public final class Address implements Serializable {
    private String cityName, streetName, buildingLetter;
    private int zipCode, buildingNumber, apartmentNumber, tableNumber;
    public Address EMPTY_ADDRESS;
    public Address(String cityName, int zipCode, String streetName, int buildingNumber, String buildingLetter, int apartmentNumber) {
        this.cityName=cityName;
        this.zipCode=zipCode;
        this.streetName=streetName;
        this.buildingNumber=buildingNumber;
        this.buildingLetter=buildingLetter;
        this.apartmentNumber=apartmentNumber;
    }
    public Address(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getTableNumber() {
        return tableNumber;
    }
    public String toString() {
        return "Название города: "+this.cityName+" Зип-код: "+this.zipCode+" Название улицы: "+this.streetName+ " Номер здания: "+this.buildingNumber+" Буква здания: "+this.buildingLetter+" Номер квартиры: "+this.apartmentNumber;
    }
}