public class IfMethod {

    public static void main(String[] args) {
        int age = 99;

        String result = checkIfPersonIs18( 478);

        System.out.println(result);
    }

    public static String checkIfPersonIs18(int age) {

        if (age > 18) {
            System.out.println("Ja Person ist älter als 18!");        System.out.println("Methode checkIfPersonIs18");

            return "18";
        } else if (age < 18) {
            System.out.println("Nein, Person ist jünger als 18.");
            return "<18";
        } else {
            System.out.println("Ist genau 18!");
            return "18";
        }
    }

    public static String checkIfPersonIs18(int age, String name) {
        return "";
    }

    public static String checkIfPersonIs18(String name, int age) {
        return "";
    }

    public static void testAbc(String name) {
        String a = "";
    }
}
