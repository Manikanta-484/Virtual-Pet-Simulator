package com.virtualpet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSimulator extends JFrame {
    private Pet pet;
    private JLabel healthLabel;
    private JLabel happinessLabel;
    private JLabel hungerLabel;

    public PetSimulator(String petName) {
        pet = new Pet(petName);

        setTitle("Virtual Pet Simulator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JLabel nameLabel = new JLabel("Pet Name: " + pet.getName());
        add(nameLabel);

        healthLabel = new JLabel("Health: " + pet.getHealth());
        add(healthLabel);

        happinessLabel = new JLabel("Happiness: " + pet.getHappiness());
        add(happinessLabel);

        hungerLabel = new JLabel("Hunger: " + pet.getHunger());
        add(hungerLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));

        JButton feedButton = new JButton("Feed");
        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pet.feed();
                updateLabels();
            }
        });
        buttonPanel.add(feedButton);

        JButton playButton = new JButton("Play");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pet.play();
                updateLabels();
            }
        });
        buttonPanel.add(playButton);

        JButton trainButton = new JButton("Train");
        trainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pet.train();
                updateLabels();
            }
        });
        buttonPanel.add(trainButton);

        add(buttonPanel);

        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pet.passTime();
                updateLabels();
            }
        });
        timer.start();
    }

    private void updateLabels() {
        healthLabel.setText("Health: " + pet.getHealth());
        happinessLabel.setText("Happiness: " + pet.getHappiness());
        hungerLabel.setText("Hunger: " + pet.getHunger());
    }
}
