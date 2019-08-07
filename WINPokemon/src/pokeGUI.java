import javax.swing.*;
import java.awt.*;

public class pokeGUI {
    static JProgressBar HPBar = new JProgressBar();
    static JProgressBar oppBar = new JProgressBar();
    JFrame frame = new JFrame("HP Progress Bars");
    JPanel userPanel = new JPanel();
    JPanel oppPanel = new JPanel();
    JLabel userName = new JLabel();
    JLabel oppName = new JLabel();

    public void updateHPBar(int newValue,double dubNewValue){
        HPBar.setValue(newValue);
        HPBar.setString(String.valueOf(dubNewValue));
    }

    public void updateOppHP(int newValue,double dubNewValue){
        oppBar.setValue(newValue);
        oppBar.setString(String.valueOf(dubNewValue));
    }

    public void setBarMax(int barMax,String name,int level){
        HPBar.setMaximum(barMax);
        HPBar.setMinimum(0);
        HPBar.setValue(barMax);
        HPBar.setStringPainted(true);
        HPBar.setString(String.valueOf(barMax));
        userName.setText("LVL " + level + " " + name);
    }

    public void setUserLevel(int level,String name){
        userName.setText("LVL " + level + " " + name);
    }

    public void OPPsetStringPainted(boolean painted){
        oppBar.setStringPainted(painted);
    }

    public void showOppBar(int max,String name){
        oppPanel.setVisible(true);
        oppBar.setMinimum(0);
        oppBar.setMaximum(max);
        oppBar.setValue(max);
        oppBar.setString(String.valueOf(max));
        oppName.setText(name);
    }

    public void setOppBar(int value){
        oppBar.setValue(value);
    }

    public void hideOppBar(){
        oppPanel.setVisible(false);
    }

    public void showFrame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,200);
        userPanel.add(userName);
        oppPanel.add(oppName);
        userPanel.add(HPBar);
        oppPanel.add(oppBar);
        frame.getContentPane().add(BorderLayout.NORTH, userPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, oppPanel);
        oppPanel.setVisible(false);
        frame.setVisible(true);
    }
}
