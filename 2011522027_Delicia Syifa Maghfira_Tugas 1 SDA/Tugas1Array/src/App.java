import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=============");
        System.out.println("TUGAS 1 ARRAY");
        System.out.println("=============");
        System.out.println();

        String nama [] = new String[4];
        nama[0]="F";
        nama[1]="I";
        nama[2]="R";
        nama[3]="A";

        ArrayList<String> Nama = new ArrayList<String>();
        Nama.add("F");
        Nama.add("I");
        Nama.add("R");
        Nama.add("A");

        System.out.println();


    //=================================================================================================================================
    //IsEmpty
        System.out.println("=========");
        System.out.println("IS EMPTY");
        System.out.println("=========");
        System.out.println("Apakah data pada array nama[0] kosong ? " +nama[0].isEmpty() );
        System.out.println("Apakah data pada array nama[1] kosong ? " +nama[1].isEmpty() );
        System.out.println("Apakah data pada array nama[2] kosong ? " +nama[2].isEmpty() );
        System.out.println("Apakah data pada array nama[3] kosong ? " +nama[3].isEmpty() );
        System.out.println();


    //=================================================================================================================================
    //Size
        System.out.println("==========");
        System.out.println("ARRAY SIZE");
        System.out.println("==========");
        System.out.println("Size dari array nama adalah = " +nama.length);
        System.out.println();

    //=================================================================================================================================
    //Get
        System.out.println("=========");
        System.out.println("GET ARRAY");
        System.out.println("=========");
        

        try{
            System.out.println(Nama.get(0));
            System.out.println(Nama.get(2));
            System.out.println(Nama.get(6));
            System.out.println(Nama.get(-3));
            
        }
    
        catch (Exception e){
            System.err.println("Melebihi Indeks Array");
        }

        System.out.println();

    //=================================================================================================================================
    //indexOf
        System.out.println("==============");
        System.out.println("INDEX OF ARRAY");
        System.out.println("==============");

        System.out.println("Index dari Array yang memiliki data A adalah = " + Nama.indexOf("A"));
        System.out.println("Index dari Array yang memiliki data C adalah = " + Nama.indexOf("C"));
        System.out.println("Index dari Array yang memiliki data Q adalah = " + Nama.indexOf("Q"));
        System.out.println();

    
    //=================================================================================================================================
    //Remove Array
        System.out.println("=============");
        System.out.println("REMOVE ARRAY");
        System.out.println("=============");

        Scanner input = new Scanner(System.in);
        int x;

        System.out.printf("Masukkan Indeks Array yang ingin di hapus = " );
        x = input.nextInt();

        if (x == 0){
            Nama.remove(0);
            System.out.println("Array Nama dengan indeks 0 berhasil dihapus!");
            System.out.println(Nama);
        }
        else if (x == 1){
            Nama.remove(1);
            System.out.println("Array Nama dengan indeks 1 berhasil dihapus!");
            System.out.println(Nama);
        }
        else if (x == 2){
            Nama.remove(2);
            System.out.println("Array Nama dengan indeks 2 berhasil dihapus!");
            System.out.println(Nama);
        }
        else if (x == 3){
            Nama.remove(3);
            System.out.println("Array Nama dengan indeks 3 berhasil dihapus!");
            System.out.println(Nama);
        }
        else{
            System.out.println("Melebihi indeks array yang tersedia!");
        }

        System.out.println();
    
    //=================================================================================================================================
    //Add Array
    System.out.println("=========");
    System.out.println("ADD ARRAY");
    System.out.println("=========");

    try{
    Nama.add(0,"E");
    System.out.println(Nama);
    Nama.add(2,"F");
    System.out.println(Nama);
    Nama.add(3,"G");
    System.out.println(Nama);
    Nama.add(4,"H");
    System.out.println(Nama);
    Nama.add(6,"H");
    System.out.println(Nama);
    Nama.add(-3,"J");
    System.out.println(Nama);
        
    }

    catch (Exception e){
        System.err.println("Indeks Array Tidak ditemukan");
    }
        
    }

    

    
    
  
}
