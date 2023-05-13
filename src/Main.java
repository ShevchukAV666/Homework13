public class Main {
    public static void main(String[] args) {

        System.out.println();

        Author authorOne = new Author("Маргарет", "Митчелл");
        Book GoneWithTheWind = new Book("Унесённые ветром", authorOne, 1936);

        System.out.println(GoneWithTheWind);

        GoneWithTheWind.setYearPublication(2023);
        System.out.println("GoneWithTheWind.getYearPublication() = " + GoneWithTheWind.getYearPublication());

        System.out.println();

        Author authorTwo = new Author("Джордж", "Оруэлл");
        Book AnimalFarm = new Book("Скотный двор", authorTwo, 1945);

        System.out.println(AnimalFarm);

        AnimalFarm.setYearPublication(2023);
        System.out.println("AnimalFarm.getYearPublication() = " + AnimalFarm.getYearPublication());

        System.out.println();


        System.out.println("Авторы Маргарет Митчелл и Джордж Оруэлл, одинаковые - " +authorOne.equals(authorTwo));

        System.out.println();

        System.out.println("Книги Унесённые ветром и Скотный двор, одинаковые - " +AnimalFarm.equals(GoneWithTheWind));

        System.out.println();

        System.out.println("hashCode книги Унесённые ветром - " +GoneWithTheWind.hashCode());

        System.out.println("hashCode книги Скотный двор - " +AnimalFarm.hashCode());

    }
}



