public class Smartphone extends Telephone implements Camera, Watch {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photo() {
        System.out.println("Taking a picture");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm is ringing");
    }
}
