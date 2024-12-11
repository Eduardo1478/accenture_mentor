package OOP;

public class Main {
    public static void main(String[] args) {
        cellular myPhone = new cellular();
        myPhone.setBateria(50);
        System.out.println("Battery level: " + myPhone.getBateria());
        myPhone.cargarBateria(30);
    }
}
