import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main (String[] args) {

       // List<String> skuIdsList = Arrays.asList("us_3463031","ca_3463032","3473016");
        List<String> skuIdsList = Arrays.asList("us_3473016", "ca_3473016", "us_3473016");
        List<String> lskuIds = Arrays.asList("us_3473016", "ca_3473016", "us_3473016");
        List<String> arraylist = new ArrayList<>();
        for (String sss: skuIdsList) {
            arraylist.add(sss);
        }
        for (String s : lskuIds) {
            String skuId = getSkuDetails(arraylist, s);
            arraylist.remove(skuId);
            System.out.println("***************** ssssssssssskuid " + skuId);
        }
    }

    private static String getSkuDetails(List<String> skuIdsList, String lskuId) {
        return skuIdsList.stream()
                .filter(skuId ->  skuId.equalsIgnoreCase(lskuId))
                .findAny()
                .orElse(null);
    }
}
