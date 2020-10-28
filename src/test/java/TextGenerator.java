import java.util.Random;

public class TextGenerator {

    private String output = "";

    public String generateText() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return output = sb.toString();
    }

    public String getOutput() {
        return output;
    }
}
