package TERSERIALISASI;

// Pembuat      : M. Daffa' Atstsaqif / 24060123120039
// Tanggal      : 14 Mei 2025
// File         : ReadSerializedPerson.java
// Deskripsi    : Program untuk serialisasi objek Person

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("TERSERIALISASI/person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}