public class CellClient {
    public static void main(String[] args) {
        CellPhoneFinal cellPhoneFinal = new CellPhoneFinal();
        cellPhoneFinal.getCamera(64);
        cellPhoneFinal.getBrowsing("GoogleChrome");
        cellPhoneFinal.getEmail("Gmail");
        CellPhoneTemplate cellPhoneTemplate = new CellPhoneFinal();
        cellPhoneTemplate.getMyPhone();
    }
}
