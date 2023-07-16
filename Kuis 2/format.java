public class format {
    public static void main(String[] args) {
        String name = "Yuki";
        int age = 20;
        double height = 175.5;

        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
        System.out.println(formattedString);
    }
}
