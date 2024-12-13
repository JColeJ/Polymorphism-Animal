import java.util.List;

public class AnimalTest {
  public static void main(String[] args) {

    List<Animal> animals = List.of(new Eagle(), new Frog(), new Hawk(), new Leopard(), new Monkey(), new Newt(), new Owl(), new Wolf());

    
    System.out.println("\n-- Comparing abilities in common --");
    AnimalUtil.compareAbilitiesInCommon(new Eagle(), new Hawk());
    AnimalUtil.compareAbilitiesInCommon(new Leopard(), new Wolf());
    AnimalUtil.compareAbilitiesInCommon(new Frog(), new Newt());
    
    System.out.println("\n-- Comparing abilities not in common --");
    AnimalUtil.compareAbilitiesNotInCommon(new Eagle(), new Newt());
    AnimalUtil.compareAbilitiesNotInCommon(new Frog(), new Hawk());
    AnimalUtil.compareAbilitiesNotInCommon(new Leopard(), new Owl());


   System.out.println("\n-- Animals that can speak");
    AnimalUtil.displayAnimalsWithAction(animals, Action.SPEAK);
   
    System.out.println("\n-- Animals that can swim --");
    AnimalUtil.displayAnimalsWithAction(animals, Action.SWIM);

    System.out.println("\n-- Animals that can fly --");
    AnimalUtil.displayAnimalsWithAction(animals, Action.FLY);

    System.out.println("\n-- Animals that can run --");
    AnimalUtil.displayAnimalsWithAction(animals, Action.RUN);
    
    
    //animals.forEach(animal -> List.of(Action.values()).forEach(action -> animal.performAction(action)));
    
  }


}
