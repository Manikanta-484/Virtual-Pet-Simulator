package com.virtualpet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                String petName = JOptionPane.showInputDialog("Enter the name of your pet:");
                if (petName != null && !petName.trim().isEmpty()) {
                    PetSimulator simulator = new PetSimulator(petName);
                    simulator.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Pet name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
