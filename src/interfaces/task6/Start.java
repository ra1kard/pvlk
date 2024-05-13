package interfaces.task6;

public class Start {

    public static void main(String[] args) {
        Shop shop = new Shop();

        Man vitaly = new Man("Виталий", Size.XL, Style.BUSINESS);
        Woman inna = new Woman("Инна", Size.XS, Style.SPORT);

        Man igor = new Man("Игорь", Size.L, Style.WORK);
        Woman olya = new Woman("Ольга", Size.S, Style.HOME);

        ShortCloth short1 = new ShortCloth(
                Material.COTTON, Size.XL, Season.SUMMER, Collection.YEAR2023, Sex.MALE, Style.SPORT);
        ShortCloth short2 = new ShortCloth(
                Material.SILK, Size.XS, Season.SUMMER, Collection.YEAR2024, Sex.FEMALE, Style.HOME);

        Skirt skirt1 = new Skirt(
                Material.POLYESTER, Size.S, Season.SPRING, Collection.YEAR2024, Sex.FEMALE, Style.BUSINESS);
        Skirt skirt2 = new Skirt(
                Material.POLYESTER, Size.XS, Season.SPRING, Collection.YEAR2024, Sex.FEMALE, Style.BUSINESS);

        Jeans jeans1 = new Jeans(
                Material.JEANS, Size.L, Season.DEMISEASON, Collection.YEAR2021, Sex.MALE, Style.WORK);
        Jeans jeans2 = new Jeans(
                Material.JEANS, Size.S, Season.SPRING, Collection.YEAR2023, Sex.FEMALE, Style.BUSINESS);

        Trousers trousers1 = new Trousers(
                Material.WOOL, Size.L, Season.SUMMER, Collection.YEAR2024, Sex.MALE, Style.HOME);

        Tshirt tshirt1 = new Tshirt(
                Material.FLAX, Size.XL, Season.DEMISEASON, Collection.YEAR2020, Sex.MALE, Style.SPORT);
        Tshirt tshirt2 = new Tshirt(
                Material.VISCOSE, Size.XS, Season.DEMISEASON, Collection.YEAR2023, Sex.FEMALE, Style.SPORT);

        Jacket jacket1 = new Jacket(
                Material.POLYESTER, Size.L, Season.AUTUMN, Collection.YEAR2022, Sex.MALE, Style.BUSINESS);
        Jacket jacket2 = new Jacket(
                Material.POLYESTER, Size.S, Season.WINTER, Collection.YEAR2024, Sex.FEMALE, Style.BUSINESS);

        /**
         * попробуем одеть штучно
         */
        vitaly.print();
        inna.print();

        olya.addListClothes(skirt1);
        olya.print();

        //shop.dressSomeWoman(skirt2);
        olya.print();

        igor.addListClothes(trousers1);
        igor.print();

        /**
         * попробуем одеть массово
         */

    }

}
