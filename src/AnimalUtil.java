import java.util.List;
import java.util.stream.Collectors;

public class AnimalUtil {
  
 // Method to compare common abilities between two animals
 public static void compareAbilitiesInCommon(Animal animal1, Animal animal2) {
  List<Action> commonAbilities = animal1.getAbilities().stream()
    .filter(animal2.getAbilities()::contains)
    .collect(Collectors.toList());
  System.out.println(animal1.getClass().getSimpleName() + " and " +
    animal2.getClass().getSimpleName() + " have these abilities in common: " + commonAbilities);
  }

// Method to compare abilities NOT in common between two animals
public static void compareAbilitiesNotInCommon(Animal animal1, Animal animal2) {
  List<Action> notInCommonAbilities = animal1.getAbilities().stream()
    .filter(action -> !animal2.getAbilities().contains(action))
    .collect(Collectors.toList());
  System.out.println(animal1.getClass().getSimpleName() + " and " +
    animal2.getClass().getSimpleName() + " have these abilities NOT in common: " + notInCommonAbilities);
  }

// Method to display animals capable of performing a specific action
public static void displayAnimalsWithAction(List<Animal> animals, Action action) {
  animals.stream()
    .filter(animal -> animal.hasAbility(action))
    .forEach(animal -> System.out.println(animal.getClass().getSimpleName() + " can " + action.toString().toLowerCase()));
  }

}


