package zezzz;



import java.awt.Color;

import java.awt.Font;



import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JPasswordField;

import javax.swing.JTextField;



public class Main {





static JFrame frame = new JFrame("Log IN");



public static void main(String[] args) {

frameAdmin.dispose();

frame.dispose();

JLabel log = new JLabel();

log.setText("Welcome To Library");

log.setFont(new Font("Arial",Font.BOLD, 20));

log.setForeground(new java.awt.Color (255, 249, 175));

log.setBounds(150, 50, 200, 50);

frame.add(log);



JButton Admin = new JButton();

Admin.setBounds(170, 120, 150, 40);

Admin.setText("Admin");

Admin.addActionListener(e -> Admin());

frame.add(Admin);



JButton User = new JButton();

User.setBounds(170, 170, 150, 40);

User.setText("User");



frame.add(User);





frame.setLayout(null);

frame.setBounds(550, 200, 500, 400);

frame.setVisible(true);

frame.getContentPane().setBackground(new java.awt.Color(21, 77, 113)); 

frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



}



static JFrame frameAdmin = new JFrame("Log IN");

public static void Admin() {

frame.dispose();



  JTextField usernamefield;

JPasswordField passwordfield;



JLabel Admin = new JLabel();

Admin.setText("Log In");

Admin.setBounds(210, 40, 100, 30);

Admin.setFont(new Font("Arial",Font.BOLD, 25));

Admin.setForeground(Color.white);

frameAdmin.add(Admin);



JLabel username = new JLabel();

username.setText("Username");

username.setBounds(150, 100, 100, 30);

username.setFont(new Font("Arial",Font.BOLD, 15));

username.setForeground(Color.white);

frameAdmin.add(username);



usernamefield = new JTextField();

usernamefield.setBounds(150, 130, 200, 25);

frameAdmin.add(usernamefield);



JLabel password = new JLabel();

password.setText("Password");

password.setBounds(150, 160, 100, 30);

password.setFont(new Font("Arial",Font.BOLD, 15));

password.setForeground(Color.white);

frameAdmin.add(password);



passwordfield = new JPasswordField();

passwordfield.setBounds(150, 190, 200, 25);

frameAdmin.add(passwordfield);



JButton in = new JButton();

in.setBounds(250, 230, 100, 35);

in.setText("🔒 Log In");

in.addActionListener(e -> AdminEdi());

frameAdmin.add(in);



JButton out = new JButton();

out.setBounds(150, 230, 100, 35);

out.setText("Back");

out.addActionListener(e -> main(null));

frameAdmin.add(out);





frameAdmin.setLayout(null);

frameAdmin.setBounds(550, 200, 500, 400);

frameAdmin.setVisible(true);

frameAdmin.getContentPane().setBackground(new java.awt.Color(21, 77, 113)); 

frameAdmin.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



}



public static void AdminEdi() {

frame.dispose();

JFrame frameUser = new JFrame("University Library Of Davao");



JLabel Uni = new JLabel();

Uni.setText("University of Mindanao");

Uni.setBounds(600, 50, 1000, 70);

Uni.setFont(new Font("Arial",Font.BOLD, 50));

Uni.setForeground(new java.awt.Color (21, 77, 113));

frameUser.add(Uni);



JPanel Cat = new JPanel();

Cat.setBounds(300, 150, 1250, 600);

Cat.setLayout(null);

Cat.setBackground(new java.awt.Color(255, 250, 141));

frameUser.add(Cat);



//Buttons













frameUser.setLayout(null);

frameUser.setBounds(0, 0, 1600, 900);

frameUser.setVisible(true);

frameUser.getContentPane().setBackground(new java.awt.Color(78, 215, 241)); 

frameUser.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);







}



}

