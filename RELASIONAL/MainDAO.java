
// Pembuat      : M. Daffa' Atstsaqif / 24060123120039
// Tanggal      : 14 Mei 2025
// File         : MainDAO.java
// Deskripsi    : Main Program untuk akses DAO


public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Daffa");
        DAOManager m = new DAOManager();

        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}