package command.vendors;

public class Light {

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void lightsOn(){
        System.out.println("Lights in "+name+" are on.");
    }

    public void lightsOff(){
        System.out.println("Lights in "+name+" are off.");
    }

}
