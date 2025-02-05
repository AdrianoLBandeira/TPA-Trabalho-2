/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpa_trabalho_2;

import javax.swing.SwingUtilities;

/**
 *
 * @author adria
 */
public class TPA_Trabalho_2 {

    public static void main(String[] args) {
        // Executar a interface gráfica principal
        SwingUtilities.invokeLater(() -> {
            try {
                new ClienteGUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
