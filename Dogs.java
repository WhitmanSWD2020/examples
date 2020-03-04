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
  public void makeSound(Dog other) {
    makeSound();
  }
}

class Hound extends Dog {
  public Hound() {
    sound = "bay";
  }
  public void makeSound(Dog other) {
    System.out.println("sniff");
  }
  public void makeSound(Hound other) {
    System.out.println("whuff");
  }
}

public class Dogs {
  public static void main(String [] args) {
    Dog dog = new Dog();
    Dog doug = new Hound();
    Hound hound = new Hound();
    
    dog.makeSound(); //Step 1 -> makeSound(), Step 2: Dog.makeSound()
    dog.makeSound(doug); //Step 1 -> makeSound(Dog), Step 2: Dog.makeSound(Dog)
    hound.makeSound(doug); //Step 1 -> makeSound(Dog), Step 2: Hound.makeSound(Dog)
    hound.makeSound(hound); //Step 1 -> makeSound(Hound), Step 2: Hound.makeSound(Hound)
    dog.makeSound(hound); //Step 1 -> makeSound(Dog), Step 2: Dog.makeSound(Dog)
    doug.makeSound(dog); //Step 1 -> makeSound(Dog), Step 2: Hound.makeSound(Dog)
    doug.makeSound(hound); //Step 1 -> makeSound(Dog), Step 2: Hound.makeSound(Dog)
    
  }
}
