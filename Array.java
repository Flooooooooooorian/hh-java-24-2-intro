import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] ages = new int[10];

        ages[0] = 18;
        ages[1] = 59;
        ages[2] = 60;
        ages[3] = 75;
        ages[4] = 12;
        ages[5] = 31;
        ages[6] = 23;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        System.out.println(ages[5]);
        System.out.println(ages[6]);
        System.out.println(ages[9]);


        String[] names = new String[3];

        names[0] = "Florian";
        names[1] = "Daniel";
        names[2] = "Sara";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(Arrays.toString(names));

        for(int i = -1; i <= 25; i = i + 2) {
            System.out.println("Schleifen Durchlauf: " + i);
        }

        for(int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
