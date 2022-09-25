public class Main {
    // ctrl + shift + alt + l (reformat)
    // aynı notu almak için aradaki system out kodunu kaldırabilir caseleri altalta yazabiliriz
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println(("Perfect: Pass"));
                break;
            case 'B':
                System.out.println(("Very Good: Pass"));
                break;
            case 'C':
                System.out.println(("Good: Pass"));
            case 'D':
                System.out.println(("Not Bad: Pass"));
                break;
            case 'F':
                System.out.println(("Unfortunately Fail"));
                break;
            default:
                System.out.println(("Undefined Grade"));

        }
    }
}