public class DiscountOnShirts {

    public static void main(String[] args) {

        final int PriceShirtWithoutDiscount = 1000;
        System.out.println("Цена одной рубашки без скидки: " + PriceShirtWithoutDiscount);

        final int selectedShirts = 3;
        System.out.println("Колличество уже выбранных рубашек: " + selectedShirts);

        final int needToBuyShirtsForDiscount = 5;
        System.out.println("Нужно купить рубашек для получения скидки: " + needToBuyShirtsForDiscount);

        final int needToAddShirtsForDiscount = needToBuyShirtsForDiscount - selectedShirts;
        System.out.println("Нужно добавить к выбранным еще " + needToAddShirtsForDiscount
                + " рубашки для получения скидки");
        final int priceSelectedShirts = selectedShirts * PriceShirtWithoutDiscount;
        System.out.println("Цена уже выбранных рубашек без скидки: " + priceSelectedShirts);

        final int priceShirtsNeedToAddForDiscount = PriceShirtWithoutDiscount * needToAddShirtsForDiscount;
        System.out.println("Цена рубашек (без скидки), которые необходимо докупить для получения скидки: "
                + priceShirtsNeedToAddForDiscount);

        final double persentDiscount = 0.25;
        System.out.println("Процент скидки: " + persentDiscount * 100);

        final double priceAllShirtsWithDiscount = (needToBuyShirtsForDiscount * PriceShirtWithoutDiscount)
                - (needToBuyShirtsForDiscount * PriceShirtWithoutDiscount
                * persentDiscount);
        System.out.println("Цена всех рубашек со скидкой: " + priceAllShirtsWithDiscount);

        final double priceOneShirtWithDiscount = PriceShirtWithoutDiscount
                - (PriceShirtWithoutDiscount * persentDiscount);
        System.out.println("Цена одной рубашки со скидкой: " + priceOneShirtWithDiscount);

        final double savedMoney = (PriceShirtWithoutDiscount * needToBuyShirtsForDiscount)
                - priceAllShirtsWithDiscount;
        System.out.println("Сэкономленные деньги если рубашки куплены со скидкой: " + savedMoney);

        final double freeShirts = savedMoney / PriceShirtWithoutDiscount;
        System.out.println("Рубашки на халяву: " + freeShirts);



    }
}
