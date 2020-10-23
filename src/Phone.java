import java.util.PrimitiveIterator;

public class Phone {

    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

    public Phone() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void сall ( Phone phone) {

       for(int i=0;i< Network.getPhoneBase().size(); i++) {
           if(Network.getPhoneBase().get(i).equals(phone)) {
               System.out.println("Call");
               return;
           }
       }
        System.out.println("No such number exists");
    }
   public void registration() {

        Network.networkAdd( this);
   }

}
