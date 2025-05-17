// Pembuat      : M. Daffa' Atstsaqif / 24060123120039
// Tanggal      : 14 Mei 2025
// File         : DAOManager.java
// Deskripsi    : Pengelola DAO dalam progran

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}