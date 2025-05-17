

// Pembuat      : M. Daffa' Atstsaqif / 24060123120039
// Tanggal      : 14 Mei 2025
// File         : SerializePerson.java
// Deskripsi    : Program untuk serialisasi objek Person
package TERSERIALISASI;
import java.io.*;

//class Person
class Person implements Serializable {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

//class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("DAPPA");
        try {
            FileOutputStream f = new FileOutputStream("TERSERIALISASI/person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
