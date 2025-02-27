package excercise1.persistance;

import excercise1.journalists.Journalist;
import excercise1.ui.uitils.RenderText;
import java.util.ArrayList;
import java.util.List;

public class InMemoryJournalists {
  private static final List<Journalist> all = new ArrayList<>();

  public Journalist getByName(String name) {
    return all.stream().filter(j -> j.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
  }

  public boolean add(Journalist journalist) {
    Journalist inMemory = getByName(journalist.getName());
    try {
      if (inMemory != null) {
        throw new IllegalArgumentException();
      }
      all.add(journalist);
      return true;
    } catch (IllegalArgumentException e) {
      RenderText.render("⚠️ Journalist already exists.");
    }
    return false;
  }

  public boolean delete(String name) {
    boolean exists = all.contains(this.getByName(name));
    if (!exists) {
      RenderText.render("⚠️ Journalist doesn't exist");
    } else {
      all.removeIf(journalist -> journalist.getName().equalsIgnoreCase(name));
      return true;
    }
    return false;
  }
}
