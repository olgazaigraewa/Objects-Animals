import Animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Lola", 3, "Африканская саванна",
                "75 км/час", "трава, листья и другие растения");
        Herbivores giraffe = new Herbivores("Simba", 5, "Африканская саванна",
                "50 км/час", "трава, листья, овощи, фрукты");
        Herbivores horse = new Herbivores("Spirit", 6, "Средняя Азия",
                "85 км/ч", "трава, овощи, фрукты");
        System.out.println("gazelle = " + gazelle);
        System.out.println("giraffe = " + giraffe);
        System.out.println("horse = " + horse);
        gazelle.eat();gazelle.sleep();gazelle.go();
        System.out.println(" ");

        Predators hyena = new Predators("Laura", 4, "Ближний Восток",
                "60 км/час", "Падаль,а так же насекомые, яйца, фрукты и овощи");
        Predators tiger = new Predators("Шерхан", 7, "Индия",
                "95 км/час", "мясом в основном копытных животных");
        Predators bear = new Predators("Балу", 8, "Россия",
                "50км/час", "мясо животных, а так же ягоды, жёлуди, орехи, корни, клубни и стебли трав");
        System.out.println("hyena = " + hyena);
        System.out.println("tiger = " + tiger);
        System.out.println("bear = " + bear);
        tiger.eat(); tiger.sleep(); tiger.go();
        System.out.println(" ");

        Amphibians frog = new Amphibians("Klava", 4,
                "Пресноводные водоёмы,кроны деревьев и подземные норы.");
        Amphibians grassSnakeFreshwater = new Amphibians("Mel", 2,
                "Пресноводные водоёмы,кроны деревьев и подземные норы.");
        System.out.println("frog = " + frog);
        System.out.println("grassSnakeFreshwater = " + grassSnakeFreshwater);
        frog.eat(); frog.sleep(); frog.go();
        System.out.println(" ");

        NotFlying peacock = new NotFlying("Bon", 5, " джунгли и тропики Ближний Восток",
                "может быстро ходить и низко летать на небольшие расстояния");
        NotFlying penguin = new NotFlying("Lolo", 5, " Южное полушарие",
                "ходит вертикально,  переваливаясь с боку на бок.");
        NotFlying dodoBird = new NotFlying("Додо", 0, " на островах к востоку от Мадагаскара",
                "ходила");
        System.out.println("peacock = " + peacock);
        System.out.println("penguin = " + penguin);
        System.out.println("dodoBird = " + dodoBird);
        penguin.eat(); penguin.sleep(); penguin.go();
        System.out.println(" ");

        Flying gull = new Flying("Vita", 2,
                " Ареал обитания огромен, везде, где есть открытый выход к водоему, а так же вблизи человека",
                "летает");
        Flying albatross = new Flying("Arny", 5, " преимущественно в Антарктике",
                "парить часами без единого движения крыльев");
        Flying falcon = new Flying(null, 5,
                " битает там, где есть простор для охоты – в тундре, степях, саваннах, лесах", "отлично летает");
        System.out.println("gull = " + gull);
        System.out.println("albatross = " + albatross);
        System.out.println("falcon = " + falcon);
        gull.eat(); gull.sleep(); gull.go();
        System.out.println(" ");

        System.out.println(gazelle.equals(giraffe));
        System.out.println(horse.equals(giraffe));
        System.out.println(gazelle.equals(horse));


    }
}
