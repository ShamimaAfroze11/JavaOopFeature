public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setId(12);
        System.out.println(encapsulation.getId());
        encapsulation.setName("Sourav");
        System.out.println(encapsulation.getName());
        encapsulation.setAge(32);
        System.out.println(encapsulation.getAge());
        encapsulation.setProduct("Foundation");
        System.out.println(encapsulation.getProduct());
        encapsulation.setNumber(3.56790F);
        System.out.println(encapsulation.getNumber());
    }
}
