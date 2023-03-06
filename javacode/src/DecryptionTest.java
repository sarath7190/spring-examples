import atg.core.util.Base64;

public class DecryptionTest {

    public static void main(String args[]) {
        String decrypt="okfZyZoEaDE=";
        String raw = Base64.decodeToByteArray(decrypt.getBytes());

    }
}
