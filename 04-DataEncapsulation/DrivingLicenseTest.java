public class DrivingLicenseTest {
        public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.setName("Jack");
        dl.setSurname("Black");
        dl.setAddress("ABC123");
        dl.setPostalCode("39-222");
        dl.setCity("Krakow");
        dl.setDrivingLicenseNumber(234987234);
        dl.setYearIssued(2010);
        dl.setLicenseCategory("B");
        dl.setYearIssued(2000);
        System.out.println(dl.toString());
        }
}
    
