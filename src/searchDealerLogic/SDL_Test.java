package searchDealerLogic;

import java.io.IOException;

public class SDL_Test {

    public static void main (String[] arg) throws IOException {

        CalculateDistance.calculateDistance("97133","97109"); //Test if the Calculation Web service working. It should print our a distance
        System.out.println(SearchDealer.searchDealer(98133)); // Test if the searchDealer method working. It should return an Arraylist

    }
}
