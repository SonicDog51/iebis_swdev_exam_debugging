import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        for (int i =0; i<20;i++) {
            System.out.println(string_Generator());
        }
    }

    public static String string_Generator(){
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        StringBuffer word = null;
        int number = random.nextInt(3);
        switch (number) {
            case 0:
                word = new StringBuffer();
                word.append('Y');
                break;
            case 1:
                word = new StringBuffer();
                word.append('T');
                break;
            case 2:
                word = new StringBuffer();
                word.append('F');
                break;
            default:
                System.out.println("this shouldn't appear");
        }

        word.append('o');
        word.append('u');
        word.append('r');

        return word + " " + formattedEmailAddress;


    }
}
