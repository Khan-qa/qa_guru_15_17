package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DateForTest {

    public String product = getRandomProduct();

    private static String getRandomProduct() {
        List<String> product = Arrays.asList("Велосипед","Мотоцикл","Санки");
        return product.get(new Random().nextInt(product.size()));
    }

}
