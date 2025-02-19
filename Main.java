import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        
        //System.out.println("program ucitan");
        ConnMySql dbconn = new ConnMySql();
        Obrada obrada  = new Obrada();
        CRUDOperations crud = new CRUDOperations();

        //----------------------- INSERT INTO KOMANDA -----------------
        // crud.create("Novi", 26, "2025-01-04", "c:/putanja");
        //-------------------------------------------------------------

       //System.out.println("program ucitan db" + dbconn);
    }
}