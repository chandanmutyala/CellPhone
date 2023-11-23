public class CellPhoneFinal extends CellPhoneTemplate{


    @Override
    void getCamera(int megaPixels) {
    System.out.println("Your Mobile has " + megaPixels + " mp Camera.");
    }

    @Override
    void getBrowsing(String browser) {
        System.out.println("Your Mobile has " + browser + " to browse.");
    }

    @Override
    void getEmail(String email) {
        System.out.println("Your Mobile has " + email + " to mail");
    }
}
