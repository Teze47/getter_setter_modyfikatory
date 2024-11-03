public class Person {
  private String name; // Nie można go bezpośrednio odczytać ani zmodyfikować z zewnątrz (private)

  // Getter
  public String getName() {
    return name;
  } //Metoda getname zwraca aktualną wartość pola name. Dzięki niej można odczytać wartość name z zewnątrz klasy.

  // Setter
  public void setName(String newName) {
    this.name = newName;
  } //Metoda setname ustawia nową wartość pola name na podstawie argumentu newname
}

public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("kuba"); // Ustawia wartość pola name za pomocą setname
    System.out.println(myObj.getName());// Odczytuje i wyświetla wartość name za pomocą getname
  }
}