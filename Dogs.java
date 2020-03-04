class Dog {
  protected String sound;
  public Dog() {
    sound = "woof";
  }
  public void makeSound() {
    makeSound(1, false);
  }
  public void makeSound(int times) {
    makeSound(int times, boolean loud);
  }
  public void makeSound(int times, boolean loud) {
    for (int i = 0; i < times; i++) {
      if (loud) {
        System.out.println(sound.toUpperCase());
      } else {
        System.out.println(sound.toLowerCase());
      }
    }
  }
}

class Hound extends Dog {
  public Hound() {
    sound = "bay";
  }
}

public class Dogs {
  public static void main(String [] args) {
    Dog dog = new Dog();
    Dog doug = new Hound();
    Hound hound = new Hound();
  }
}
