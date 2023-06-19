import ru.fedotova.week5.model.AnimalDescription;
import ru.fedotova.week5.model.Bat;
import ru.fedotova.week5.model.Flamingo;
import ru.fedotova.week5.model.Penguin;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnimalDescription animalDescription = new AnimalDescription();

        Bat bat = new Bat();
        Flamingo flamingo = new Flamingo();
        Penguin penguin = new Penguin();

        animalDescription.name(bat);
        animalDescription.fly(bat);
        animalDescription.type(bat);
        animalDescription.home(bat);
        System.out.println("");

        animalDescription.name(flamingo);
        animalDescription.fly(flamingo);
        animalDescription.type(flamingo);
        animalDescription.home(flamingo);
        System.out.println("");

        animalDescription.name(penguin);
        animalDescription.fly(penguin);
        animalDescription.type(penguin);
        animalDescription.home(penguin);
        System.out.println("");
    }
}