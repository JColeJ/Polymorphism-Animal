import java.util.List;
import java.util.stream.Stream;

public abstract class Animal {

  private List<Action> abilities = List.of(Action.SPEAK);

  public void performAction(Action action) {
    if (hasAbility(action)) {
      System.out.printf("%s can %s.\n", this.getClass().getName(), action.toString().toLowerCase());
    } else {
      System.out.printf("%s cannot %s.\n", this.getClass().getName(), action.toString().toLowerCase());
    }
  }

  public void addAbilities(Action... abilities) {
    setAbilities(Stream.concat(this.abilities.stream(), List.of(abilities).stream()).toList());
  }

  public List<Action> getAbilities() {
    return abilities;
  }

  private void setAbilities(List<Action> abilities) {
    this.abilities = abilities;
  }

  boolean hasAbility(Action action) {
    return (getAbilities().contains(action));
  }
}
