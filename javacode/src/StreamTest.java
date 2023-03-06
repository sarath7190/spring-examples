import java.util.ArrayList;
import java.util.List;

public class StreamTest {

    public static void main(String args[]) {
        List<Promo> list = new ArrayList<>();
        Promo promo = new Promo();
        Promo promoThree = new Promo();
        Promo promotwo = new Promo();
        Promo promoone = new Promo();
        promo.setId(1);
        promo.setName("one");
        promo.setValid(null);
        promoone.setId(2);
        promoone.setName("two");
        promoone.setValid(false);
        promotwo.setId(3);
        promotwo.setName("three");
        promotwo.setValid(false);
        promoThree.setId(4);
        promoThree.setName("four");
        promoThree.setValid(true);
        list.add(promo);
        list.add(promoone);
        list.add(promoThree);
        list.add(promotwo);
        System.out.println(list.stream().anyMatch(promo1 -> null!=promo1.getValid() && promo1.getValid()));
    }
}
