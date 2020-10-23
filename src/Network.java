import java.util.ArrayList;
import java.util.List;

public class Network {
    private  static List phoneBase = new ArrayList();

    public Network() {

    }
    public static void networkAdd(Phone phone) {
        phoneBase.add(phone);
    }

    public static List getPhoneBase() {
        return phoneBase;
    }
}
