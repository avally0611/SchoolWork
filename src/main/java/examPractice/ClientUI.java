/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examPractice;

/**
 *
 * @author aaminahv
 */
public class ClientUI {

    public static void main(String[] args) {
        ClientController controller = new ClientController();

        System.out.println(controller.toString());
        controller.sort();
        System.out.println("In order:\n");
        System.out.println(controller.toString());

        System.out.println("============================");
        System.out.println(controller.search("Pieters"));
        System.out.println("============================");
        System.out.println(controller.filterInsecureClients());
    }

}
