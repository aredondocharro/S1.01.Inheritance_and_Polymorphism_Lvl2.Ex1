public abstract class Telephone {
private final String brand;
private final String model;


    public Telephone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String num){
        System.out.println("You are currenly calling the number " +num);
    }

}
