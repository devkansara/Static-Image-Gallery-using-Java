import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
 
import javax.swing.*;
import net.proteanit.sql.DbUtils;
 
public class main {
	
    public static class ex{
        public static int days=0;
            }

    public static void main(String[] args) {
      
        login();
    }

    public static void login() {
        
        JFrame f=new JFrame("Login");//creating instance of JFrame  
        JLabel l1,l2;  
        l1=new JLabel("Username");  //Create label Username
        l1.setBounds(30,15, 100,30); //x axis, y axis, width, height 
         
        l2=new JLabel("Password");  //Create label Password
        l2.setBounds(30,50, 100,30);    
         
        JTextField F_user = new JTextField(); //Create text field for username
        F_user.setBounds(110, 15, 200, 30);
             
        JPasswordField F_pass=new JPasswordField(); //Create text field for password
        F_pass.setBounds(110, 50, 200, 30);
           
        JButton login_but=new JButton("Login");//creating instance of JButton for Login Button
        login_but.setBounds(130,90,80,25);//Dimensions for button
        login_but.addActionListener(new ActionListener() {  //Perform action
             
            public void actionPerformed(ActionEvent e){ 
     
            String username = F_user.getText(); //Store username entered by the user in the variable "username"
            String password = F_pass.getText(); //Store password entered by the user in the variable "password"
             
            if(username.equals("")) //If username is null
            {
                JOptionPane.showMessageDialog(null,"Please enter username"); //Display dialog box with the message
            } 
            else if(password.equals("")) //If password is null
            {
                JOptionPane.showMessageDialog(null,"Please enter password"); //Display dialog box with the message
            }
            else { //If both the fields are present then to login the user, check wether the user exists already
                //System.out.println("Login connect");
                Connection connection=connect();  //Connect to the database
                try
                {
                Statement stmt = connection.createStatement();
                  stmt.executeUpdate("USE LIBRARY"); //Use the database with the name "Library"
                  String st = ("SELECT * FROM USERS WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'"); //Retreive username and passwords from users
                  ResultSet rs = stmt.executeQuery(st); //Execute query
                  if(rs.next()==false) { //Move pointer below
                      System.out.print("No user");  
                      JOptionPane.showMessageDialog(null,"Wrong Username/Password!"); //Display Message
     
                  }
                  else {
                      f.dispose();
                    rs.beforeFirst();  //Move the pointer above
                    while(rs.next())
                    {
                      String admin = rs.getString("ADMIN"); //user is admin
                      //System.out.println(admin);
                      String UID = rs.getString("UID"); //Get user ID of the user
                      if(admin.equals("1")) { //If boolean value 1
                          admin_menu(); //redirect to admin menu
                      }
                      else{
                          user_menu(UID); //redirect to user menu for that user ID
                      }
                  }
                  }
                }
                catch (Exception ex) {
                     ex.printStackTrace();
            }
            }
        }               
        });
     
         
        f.add(F_pass); //add password
        f.add(login_but);//adding button in JFrame  
        f.add(F_user);  //add user
        f.add(l1);  // add label1 i.e. for username
        f.add(l2); // add label2 i.e. for password
         
        f.setSize(400,180);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible 
        f.setLocationRelativeTo(null);
         
    }

