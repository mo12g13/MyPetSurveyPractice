package com.Momo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Momo Johnson on 4/4/2016.
 */
public class PetSurvey extends JFrame{
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JButton submitButton;
    private JLabel surveyButton;
    private JButton quitButton;
    private boolean hasCat;
    private boolean hasDog;
    private boolean hasFish;
    //Adding of components
    public PetSurvey(){
        super("Pet Survey Application");
        setContentPane(rootPanel);
        setPreferredSize(new Dimension(400, 200));
        submitButton.setPreferredSize(new Dimension(100, 20));//Setting size of the submitButton
        pack();
        setVisible(true);

        //itemListener that check if the fishCheckBox is being selected
        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasFish = fishCheckBox.isSelected();

            }
        });
        //itemListener that check if the dogCheckBox is being selected
        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasDog = dogCheckBox.isSelected();
            }
        });
        //itemListener that check if the catCheckBox is being selected
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasCat = catCheckBox.isSelected();
            }
        });
        //ActionListener that check if the submitButton is being  clicked
        submitButton.addActionListener(new ActionListener() {
            String dog, cat, fish;//declaring string for dog, cat and fisth
            @Override
            public void actionPerformed(ActionEvent e) {
                if(hasDog==true){
                    dog = "one dog";// if dogCheck is selected that means boolean hasDog = true. intialize
                                    // variable dog to String "one dog".

                }else {
                    dog ="no dog";//else dog initialize to String "no do", dogCheckBox isn't selected
                }

                if(hasCat == true){
                    cat = "one cat";// if catCheckBox is selected that means boolean hasCat = true. intialize
                                    // variable dog to String "one cat".

                }else {
                    cat ="no cat";// variable cat initialize to String "no cat", catCheckBox is not selected
                }

                if(hasFish == true){
                    fish = "one fish";// if fishCheckBox is selected that means boolean hasCat = true. intialize
                                    // variable dog to String "one fish".

                }else {
                    fish = "no fihs";// else variable fish initialize to String "no fish", fishCheckBox isn't selected
                }
                //Setting string of the message to a variable result
                String result = "usser has "+ dog + ", "+ cat + ", "+ fish;
                surveyButton.setText(result);//Display result text in the surveyButton area
                //Displaying a JOptionPane with the same result with Title PetSurvey Result in a Plain JOptionPan Message
                //Dialog box
                JOptionPane.showMessageDialog(rootPanel, result, "Pet Survey Result", JOptionPane.PLAIN_MESSAGE);

            }








        });
        //ActionListener that exit the dialog box when quit button is clicked
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
