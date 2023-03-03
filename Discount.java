public class Discount {
    public static void main(String[] args) {
        //Discount bus
//        senior 15%
//        dog -20%
//        student -10%
//        full prize 3.2
//        senior + dog+ grandson *2 bus

//        books
//        -10% > nonfiction + >= 1 fiction
//        2 fiction: 15 +18
//        2 nonfiction: 23+28

        boolean isSenior = true;
        boolean isDog = true;
        boolean isStudent = true;

        double fullBusPriceNoDiscount = 3.2;
        double busTicketEdna = getDiscountPrice(fullBusPriceNoDiscount, true,  false,  false);
        double busTicketLola = getDiscountPrice(fullBusPriceNoDiscount,  false,  false,  true);
        double busTicketPaul = getDiscountPrice(fullBusPriceNoDiscount,  false,  true,  false);

        double totalBusPriceDiscounted = (busTicketEdna + busTicketPaul + busTicketLola) * 2 ;
        double totalBusPriceNoDiscount = 6 * 3.2;

        int fiction = 2;
        int nonfiction = 2;
        double fullBookPriceNoDiscount = 15 + 18 + 23 + 28;
        double totalBookPriceDiscounted = getBookDiscountPrice(fullBookPriceNoDiscount, fiction, nonfiction);

        double totalSavedMoney = (totalBusPriceNoDiscount + fullBookPriceNoDiscount) - (totalBusPriceDiscounted + totalBookPriceDiscounted);

        System.out.println("Edna, Lola and Paul saved a total of " + totalSavedMoney);
    }

    public static double getDiscountPrice(double fullBusPrice, boolean isSenior, boolean isStudent, boolean isDog) {
        double discountedPrice;
        if (isSenior) {
            discountedPrice = fullBusPrice * 0.85;
        } else if (isDog) {
            discountedPrice = fullBusPrice * 0.8;
        } else if (isStudent) {
            discountedPrice = fullBusPrice * 0.9;
        } else {
            discountedPrice = fullBusPrice;
        }
        return discountedPrice;
    }

    public static double getBookDiscountPrice(double fullBookprice, int fiction, int nonFiction) {
        double discountedBookPrice;
        if (fiction >= 1 && nonFiction > 2) {
            discountedBookPrice = fullBookprice * 0.9;
        } else {
            discountedBookPrice = fullBookprice;
        }
        return discountedBookPrice;
    }
}
