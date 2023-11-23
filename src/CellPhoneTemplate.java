public abstract class CellPhoneTemplate {

    abstract void getCamera(int megaPixels);

    abstract void getBrowsing(String browser);

    abstract void getEmail(String email);

    Call getCall(){
        return new Call("938908780");
    }

    Message getMessage(){
        return new Message("Hi! How are You ?");
    }

    FmRadio getFmRadio(){
        return new FmRadio(100.5);
    }

    void getMyPhone(){
        Call call=getCall();
        Message message=getMessage();
        FmRadio fmRadio=getFmRadio();

        System.out.println("MobilePhone Details: ");
        System.out.println("Contact Number to call : "+call.getContactNumber());
        System.out.println("Message : "+message.getMessage());
        System.out.println("Radio Channel : "+fmRadio.getChannel());


    }


}
