import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StockingStuffer {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println("hello");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] bytes = md.digest("abcdef001000000".getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte inpt : bytes) {
            stringBuilder.append(String.format("%02x", inpt));
        }

        System.out.println(stringBuilder.toString());
    }
}
