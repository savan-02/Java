public class Arrays {
    public static void main(String[] args) {
        
        // javac file Name
        // java classname
        // cd foldername
        // cd ..
        // mkdir foldername
        // cls clear screen
        // javac 

        int a = 10;
        Integer i = 50;
        String n = "Hello Test Data";
        Character c;
        Float d;
        // n = i.toString();
        String names[] = n.split(" ");
        // a = Integer.parseInt(n);

        for (int j = 0; j < names.length; j++) {
            System.out.println(""+names[j]);
        }

    }
}

class Student {

    String name;
    String surname;
    String email;
    String address;

}