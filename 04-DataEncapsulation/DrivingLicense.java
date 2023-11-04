public class DrivingLicense {
   private String name;
   private String surname;
   private String address;
   private String postalCode;
   private String city;
   private int drivingLicenseNumber;
   private int yearIssued; 
   private String licenseCategory;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getSurname() {
    return surname;
}
public void setSurname(String surname) {
    this.surname = surname;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getPostalCode() {
    return postalCode;
}
public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public int getDrivingLicenseNumber() {
    return drivingLicenseNumber;
}
public void setDrivingLicenseNumber(int drivingLicenseNumber) {
    this.drivingLicenseNumber = drivingLicenseNumber;
}
public int getYearIssued() {
    return yearIssued;
}
public void setYearIssued(int yearIssued) {
    if (yearIssued >= 1980 && yearIssued<=2023){
        this.yearIssued = yearIssued;
    }else{
        System.out.println("Incorrect date");
    }
}
public String getLicenseCategory() {
    return licenseCategory;
}
public void setLicenseCategory(String licenseCategory) {
    this.licenseCategory = licenseCategory;
}
@Override
public String toString() {
    return "DrivingLicense [name=" + name + ", surname=" + surname + ", address=" + address + ", postalCode="
            + postalCode + ", city=" + city + ", drivingLicenseNumber=" + drivingLicenseNumber + ", yearIssued="
            + yearIssued + ", licenseCategory=" + licenseCategory + "]";
} 

}
