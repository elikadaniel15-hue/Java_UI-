package JOptionPane;

import javax.swing.*;
public class JOptionPane{
public static void main(String[] args){
JOptionPane.showMessageDialog("hello java");
String name =JOptionPane.showInputDialog("please enter you name");
JOptionPane.showConfirmDialog("Are you sure you want to exit?");
JOptionPane.showMessageDialog("hello ",name);
}
}
