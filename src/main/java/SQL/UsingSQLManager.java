/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaminahv
 */
public class UsingSQLManager {

    public static void main(String[] args) {
        String[] missionName = new String[100];
        int size = 0;

        try {
            SqlManager.connect();
            ResultSet missions = SqlManager.query("SELECT Commander FROM apollo.tblmission WHERE MissionName = \"Apollo 1\"");

            while (missions.next()) {
                missionName[size] = missions.getString("Commander");
                size++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsingSQLManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < size; i++) {
            System.out.println(missionName[i]);
        }

    }

}
