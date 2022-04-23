package cv11;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public static void main(String[] args) {
	    JFrame screen = new JFrame();
        JPanel panel = new JPanel();
        //tlacitka
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton equals = new JButton("=");
        JLabel label = new JLabel(" "); //pole na vypisovanie vysledkov a zadanych hodnot

        //engine k vyhodnoteniu rovnice po stlaceni rovna sa
        equals.addActionListener(e -> {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
            try {
                label.setText(String.valueOf(engine.eval(label.getText()))); //engine vezme text z labelu a vyhodnoti
            }
            catch (ScriptException scriptException){
                scriptException.printStackTrace();
            }

        });


        for (int i =0; i <10; i++){ //loop na vytvorenie tlacitiek
            JButton button = new JButton(String.valueOf(i)); //vytvorenie tlacitka pre danu iteraciu
            button.addActionListener(new ActionListener() { //pridanie funkcnosti k tlacitku

                public void actionPerformed(ActionEvent e) {
                    String help = label.getText(); //ulozenie stavajuceho textu labelu
                    label.setText(help + button.getText()); //povodny label + stlacene tlacitko
                }

            });
            button.setBorder(new BasicBorders.ButtonBorder(Color.YELLOW, Color.BLACK, Color.YELLOW, Color.BLACK));
            panel.add(button); //pridanie tlacitka do panelu

        }
        //vytvorenie GUI
        label.setHorizontalAlignment(JLabel.RIGHT); //vytvorenie pola pre vypisovanie vysledku a stlacenych tlacitok
        label.setBorder(new BasicBorders.ButtonBorder(Color.RED, Color.BLACK, Color.RED, Color.BLACK));
        equals.setBorder(new BasicBorders.ButtonBorder(Color.BLUE, Color.BLACK, Color.BLUE, Color.BLACK));//hranice pola
        screen.setSize(400,300); //velikost okna
        screen.setLayout(new BorderLayout());
        screen.getContentPane().add(label, BorderLayout.NORTH); //umiestnenie pola pre vypisovanie
        panel.setLayout(new GridLayout(4,3)); //layout pre tlacitka


        //tlacitka +-
        plus.addActionListener(new ActionListener() { //vytvorenie tlacitka +
            @Override
            public void actionPerformed(ActionEvent e) {
                String help = label.getText(); //ulozenie stavajuceho tlacitka v labeli
                label.setText(help + "+"); //puvodni label + zmacknute tlacitko

            }
        });
        plus.setBorder(new BasicBorders.ButtonBorder(Color.GREEN, Color.BLACK, Color.GREEN, Color.BLACK));
        panel.add(plus); //pridanie tlacitka do GUI

        minus.addActionListener(new ActionListener() { //vytvorenie tlacitka -
            @Override
            public void actionPerformed(ActionEvent e) {
                String help = label.getText(); //ulozenie stavajuceho tlacitka v labeli
                label.setText(help + "-"); //puvodni label + zmacknute tlacitko

            }
        });
        minus.setBorder(new BasicBorders.ButtonBorder(Color.GREEN, Color.BLACK, Color.GREEN, Color.BLACK));
        panel.add(minus); //pridanie tlacitka do GUI

        screen.getContentPane().add(panel);

        screen.add(equals, BorderLayout.SOUTH); //pridanie tlactika =
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //vypnutie po zavreti
        screen.setVisible(true);
        screen.setResizable(false);

    }
}
