public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("1111");
        Phone phoneTwo = new Phone("1112");
        phone.registration();
        phoneTwo.registration();
        Network.getPhoneBase();
        System.out.println(Network.getPhoneBase().size());
        phone.сall(phoneTwo);

    }


}