    public static void admin_menu() {
        
        
        JFrame f=new JFrame("Admin Functions"); //Give dialog box name as admin functions
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
         
         
    
                 
            
       
         
         
        JButton view_but_1=new JButton("View Images");//creating instance of JButton to view Images
        view_but_1.setBounds(20,20,120,25);//x axis, y axis, width, height 
        view_but_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                 Categories c = new Categories();

            }
        }
        );
         
        JButton users_but=new JButton("View Users");//creating instance of JButton to view users
        users_but.setBounds(150,20,120,25);//x axis, y axis, width, height 
        users_but.addActionListener(new ActionListener() { //Perform action on click button
            public void actionPerformed(ActionEvent e){
                     
                    JFrame f = new JFrame("Users List");
                    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     
                     
                    Connection connection = connect();
                    String sql="select * from users"; //retrieve all users
                    try {
                        Statement stmt = connection.createStatement();
                         stmt.executeUpdate("USE LIBRARY"); //use database
                        stmt=connection.createStatement();
                        ResultSet rs=stmt.executeQuery(sql);
                        JTable image_list= new JTable();
                        image_list.setModel(DbUtils.resultSetToTableModel(rs)); 
                        //mention scroll bar
                        JScrollPane scrollPane = new JScrollPane(image_list);
     
                        f.add(scrollPane); //add scrollpane
                        f.setSize(800, 400); //set size for frame
                        f.setVisible(true);
                        f.setLocationRelativeTo(null);
                    } catch (SQLException e1) {
                        // TODO Auto-generated catch block
                         JOptionPane.showMessageDialog(null, e1);
                    }       
                     
                     
        }
            }
        );  
         

         
         
        JButton add_user=new JButton("Add User"); //creating instance of JButton to add users
        add_user.setBounds(90,65,120,25); //set dimensions for button
         
        add_user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                     
                    JFrame g = new JFrame("Enter User Details"); //Frame to enter user details
                    //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    //Create label 
                    JLabel l1,l2;  
                    l1=new JLabel("Username");  //label 1 for username
                    l1.setBounds(30,15, 100,30); 
                     
                     
                    l2=new JLabel("Password");  //label 2 for password
                    l2.setBounds(30,50, 100,30); 
                     
                    //set text field for username 
                    JTextField F_user = new JTextField();
                    F_user.setBounds(110, 15, 200, 30);
                     
                    //set text field for password
                    JPasswordField F_pass=new JPasswordField();
                    F_pass.setBounds(110, 50, 200, 30);
                    //set radio button for admin
                    JRadioButton a1 = new JRadioButton("Admin");
                    a1.setBounds(55, 80, 200,30);
                    //set radio button for user
                    JRadioButton a2 = new JRadioButton("User");
                    a2.setBounds(130, 80, 200,30);
                    //add radio buttons
                    ButtonGroup bg=new ButtonGroup();    
                    bg.add(a1);bg.add(a2);  
                     
                                     
                    JButton create_but=new JButton("Create");//creating instance of JButton for Create 
                    create_but.setBounds(130,130,80,25);//x axis, y axis, width, height 
                    create_but.addActionListener(new ActionListener() {
                         
                        public void actionPerformed(ActionEvent e){
                         
                        String username = F_user.getText();
                        String password = F_pass.getText();
                        Boolean admin = false;
                         
                        if(a1.isSelected()) {
                            admin=true;
                        }
                         
                        Connection connection = connect();
                         
                        try {
                        Statement stmt = connection.createStatement();
                         stmt.executeUpdate("USE LIBRARY");
                         stmt.executeUpdate("INSERT INTO USERS(USERNAME,PASSWORD,ADMIN) VALUES ('"+username+"','"+password+"',"+admin+")");
                         JOptionPane.showMessageDialog(null,"User added!");
                         g.dispose();
                          
                        }
                         
                        catch (SQLException e1) {
                            // TODO Auto-generated catch block
                             JOptionPane.showMessageDialog(null, e1);
                        }   
                         
                        }
                         
                    });
                         
                     
                        g.add(create_but);
                        g.add(a2);
                        g.add(a1);
                        g.add(l1);
                        g.add(l2);
                        g.add(F_user);
                        g.add(F_pass);
                        g.setSize(350,200);//400 width and 500 height  
                        g.setLayout(null);//using no layout managers  
                        g.setVisible(true);//making the frame visible 
                        g.setLocationRelativeTo(null);
                     
                     
        }
        });
             

        f.add(users_but);
        f.add(view_but_1);
        f.add(add_user);
        f.setSize(301,150);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible 
        f.setLocationRelativeTo(null);
         
        }

	public static void user_menu(String UID) {
	     
	     
	    JFrame f=new JFrame("User Function"); //Give dialog box name as User functions
	    //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit user menu on closing the dialog box
	    JButton view_but=new JButton("View Images");//creating instance of JButton  
	    view_but.setBounds(80,20,120,25);//x axis, y axis, width, height 
	    view_but.addActionListener(new ActionListener() { 
	        public void actionPerformed(ActionEvent e){
	        	Categories c = new Categories();             
	    }
	    }
	    );
	     
	    	     
	    f.add(view_but); // add view Images
	    f.setSize(300,100);//400 width and 500 height  
	    f.setLayout(null);//using no layout managers  
	    f.setVisible(true);//making the frame visible 
	    f.setLocationRelativeTo(null);
	    }

	public static Connection connect()
	{
	try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        //System.out.println("Loaded driver");
	        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
                    "root", "root");
	        
	        //System.out.println("Connected to MySQL");
	        return con;
	 } 
	 catch (Exception ex) {
	        ex.printStackTrace();
	 }
	return null;
	}

}