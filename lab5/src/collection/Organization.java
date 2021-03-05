package collection;

import java.time.LocalDateTime;

/**
 * Class that represents Organization objects
 */
public class Organization {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Double annualTurnover; //Поле может быть null, Значение поля должно быть больше 0
    private String fullName; //Значение этого поля должно быть уникальным, Длина строки не должна быть больше 1273, Поле может быть null
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null
    private Address postalAddress; //Поле не может быть null

    /**
     * Constructor that createsOrganization objects
     * @param id
     * @param name
     * @param coordinates
     * @param creationDate
     * @param annualTurnover
     * @param fullName
     * @param employeesCount
     * @param type
     * @param postalAddress
     */
    public Organization(Long id, String name, Coordinates coordinates,  java.time.LocalDateTime creationDate, Double annualTurnover, String fullName, long employeesCount, OrganizationType type, Address postalAddress){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = java.time.LocalDateTime.now();
        this.annualTurnover = annualTurnover;
        this.fullName = fullName;
        this.employeesCount = employeesCount;
        this.postalAddress = postalAddress;
        this.type = type;
    }

    /**
     * Method that sets id of organization
     * @param id
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Method  sets name of organization
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Method  sets coordinates of organization
     * @param coordinates
     */
    public void setCoordinates(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    /**
     * Method  sets date of creation this organization
     * @param creationDate
     */
    public void setCreationDate(LocalDateTime creationDate){
        this.creationDate = creationDate;
    }

    /**
     * Method sets annual turnover of organization
     * @param annualTurnover
     */
    public void setAnnualTurnover(Double annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    /**
     * Method sets employees count of organization
     * @param employeesCount
     */
    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    /**
     * Method sets full name of organization
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Method sets postal address of organization
     * @param postalAddress
     */
    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }

    /**
     * Method sets type of organization
     * @param type
     */
    public void setType(OrganizationType type) {
        this.type = type;
    }

    /**
     * Method gets id of organization
     * @return Long id
     */
    public Long getId() {
        return id;
    }

    /**
     * Method gets name of organization
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Method gets coordinates of organization
     * @return Coordinates coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Method gets date of creation this organization
     * @return LocalDateTime creationDate
     */
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Method gets annual turnover of organization
     * @return Double annualTurnover
     */
    public Double getAnnualTurnover() {
        return annualTurnover;
    }

    /**
     * Method gets employees count of organization
     * @return long employees count
     */
    public long getEmployeesCount() {
        return employeesCount;
    }

    /**
     * Method gets full name of organization
     * @return String fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * method gets type of organization
     * @return OrganizationType type
     */
    public OrganizationType getType() {
        return type;
    }

    /**
     * method gets postal address of organization
     * @return Address postalAdress
     */
    public Address getPostalAddress() {
        return postalAddress;
    }

    @Override
    public String toString(){
        return "collection.Organization: " + "/n" +
                "id: " + id +
                ", name: " + name +
                ", coordinates: " + coordinates +
                ", creationDate: " + creationDate +
                ", annualTurnover: " + annualTurnover +
                ", employeesCount: " + employeesCount +
                ", fullName: " + fullName +
                ", type: " + type +
                ", postalAddress: " + postalAddress;
    }
}