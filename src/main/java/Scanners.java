
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aaminahv
 */
public class Scanners {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("data/Clients.txt");

        Scanner sc = new Scanner(f).useDelimiter("");

        String name = "";
        while (sc.hasNext()) {
            name = sc.next();
        }

        System.out.println(name);

    }

}
