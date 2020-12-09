  package soft;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class home {
	
	static String username;

	 JFrame loginframe;
	private JTextField uname;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
					window.loginframe.setResizable(false);
					window.loginframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public home() {
		
		
		
		
		initialize();
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginframe = new JFrame();
		loginframe.setBounds(100, 100, 632, 446);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{199, 386, 0};
		gridBagLayout.rowHeights = new int[]{407, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		loginframe.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		loginframe.getContentPane().add(panel, gbc_panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(home.class.getResource("/soft/NETCARElog copy.png")));
		label.setBounds(13, 155, 195, 70);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		loginframe.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(10, 78, 386, 35);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLoginForm.setForeground(Color.WHITE);
		lblLoginForm.setBounds(160, 11, 87, 14);
		panel_2.add(lblLoginForm);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 128));
		panel_3.setBounds(10, 113, 386, 226);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblerror = new JLabel("");
		lblerror.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblerror.setForeground(Color.RED);
		lblerror.setBounds(100, 40, 300, 14);
		panel_3.add(lblerror);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setBounds(34, 62, 89, 20);
		panel_3.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(34, 107, 89, 20);
		panel_3.add(lblPassword);
		
		uname = new JTextField();
		uname.setBounds(122, 62, 180, 20);
		panel_3.add(uname);
		uname.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(122, 107, 180, 20);
		panel_3.add(pass);
		
		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			private Object loginframe;

			public void actionPerformed(ActionEvent e) {
				
				
				 MysqlCon db=new MysqlCon();
					Connection con=null;
					Statement smt=null;
					ResultSet rs=null;
					
				
					if(e.getSource()== login)
					{
						String username=uname.getText();
						String password=new String(pass.getPassword());
						try
						{
							con=db.conneCtion();
						
					String sql="select * from signin where username='"+username+"' AND password='"+password+"'";
						smt=con.createStatement();
						rs=smt.executeQuery(sql);
						
						
						if(rs.next())
						{
							
			                            String acctype=rs.getString("acctype");
			                            
			                         
			                            
			                           if("admin".equals(acctype)){
			                               
			                             
			                        	   
			           					 
			           					 adminhome admin=new adminhome();
			           					 admin.frame.setVisible(true);
			           					 home.this.loginframe.dispose();
			           					 
			           					 
			                               
			                               
			                            } 			
			                           if("user".equals(acctype)){
			                               
			                              
			                        	   
			           					
			                        	user window = new user(username);
			                        	window.getFrame().setVisible(true);
			                        	home.this.loginframe.dispose();
			           					
			                           } 			
						
						}
						else
						{
							System.out.println("Login Failed");
							lblerror.setText(" * Invalid Username or Password");
							
						}
						}

						catch(Exception ex)
						{
							System.out.println(ex);
						}
					
					}
				
				
			}

			
		});
		login.setBounds(34, 167, 89, 23);
		panel_3.add(login);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				uname.setText(null);
				pass.setText(null);
				
				
			}
		});
		btnReset.setBounds(147, 167, 89, 23);
		panel_3.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
				
			}
		});
		btnExit.setBounds(259, 167, 89, 23);
		panel_3.add(btnExit);
	}
}
