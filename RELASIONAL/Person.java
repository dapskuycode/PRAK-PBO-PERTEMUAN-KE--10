// Pembuat      : M. Daffa' Atstsaqif / 24060123120039
// Tanggal      : 14 Mei 2025
// File         : Person.java
// Deskripsi    : class person


public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
