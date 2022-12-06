package hu.petrik.adatbaziskonzolos;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static DogDB db;
    public static void main(String[] args) {
        try {
            db = new DogDB();
            List<Dog> dogs = db.getDogs();
            System.out.println(dogs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void readDogsFromConsole(){
        System.out.print("Adja meg, hogy hány kutyát szeretne felvenni: ");
        Scanner sc = new Scanner(System.in);
        try {
            int db = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < db; i++) {
                System.out.print("Add neg a kutya nevét bazdmeg: ");
                String name = sc.nextLine();
                System.out.print("Add neg a kutya életkorát bazdmeg: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Add neg a kutya fajtáját bazdmeg: ");
                String breed= sc.nextLine();
                Dog dog = new Dog(name, age, breed);


            }
        } catch (NumberFormatException e) {
            System.out.print("Nem számot adtál meg te hülye fasz! ");
        }
    }
}
