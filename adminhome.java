package soft;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Vector;

import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class adminhome{

	JFrame frame;
	
	private JTextField name;
	private JTextField email;
	private JTextField contact;
	private JTextField designation;
	private JTextField department;
	private JPasswordField password;
	private JPasswordField repassword;
	@SuppressWarnings("unused")
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_6;
	private JTable table_1;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTable ids_tbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminhome window = new adminhome();
					window.frame.setResizable(false);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	

	
	public adminhome() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(adminhome.class.getResource("/soft/NETCARElog copy.png")));
		frame.setBounds(100, 100, 826, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{810, 0};
		gridBagLayout.rowHeights = new int[]{449, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		DefaultTableModel tbl = new DefaultTableModel(0,0);
		
		tbl.addColumn("Sl No.");
		tbl.addColumn("id");
		tbl.addColumn("Name");
		tbl.addColumn("Email");
		tbl.addColumn("Device Name");
		tbl.addColumn("Device Type");
		tbl.addColumn("Ip Address");
		tbl.addColumn("Mac Address");
		tbl.addColumn("Accept");
		tbl.addColumn("Reject");
		
		
		Object rowtbl[] = new Object[10];
		
		DefaultTableModel tble = new DefaultTableModel(0,0);
		
		tble.addColumn("Sl No.");
		tble.addColumn("Id");
		tble.addColumn("Date");
		tble.addColumn("Scan Type");
		tble.addColumn("Action");
		Object rowtble[] = new Object[5];
		
		DefaultTableModel tblModl = new DefaultTableModel(0,0);
		
		tblModl.addColumn("Sl No.");
		tblModl.addColumn("Name");
		tblModl.addColumn("Email");
		tblModl.addColumn("Contact");
		tblModl.addColumn("Username");
		tblModl.addColumn("Department");
		tblModl.addColumn("Designation");
		Object rows[] = new Object[7];
		
		DefaultTableModel Modl = new DefaultTableModel(0,0);
		
		Modl.addColumn("Sl No.");
		Modl.addColumn("IP Address");
		Modl.addColumn("Vulnerable Ports");
		Modl.addColumn("Status");
		Object rw[] = new Object[4];
		
		String languages[]={"Select type","Host Scaning","Port Scaning","Os detection"};
		DefaultTableModel tblModel = new DefaultTableModel(0,0);
	
		tblModel.addColumn("Sl No.");
		tblModel.addColumn("IP Address");
		tblModel.addColumn("Operating System");
		tblModel.addColumn("Open Ports");
		tblModel.addColumn("Status");
		Object row[] = new Object[5];
		
		JPanel mainpanel = new JPanel();
		GridBagConstraints gbc_mainpanel = new GridBagConstraints();
		gbc_mainpanel.fill = GridBagConstraints.BOTH;
		gbc_mainpanel.gridx = 0;
		gbc_mainpanel.gridy = 0;
		frame.getContentPane().add(mainpanel, gbc_mainpanel);
		mainpanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 810, 42);
		mainpanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminPanel = new JLabel("ADMIN PANEL");
		lblAdminPanel.setFont(new Font("BLACK CAP0S", Font.BOLD, 12));
		lblAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminPanel.setForeground(new Color(255, 255, 255));
		lblAdminPanel.setBounds(0, 11, 142, 20);
		panel.add(lblAdminPanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 40, 810, 409);
		mainpanel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 102, 0));
		panel_2.setBounds(0, 0, 179, 409);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(adminhome.class.getResource("/soft/NETCARE white.png")));
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 179, 77);
		panel_2.add(label);
		
		JButton btnhome = new JButton("Home");
		btnhome.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		btnhome.setBackground(new Color(255, 102, 0));
		btnhome.setBounds(0, 81, 179, 34);
		panel_2.add(btnhome);
		
		JButton btnNotification = new JButton("Notification");
		
		btnNotification.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNotification.setBackground(new Color(255, 102, 0));
		btnNotification.setBounds(0, 113, 179, 34);
		panel_2.add(btnNotification);
		
		JButton btnUserRegistration = new JButton("User Registration");
		
		btnUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUserRegistration.setBackground(new Color(255, 102, 0));
		btnUserRegistration.setBounds(0, 146, 179, 34);
		panel_2.add(btnUserRegistration);
		
		JButton btnUserDetails = new JButton("User Details");
		
		btnUserDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUserDetails.setBackground(new Color(255, 102, 0));
		btnUserDetails.setBounds(0, 179, 179, 34);
		panel_2.add(btnUserDetails);
		
		JButton btnIdsReport = new JButton("IDS");
		
		btnIdsReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIdsReport.setBackground(new Color(255, 102, 0));
		btnIdsReport.setBounds(0, 276, 179, 34);
		panel_2.add(btnIdsReport);
		
		JButton btnScanReport = new JButton("Scan Report");
		
		btnScanReport.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnScanReport.setBackground(new Color(255, 102, 0));
		btnScanReport.setBounds(0, 309, 179, 34);
		panel_2.add(btnScanReport);
		
		JButton btnScanning = new JButton("Scanning");
		
		btnScanning.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnScanning.setBackground(new Color(255, 102, 0));
		btnScanning.setBounds(0, 243, 179, 34);
		panel_2.add(btnScanning);
		
		JButton btnVulnerabilityTesting = new JButton("Vulnerability Testing");
		
		btnVulnerabilityTesting.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVulnerabilityTesting.setBackground(new Color(255, 102, 0));
		btnVulnerabilityTesting.setBounds(0, 211, 179, 34);
		panel_2.add(btnVulnerabilityTesting);
		
		JButton btnlogout = new JButton("Logout");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				home logout=new home();
				logout.loginframe.setVisible(true);
				frame.dispose();
			}
		});
		btnlogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnlogout.setBackground(new Color(255, 102, 0));
		btnlogout.setBounds(0, 342, 179, 34);
		panel_2.add(btnlogout);
		
		JPanel pagepane = new JPanel();
		pagepane.setBounds(178, 0, 632, 409);
		panel_1.add(pagepane);
		pagepane.setLayout(new CardLayout(0, 0));
		
		
		JPanel home = new JPanel();
		home.setBackground(Color.WHITE);
		pagepane.add(home, "name_17571682075706");
		home.setLayout(null);
		
		JLabel label_15 = new JLabel("");
		label_15.setIcon(new ImageIcon(adminhome.class.getResource("/soft/net.gif")));
		label_15.setBounds(0, 0, 632, 409);
		home.add(label_15);
		
		
		JPanel not = new JPanel();
		not.setBackground(Color.WHITE);
		pagepane.add(not, "name_17621128329410");
		not.setLayout(null);
		
		JLabel lblNotification = new JLabel("NOTIFICATION");
		lblNotification.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		lblNotification.setBounds(225, 11, 162, 26);
		not.add(lblNotification);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 44, 612, 365);
		not.add(scrollPane_2);
		
		table_4 = new JTable();
		table_4.setRowSelectionAllowed(true);
		table_4.setModel(tbl);
		table_4.getColumn("Accept").setCellRenderer(new ButtonRenderer());
	    table_4.getColumn("Accept").setCellEditor(
	        new ButtonEditor(new JCheckBox()));
	    table_4.getColumn("Reject").setCellRenderer(new ButtonRendererrej());
	    table_4.getColumn("Reject").setCellEditor(
	        new ButtonEditorrej(new JCheckBox()));
		scrollPane_2.setViewportView(table_4);
		
		JPanel usereg = new JPanel();
		usereg.setBackground(new Color(255, 255, 255));
		pagepane.add(usereg, "name_17571682075706");
		usereg.setLayout(null);
		
		JLabel lblUserRegistration = new JLabel("USER REGISTRATION");
		lblUserRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserRegistration.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		lblUserRegistration.setBounds(112, 11, 246, 36);
		usereg.add(lblUserRegistration);
		
		JLabel label_1 = new JLabel("NAME");
		label_1.setBounds(76, 64, 46, 14);
		usereg.add(label_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(202, 58, 179, 20);
		usereg.add(name);
		
		JLabel label_2 = new JLabel("EMAIL");
		label_2.setBounds(76, 102, 46, 14);
		usereg.add(label_2);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(202, 96, 179, 20);
		usereg.add(email);
		
		JLabel label_3 = new JLabel("CONTACT");
		label_3.setBounds(76, 142, 65, 14);
		usereg.add(label_3);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(202, 136, 179, 20);
		usereg.add(contact);
		
		JLabel label_4 = new JLabel("DESIGNATION");
		label_4.setBounds(76, 256, 79, 14);
		usereg.add(label_4);
		
		designation = new JTextField();
		designation.setColumns(10);
		designation.setBounds(202, 250, 179, 20);
		usereg.add(designation);
		
		JLabel label_5 = new JLabel("DEPARTMENT");
		label_5.setBounds(76, 301, 79, 14);
		usereg.add(label_5);
		
		department = new JTextField();
		department.setColumns(10);
		department.setBounds(202, 295, 179, 20);
		usereg.add(department);
		
		password = new JPasswordField();
		password.setBounds(202, 178, 179, 20);
		usereg.add(password);
		
		repassword = new JPasswordField();
		repassword.setBounds(202, 209, 179, 20);
		usereg.add(repassword);
		
		JLabel label_6 = new JLabel("PASSWORD");
		label_6.setBounds(76, 184, 79, 14);
		usereg.add(label_6);
		
		JLabel label_7 = new JLabel("RE-PASSWORD");
		label_7.setBounds(76, 215, 79, 14);
		usereg.add(label_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(391, 102, 217, 14);
		usereg.add(lblNewLabel_1);
		
		JLabel label_20 = new JLabel("");
		label_20.setForeground(Color.RED);
		label_20.setBounds(405, 136, 217, 14);
		usereg.add(label_20);
		
		JLabel label_error = new JLabel("");
		label_error.setForeground(Color.RED);
		label_error.setBounds(153, 326, 217, 14);
		usereg.add(label_error);
		
		JButton submit = new JButton("SUBMIT");
		
		submit.setBounds(151, 353, 89, 23);
		usereg.add(submit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				lblNewLabel_1.setText(null);
				 label_20.setText(null);
				
				MysqlCon db=new MysqlCon();
				Connection con=null;
				Statement smt=null;
				
				String nme=name.getText();
				String emil=email.getText();
				String mob=contact.getText();
				char[] pas=password.getPassword();
				String pass = String.copyValueOf(pas);
				char[] repas=repassword.getPassword();
				String repass = String.copyValueOf(repas);
				String desig=designation.getText();
				String dept=department.getText();
				
							
				
				Emailvalidator emailValidator = new Emailvalidator();
				Pattern pattern = Pattern.compile("\\d{10}");
			      Matcher matcher = pattern.matcher(mob);
			      
			      if(!emailValidator.validate(email.getText().trim())) {
				        System.out.print("Invalid Email ID");
				        
				        lblNewLabel_1.setText("* Invalid Email ID");
				       
				   }
			      Mobvalidator mobValidator = new Mobvalidator();
			      if(!mobValidator.validate(contact.getText().trim())) {
				        System.out.print("Invalid number");
				        
				        label_20.setText("* invalid number");
				       
				   }else {
			      
					 
			      
			     
				   
				if(pass.equals(repass)){
                    
                    try
			{
				con=db.conneCtion();
			
		String sql="INSERT INTO signin(name,email,contact,username,password,designation,department,acctype)VALUES('"+nme+"','"+emil+"','"+mob+"','"+emil+"','"+pass+"','"+desig+"','"+dept+"','user');";
                      smt=con.createStatement();
                      @SuppressWarnings("unused")
					int i=smt.executeUpdate(sql);
                      
                    name.setText(null);
      				email.setText(null);
      				contact.setText(null);
      				password.setText(null);
      				repassword.setText(null);
      				designation.setText(null);
      				department.setText(null);
      				
                        
                        }
                    catch(Exception ex)
			{
				System.out.println(ex);
			}
				 }     
                    				
				   }  
				   
			
			}
		});
		
		JButton button_1 = new JButton("RESET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				name.setText(null);
				email.setText(null);
				contact.setText(null);
				password.setText(null);
				repassword.setText(null);
				designation.setText(null);
				department.setText(null);
				
				
			}
		});
		button_1.setBounds(269, 353, 89, 23);
		usereg.add(button_1);
		
		
		
		
		
		
		
		JPanel userdet = new JPanel();
		userdet.setBackground(Color.WHITE);
		pagepane.add(userdet, "name_403979968859");
		userdet.setLayout(null);
		
		JLabel lblUserDetails = new JLabel("USER DETAILS");
		lblUserDetails.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		lblUserDetails.setBounds(220, 11, 165, 22);
		userdet.add(lblUserDetails);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 612, 365);
		userdet.add(scrollPane);
		
		table_3 = new JTable();
		table_3.setModel(tblModl);
		
				scrollPane.setViewportView(table_3);
				
		
		JPanel testng = new JPanel();
		testng.setBackground(Color.WHITE);
		pagepane.add(testng, "name_17571682075706");
		testng.setLayout(null);
		
		JLabel label_11 = new JLabel("IP Address");
		label_11.setBounds(43, 26, 65, 14);
		testng.add(label_11);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				String value=textField_4.getText();
				 if(value.length()<=4){
					 textField_5.requestFocus();
				 }
			}
		});
		textField_4.setColumns(1);
		textField_4.setBounds(112, 26, 35, 21);
		testng.add(textField_4);
		
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				String value=textField_5.getText();
				 if(value.length()<=4){
					 textField_6.requestFocus();
				 }
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(157, 26, 35, 21);
		testng.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				String value=textField_6.getText();
				 if(value.length()<=4){
					 textField_7.requestFocus();
				 }
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(202, 26, 35, 21);
		testng.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				String value=textField_7.getText();
				 if(value.length()<=4){
					 textField_7.requestFocus();
				 }
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(248, 26, 35, 21);
		testng.add(textField_7);
		
		JButton button = new JButton("Scan");
		
		button.setBounds(344, 22, 89, 23);
		testng.add(button);
		
		JLabel label_12 = new JLabel(".");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(146, 29, 17, 14);
		testng.add(label_12);
		
		JLabel label_13 = new JLabel(".");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(191, 29, 10, 14);
		testng.add(label_13);
		
		JLabel label_14 = new JLabel(".");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(238, 29, 10, 14);
		testng.add(label_14);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 63, 612, 335);
		testng.add(scrollPane_4);
		
		table_6 = new JTable();
		table_6.setModel(Modl);
		
		scrollPane_4.setViewportView(table_6);
		
		
		JPanel scaning = new JPanel();
		scaning.setBackground(Color.WHITE);
		pagepane.add(scaning, "name_17621128329410");
		scaning.setLayout(null);
		
		JLabel lblIpAddress = new JLabel("IP Address");
		lblIpAddress.setBounds(10, 46, 65, 14);
		scaning.add(lblIpAddress);
		
		textField = new JTextField();
		textField.setBounds(79, 46, 35, 21);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String value=textField.getText();
				 if(value.length()==2){
					 textField_1.requestFocus();
				 }
								
			}
		});
		scaning.add(textField);
		textField.setColumns(1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 46, 35, 21);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String value=textField_1.getText();
				 if(value.length()==2){
					 textField_2.requestFocus();
				 }
					
			}
		});
		
		textField_1.setColumns(10);
		scaning.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 46, 35, 21);
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				String value=textField_2.getText();
				 if(value.length()==2){
					 textField_3.requestFocus();
				 }
					
			}
		});
		textField_2.setColumns(10);
		scaning.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(215, 46, 35, 21);
		
		textField_3.setColumns(10);
		scaning.add(textField_3);
		
		JLabel lblScanType = new JLabel("Scan Type");
		lblScanType.setBounds(260, 48, 78, 14);
		scaning.add(lblScanType);
		final JComboBox comboBox = new JComboBox(languages);
		comboBox.setBounds(328, 45, 141, 20);
		scaning.add(comboBox);
		
		JButton btnScan = new JButton("Scan");
		btnScan.setBounds(507, 44, 89, 23);
		scaning.add(btnScan);
		
		JLabel label_8 = new JLabel(".");
		label_8.setBounds(113, 49, 17, 14);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		scaning.add(label_8);
		
		JLabel label_9 = new JLabel(".");
		label_9.setBounds(158, 49, 10, 14);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		scaning.add(label_9);
		
		JLabel label_10 = new JLabel(".");
		label_10.setBounds(205, 49, 10, 14);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		scaning.add(label_10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 96, 612, 313);
		scaning.add(scrollPane_1);
		
		table_2 = new JTable();
		table_2.setModel(tblModel);
		scrollPane_1.setViewportView(table_2);
		
		JPanel scanreport = new JPanel();
		scanreport.setBackground(Color.WHITE);
		pagepane.add(scanreport, "name_17571682075706");
		scanreport.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 52, 612, 346);
		scanreport.add(scrollPane_3);
		
		table_1 = new JTable();
		table_1.setModel(tble);
		table_1.getColumn("Action").setCellRenderer(new ButtonRendererv());
	    table_1.getColumn("Action").setCellEditor(
	        new ButtonEditorv(new JCheckBox()));
		scrollPane_3.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("Scan Report");
		lblNewLabel.setFont(new Font("BLACK CAPS", Font.PLAIN, 14));
		lblNewLabel.setBounds(232, 11, 143, 30);
		scanreport.add(lblNewLabel);
		
		JPanel scandetrep = new JPanel();
		pagepane.add(scandetrep, "name_212761114610692");
		
		
		
		
		JPanel idsreport = new JPanel();
		idsreport.setBackground(Color.WHITE);
		pagepane.add(idsreport, "name_17621128329410");
		idsreport.setLayout(null);
		
		JLabel label_16 = new JLabel("IP Address");
		label_16.setBounds(87, 25, 65, 14);
		idsreport.add(label_16);
		
		t1 = new JTextField();
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=t1.getText();
				 if(value.length()==2){
		             t2.requestFocus();
				 }      
			}
		});
		t1.setColumns(1);
		t1.setBounds(156, 25, 35, 21);
		idsreport.add(t1);
		
		t2 = new JTextField();
		t2 = new JTextField();
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=t2.getText();
				 if(value.length()==2){
		             t3.requestFocus();
				 }      
			}
		});
		t2.setColumns(10);
		t2.setBounds(201, 25, 35, 21);
		idsreport.add(t2);
		
		t3 = new JTextField();
		t3 = new JTextField();
		t3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=t3.getText();
				 if(value.length()==2){
		             t4.requestFocus();
				 }      
			}
		});
		t3.setColumns(10);
		t3.setBounds(246, 25, 35, 21);
		idsreport.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(292, 25, 35, 21);
		idsreport.add(t4);
		
		JButton scan = new JButton("Scan");
		
		scan.setBounds(388, 21, 89, 23);
		idsreport.add(scan);
		
		JLabel label_17 = new JLabel(".");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(190, 28, 17, 14);
		idsreport.add(label_17);
		
		JLabel label_18 = new JLabel(".");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setBounds(235, 28, 10, 14);
		idsreport.add(label_18);
		
		JLabel label_19 = new JLabel(".");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setBounds(282, 28, 10, 14);
		idsreport.add(label_19);
		
		JButton button_2 = new JButton("Scan");
		button_2.setBounds(5461, 5191, 89, 23);
		idsreport.add(button_2);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 68, 612, 330);
		idsreport.add(scrollPane_5);
		
		ids_tbl = new JTable();
		DefaultTableModel idstbl = new DefaultTableModel(0,0);
		ids_tbl.setModel(idstbl);
		
		idstbl.addColumn("Sl No.");
		idstbl.addColumn("IP Address");
		idstbl.addColumn("MAC Address");
		idstbl.addColumn("Status");
		Object idsrow[] = new Object[4];
		
		scrollPane_5.setViewportView(ids_tbl);
		
		
		
		btnUserRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(usereg);
				pagepane.repaint();
				pagepane.revalidate();
				
				
			
				
			}
		});
		
		btnUserDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(userdet);
				pagepane.repaint();
				pagepane.revalidate();
				
				
				tblModl.getDataVector().removeAllElements();
				tblModl.fireTableDataChanged();
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
				String sql = "select * from signin where acctype='user'";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				int slno=0;
				while(rs.next())
				{
				slno = slno+1;
				String nme = rs.getString("name");
				String emailid = rs.getString("email");
				String mob = rs.getString("contact");
				String uname = rs.getString("username");
				String dept = rs.getString("department");
				String desig = rs.getString("designation");
				
				rows[0]=slno;
				rows[1]=nme;
				rows[2]=emailid;
				rows[3]=mob;
				rows[4]=uname;
				rows[5]=dept;
				rows[6]=desig;
				
				tblModl.addRow(rows);
		        scrollPane.setViewportView(table_3);
				
				
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				

								
				
			}
		});
		
		btnNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(not);
				pagepane.repaint();
				pagepane.revalidate();
				
				
				
				
				tbl.getDataVector().removeAllElements();
				tbl.fireTableDataChanged();
				
				
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
				String sql = "select * from devreg WHERE status=0";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				int i =0;
				int slno=0;
				while(rs.next())
				{
					i=i+1;
				slno = slno+1;
				String id=rs.getString("id");
				String nme = rs.getString("name");
				String emailid = rs.getString("email");
				@SuppressWarnings("unused")
				String mob = rs.getString("contact");
				@SuppressWarnings("unused")
				String uname = rs.getString("username");
				@SuppressWarnings("unused")
				String dept = rs.getString("department");
				@SuppressWarnings("unused")
				String desig = rs.getString("designation");
				String devnme = rs.getString("devname");
				String devtyp = rs.getString("devtype");
				String ipad = rs.getString("ipadd");
				String macad = rs.getString("macadd");
				
				rowtbl[0]=slno;
				rowtbl[1]=id;
				rowtbl[2]=nme;
				rowtbl[3]=emailid;
				rowtbl[4]=devnme;
				rowtbl[5]=devtyp;
				rowtbl[6]=ipad;
				rowtbl[7]=macad;
				rowtbl[8]="accept";
				rowtbl[9]="reject";
				
				
			
				
				tbl.addRow(rowtbl);
		        scrollPane_2.setViewportView(table_4);
				
				
				
				}
				
				
				
				
				
				
				
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
						
				
				
			}
		});
		
		btnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(home);
				pagepane.repaint();
				pagepane.revalidate();
				
				
				
				
				
				
				
			}
		});
		
		
		
		btnVulnerabilityTesting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(testng);
				pagepane.repaint();
				pagepane.revalidate();
					
				
				for( int i = Modl.getRowCount() - 1; i >= 0; i-- )
				{
				Modl.removeRow(i);
				
				}
				
				//Modl.addRow(rw);
		        //scrollPane_4.setViewportView(table_6);
			}
		});
		
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				
				
			
				String ip1= textField_4.getText();
				String ip2= textField_5.getText();
				String ip3= textField_6.getText();
				String ip4= textField_7.getText();
				
				int i =Integer.parseInt(ip4);
				
				String subnet = ip1 + "." + ip2 + "." + ip3;
				System.out.println(subnet);
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate localDate = LocalDate.now();
				String date = dtf.format(localDate);
				System.out.println(date);
				
				
				
				MysqlCon db=new MysqlCon();
				Connection con=null;
				Statement smt=null;
				
							
				try
				{
					con=db.conneCtion();
				
			String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','Vulnerability scan')";
			smt=con.createStatement();
	                      @SuppressWarnings("unused")
						int j=smt.executeUpdate(sql);
	                          
				}
	                    catch(Exception ex)
				{
					System.out.println(ex);
				}
				
					int slno=1;
					
					for ( ;i < 4; i++)
			        {
					
			            String host = subnet + "." + i;
			            String command = "ping " + host;
			            
			            try{
			    			Process sysProcess = Runtime.getRuntime().exec(command);
			    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			    			
			    			int pings = 0;
			    			@SuppressWarnings("unused")
							int timeouts = 0;
			    			@SuppressWarnings("unused")
							int other = 0;
			    			
			    			
			    			String line;
			    			while((line = streamReader.readLine()) != null){
			    			
			    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
			    				
			    					timeouts++;
			    					
			    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
			    					
			    					
			    					pings++;
			    				}else if(line.contains("Request timed out") & line.contains(" TTL=")) {
			    					
			    					pings++;
			    				}
			    			}
			    			if (pings > 0){
			    				
			    				String msg;
			    				System.out.println("ping successful in " + host );
			    		        for (int port = 1; port <= 3000; port++) {
			    			         try {
			    			            Socket socket = new Socket();
			    			            socket.connect(new InetSocketAddress(host, port), 1);
			    			            socket.close();
			    			           
			    			           
			    			            
			    			            if(port == 21){
			    			            	msg="FTP port are open";
			    			            rw[0] = slno;
					    		        rw[1] = host;
					    		        rw[2]=port;
					    		        rw[3]=msg;
					    		        					    		      
					    		        Modl.addRow(rw);
					    		        scrollPane_4.setViewportView(table_6);
					    		        
					    		        
					    		        
					    		        try
					    				{ 
					    				Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
					    				String sql = "select MAX(id) FROM scaninfo";
					    				PreparedStatement ps = con1.prepareStatement(sql);
					    				ResultSet rs = ps.executeQuery();
					    				if(rs.next()){
					    				String id= rs.getString(1);
					    				System.out.println(id);
					    				
					    				
					    				
					    				try
					    				{
					    					con=db.conneCtion();
					    				
					    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
					    			smt=con.createStatement();
					    	                      @SuppressWarnings("unused")
												int j=smt.executeUpdate(sql3);
					    	                     
					    	                     
					    				}
					    	                    catch(Exception ex)
					    				{
					    					System.out.println(ex);
					    				}
					    				
					    				
					    				}
					    				}catch(Exception ex)
					    				{
					    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
					    				JOptionPane.ERROR_MESSAGE);
					    				}
					    		       
					    		        System.out.println("Port " + port + " is open on " + host);
					    		        
					    		        slno++;
			    			            }
			    			            
			    			            if(port == 22){
			    			            	 rw[0] = slno;
							    		        rw[1] = host;
							    		        rw[2]=port;
							    		        msg="SSH port are open";
							    		        rw[3]=msg;
	        					    		      
							    		        Modl.addRow(rw);
							    		        scrollPane_4.setViewportView(table_6);
							    		        
							    		        
							    		        try
							    				{ 
							    				Class.forName("com.mysql.jdbc.Driver"); 
							    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
							    				String sql = "select MAX(id) FROM scaninfo";
							    				PreparedStatement ps = con1.prepareStatement(sql);
							    				ResultSet rs = ps.executeQuery();
							    				if(rs.next()){
							    				String id= rs.getString(1);
							    				System.out.println(id);
							    				
							    				
							    				
							    				try
							    				{
							    					con=db.conneCtion();
							    				
							    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
							    			smt=con.createStatement();
							    	                      @SuppressWarnings("unused")
														int j=smt.executeUpdate(sql3);
							    	                      
							    	                     
							    				}
							    	                    catch(Exception ex)
							    				{
							    					System.out.println(ex);
							    				}
							    				
							    				
							    				}
							    				}catch(Exception ex)
							    				{
							    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
							    				JOptionPane.ERROR_MESSAGE);
							    				}
							    		        
							    		        
							    		        System.out.println("Port " + port + " is open on " + host);
						    		        
						    		        slno++;
				    			            }
				    			           
			    			            	if(port == 23){
			    			            		 rw[0] = slno;
								    		        rw[1] = host;
								    		        rw[2]=port;
								    		        msg="Telnet port are open";
								    		        rw[3]=msg;
		        					    		      
								    		        Modl.addRow(rw);
								    		        scrollPane_4.setViewportView(table_6);
								    		        
								    		        
								    		        
								    		        try
								    				{ 
								    				Class.forName("com.mysql.jdbc.Driver"); 
								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
								    				String sql = "select MAX(id) FROM scaninfo";
								    				PreparedStatement ps = con1.prepareStatement(sql);
								    				ResultSet rs = ps.executeQuery();
								    				if(rs.next()){
								    				String id= rs.getString(1);
								    				System.out.println(id);
								    				
								    				
								    				
								    				try
								    				{
								    					con=db.conneCtion();
								    				
								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
								    			smt=con.createStatement();
								    	                      @SuppressWarnings("unused")
															int j=smt.executeUpdate(sql3);
								    	                      
								    	                     
								    				}
								    	                    catch(Exception ex)
								    				{
								    					System.out.println(ex);
								    				}
								    				
								    				
								    				}
								    				}catch(Exception ex)
								    				{
								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
								    				JOptionPane.ERROR_MESSAGE);
								    				}
								    		        
								    		        
								    		        
								    		        System.out.println("Port " + port + " is open on " + host);
								    		        
							    		        slno++;
					    			            }
					    			            
			    			            		if(port == 25){
			    			            			 rw[0] = slno;
			 					    		        rw[1] = host;
			 					    		        rw[2]=port;
			 					    		        msg="SMTP port are open";
			 					    		       rw[3]=msg;
		        					    		      
								    		        Modl.addRow(rw);
								    		        scrollPane_4.setViewportView(table_6);
								    		        
								    		        
								    		        
								    		        try
								    				{ 
								    				Class.forName("com.mysql.jdbc.Driver"); 
								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
								    				String sql = "select MAX(id) FROM scaninfo";
								    				PreparedStatement ps = con1.prepareStatement(sql);
								    				ResultSet rs = ps.executeQuery();
								    				if(rs.next()){
								    				String id= rs.getString(1);
								    				System.out.println(id);
								    				
								    				
								    				
								    				try
								    				{
								    					con=db.conneCtion();
								    				
								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
								    			smt=con.createStatement();
								    	                      @SuppressWarnings("unused")
															int j=smt.executeUpdate(sql3);
								    	                     
								    				}
								    	                    catch(Exception ex)
								    				{
								    					System.out.println(ex);
								    				}
								    				
								    				
								    				}
								    				}catch(Exception ex)
								    				{
								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
								    				JOptionPane.ERROR_MESSAGE);
								    				}
								    		        
			 					    		       System.out.println("Port " + port + " is open on " + host);
			 					    		        
								    		        slno++;
						    			            }
						    			            
			    			            			if(port == 53){
			    			            				 rw[0] = slno;
			    						    		        rw[1] = host;
			    						    		        rw[2]=port;
			    						    		        msg="DNS port are open";
			    						    		        rw[3]=msg;
				        					    		      
										    		        Modl.addRow(rw);
										    		        scrollPane_4.setViewportView(table_6);
										    		        
										    		        
										    		        
										    		        try
										    				{ 
										    				Class.forName("com.mysql.jdbc.Driver"); 
										    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
										    				String sql = "select MAX(id) FROM scaninfo";
										    				PreparedStatement ps = con1.prepareStatement(sql);
										    				ResultSet rs = ps.executeQuery();
										    				if(rs.next()){
										    				String id= rs.getString(1);
										    				System.out.println(id);
										    				
										    				
										    				
										    				try
										    				{
										    					con=db.conneCtion();
										    				
										    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
										    			smt=con.createStatement();
										    	                      @SuppressWarnings("unused")
																	int j=smt.executeUpdate(sql3);
										    	                      
										    	                     
										    				}
										    	                    catch(Exception ex)
										    				{
										    					System.out.println(ex);
										    				}
										    				
										    				
										    				}
										    				}catch(Exception ex)
										    				{
										    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
										    				JOptionPane.ERROR_MESSAGE);
										    				}
		
			    						    		        System.out.println("Port " + port + " is open on " + host);
			    						    		        
									    		        slno++;
							    			            }
							    			            
			    			            				if(port == 443){
			    			            					 rw[0] = slno;
			    							    		        rw[1] = host;
			    							    		        rw[2]=port;
			    							    		        msg="HTTPS port are open";
			    							    		        rw[3]=msg;
					        					    		      
											    		        Modl.addRow(rw);
											    		        scrollPane_4.setViewportView(table_6);
											    		        
											    		        
											    		        
											    		        try
											    				{ 
											    				Class.forName("com.mysql.jdbc.Driver"); 
											    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
											    				String sql = "select MAX(id) FROM scaninfo";
											    				PreparedStatement ps = con1.prepareStatement(sql);
											    				ResultSet rs = ps.executeQuery();
											    				if(rs.next()){
											    				String id= rs.getString(1);
											    				System.out.println(id);
											    				
											    				
											    				
											    				try
											    				{
											    					con=db.conneCtion();
											    				
											    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
											    			smt=con.createStatement();
											    	                      @SuppressWarnings("unused")
																		int j=smt.executeUpdate(sql3);
											    	                     
											    	                     
											    				}
											    	                    catch(Exception ex)
											    				{
											    					System.out.println(ex);
											    				}
											    				
											    				
											    				}
											    				}catch(Exception ex)
											    				{
											    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
											    				JOptionPane.ERROR_MESSAGE);
											    				}
										    		        
			    							    		        System.out.println("Port " + port + " is open on " + host);
			    							    		        
										    		        slno++;
								    			            }
								    			            
			    			            					if(port == 110){
			    			            							rw[0] = slno;
			    								    		        rw[1] = host;
			    								    		        rw[2]=port;
			    								    		        msg="POP3 port are open";
			    								    		        rw[3]=msg;
			  		        					    		      
			    								    		        Modl.addRow(rw);
			    								    		        scrollPane_4.setViewportView(table_6);
			    								    		        
			    								    		        
			    								    		        
			    								    		        try
			    								    				{ 
			    								    				Class.forName("com.mysql.jdbc.Driver"); 
			    								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
			    								    				String sql = "select MAX(id) FROM scaninfo";
			    								    				PreparedStatement ps = con1.prepareStatement(sql);
			    								    				ResultSet rs = ps.executeQuery();
			    								    				if(rs.next()){
			    								    				String id= rs.getString(1);
			    								    				System.out.println(id);
			    								    				
			    								    				
			    								    				
			    								    				try
			    								    				{
			    								    					con=db.conneCtion();
			    								    				
			    								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
			    								    			smt=con.createStatement();
			    								    	                      @SuppressWarnings("unused")
																			int j=smt.executeUpdate(sql3);
			    								    	                     
			    								    	                     
			    								    				}
			    								    	                    catch(Exception ex)
			    								    				{
			    								    					System.out.println(ex);
			    								    				}
			    								    				
			    								    				
			    								    				}
			    								    				}catch(Exception ex)
			    								    				{
			    								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			    								    				JOptionPane.ERROR_MESSAGE);
			    								    				}
											    		        
			    								    		        System.out.println("Port " + port + " is open on " + host);
			    								    		        
											    		        slno++;
									    			            }
									    			            
			    			            						if(port == 135){
			    			            							rw[0] = slno;
			    			 					    		        rw[1] = host;
			    			 					    		        rw[2]=port;
			    			 					    		        msg="Windows Netbios port are open";
			    			 					    		       rw[3]=msg;
			 		        					    		      
			   								    		        Modl.addRow(rw);
			   								    		        scrollPane_4.setViewportView(table_6);
			   								    		        
			   								    		        
			   								    		        
			   								    		        try
			   								    				{ 
			   								    				Class.forName("com.mysql.jdbc.Driver"); 
			   								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
			   								    				String sql = "select MAX(id) FROM scaninfo";
			   								    				PreparedStatement ps = con1.prepareStatement(sql);
			   								    				ResultSet rs = ps.executeQuery();
			   								    				if(rs.next()){
			   								    				String id= rs.getString(1);
			   								    				System.out.println(id);
			   								    				
			   								    				
			   								    				
			   								    				try
			   								    				{
			   								    					con=db.conneCtion();
			   								    				
			   								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
			   								    			smt=con.createStatement();
			   								    	                      @SuppressWarnings("unused")
																		int j=smt.executeUpdate(sql3);
			   								    	                      
			   								    	                     
			   								    				}
			   								    	                    catch(Exception ex)
			   								    				{
			   								    					System.out.println(ex);
			   								    				}
			   								    				
			   								    				
			   								    				}
			   								    				}catch(Exception ex)
			   								    				{
			   								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			   								    				JOptionPane.ERROR_MESSAGE);
			   								    				}
												    		        
			    			 					    		       System.out.println("Port " + port + " is open on " + host);
			    			 					    		        
												    		        slno++;
										    			            }
										    			             
			    			            						if(port == 137){
			    			            							rw[0] = slno;
			    			 					    		        rw[1] = host;
			    			 					    		        rw[2]=port;
			    			 					    		        msg="Windows Netbios port are open";
			    			 					    		       rw[3]=msg;
			 		        					    		      
			   								    		        Modl.addRow(rw);
			   								    		        scrollPane_4.setViewportView(table_6);
			   								    		        
			   								    		        
			   								    		        
			   								    		        try
			   								    				{ 
			   								    				Class.forName("com.mysql.jdbc.Driver"); 
			   								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
			   								    				String sql = "select MAX(id) FROM scaninfo";
			   								    				PreparedStatement ps = con1.prepareStatement(sql);
			   								    				ResultSet rs = ps.executeQuery();
			   								    				if(rs.next()){
			   								    				String id= rs.getString(1);
			   								    				System.out.println(id);
			   								    				
			   								    				
			   								    				
			   								    				try
			   								    				{
			   								    					con=db.conneCtion();
			   								    				
			   								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
			   								    			smt=con.createStatement();
			   								    	                      @SuppressWarnings("unused")
																		int j=smt.executeUpdate(sql3);
			   								    	                      
			   								    	                     
			   								    				}
			   								    	                    catch(Exception ex)
			   								    				{
			   								    					System.out.println(ex);
			   								    				}
			   								    				
			   								    				
			   								    				}
			   								    				}catch(Exception ex)
			   								    				{
			   								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			   								    				JOptionPane.ERROR_MESSAGE);
			   								    				}
													    		        
			    			 					    		       System.out.println("Port " + port + " is open on " + host);
			    			 					    		        
													    		        slno++;
											    			            }
											    			            
			    			            								if(port == 138){
			    			            									rw[0] = slno;
					    			 					    		        rw[1] = host;
					    			 					    		        rw[2]=port;
					    			 					    		        msg="Windows Netbios port are open";
					    			 					    		       rw[3]=msg;
					 		        					    		      
					   								    		        Modl.addRow(rw);
					   								    		        scrollPane_4.setViewportView(table_6);
					   								    		        
					   								    		        
					   								    		        
					   								    		        try
					   								    				{ 
					   								    				Class.forName("com.mysql.jdbc.Driver"); 
					   								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
					   								    				String sql = "select MAX(id) FROM scaninfo";
					   								    				PreparedStatement ps = con1.prepareStatement(sql);
					   								    				ResultSet rs = ps.executeQuery();
					   								    				if(rs.next()){
					   								    				String id= rs.getString(1);
					   								    				System.out.println(id);
					   								    				
					   								    				
					   								    				
					   								    				try
					   								    				{
					   								    					con=db.conneCtion();
					   								    				
					   								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
					   								    			smt=con.createStatement();
					   								    	                      @SuppressWarnings("unused")
																				int j=smt.executeUpdate(sql3);
					   								    	                    
					   								    	                     
					   								    				}
					   								    	                    catch(Exception ex)
					   								    				{
					   								    					System.out.println(ex);
					   								    				}
					   								    				
					   								    				
					   								    				}
					   								    				}catch(Exception ex)
					   								    				{
					   								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
					   								    				JOptionPane.ERROR_MESSAGE);
					   								    				}
					    			 					    		       System.out.println("Port " + port + " is open on " + host);
					    			 					    		       
														    		        
														    		        slno++;
												    			            }
												    			            if(port == 139){
												    			            	rw[0] = slno;
						    			 					    		        rw[1] = host;
						    			 					    		        rw[2]=port;
						    			 					    		        msg="Windows Netbios port are open";
						    			 					    		        					    		      
						    			 					    		       rw[3]=msg;
						 		        					    		      
						   								    		        Modl.addRow(rw);
						   								    		        scrollPane_4.setViewportView(table_6);
						   								    		        
						   								    		        
						   								    		        
						   								    		        try
						   								    				{ 
						   								    				Class.forName("com.mysql.jdbc.Driver"); 
						   								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
						   								    				String sql = "select MAX(id) FROM scaninfo";
						   								    				PreparedStatement ps = con1.prepareStatement(sql);
						   								    				ResultSet rs = ps.executeQuery();
						   								    				if(rs.next()){
						   								    				String id= rs.getString(1);
						   								    				System.out.println(id);
						   								    				
						   								    				
						   								    				
						   								    				try
						   								    				{
						   								    					con=db.conneCtion();
						   								    				
						   								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
						   								    			smt=con.createStatement();
						   								    	                      @SuppressWarnings("unused")
																					int j=smt.executeUpdate(sql3);
						   								    	                     
						   								    	                     
						   								    				}
						   								    	                    catch(Exception ex)
						   								    				{
						   								    					System.out.println(ex);
						   								    				}
						   								    				
						   								    				
						   								    				}
						   								    				}catch(Exception ex)
						   								    				{
						   								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
						   								    				JOptionPane.ERROR_MESSAGE);
						   								    				}
															    		       
						    			 					    		       System.out.println("Port " + port + " is open on " + host);
						    			 					    		        
															    		        slno++;
													    			            }
													    			            if(port == 1433){
													    			            	rw[0] = slno;
							    			 					    		        rw[1] = host;
							    			 					    		        rw[2]=port;
							    			 					    		        msg="Microsoft SQL port are open";
							    			 					    		        					    		      
							    			 					    		       rw[3]=msg;
							 		        					    		      
							   								    		        Modl.addRow(rw);
							   								    		        scrollPane_4.setViewportView(table_6);
							   								    		        
							   								    		        
							   								    		        
							   								    		        try
							   								    				{ 
							   								    				Class.forName("com.mysql.jdbc.Driver"); 
							   								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
							   								    				String sql = "select MAX(id) FROM scaninfo";
							   								    				PreparedStatement ps = con1.prepareStatement(sql);
							   								    				ResultSet rs = ps.executeQuery();
							   								    				if(rs.next()){
							   								    				String id= rs.getString(1);
							   								    				System.out.println(id);
							   								    				
							   								    				
							   								    				
							   								    				try
							   								    				{
							   								    					con=db.conneCtion();
							   								    				
							   								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
							   								    			smt=con.createStatement();
							   								    	                      @SuppressWarnings("unused")
																						int j=smt.executeUpdate(sql3);
							   								    	                      
							   								    	                     
							   								    				}
							   								    	                    catch(Exception ex)
							   								    				{
							   								    					System.out.println(ex);
							   								    				}
							   								    				
							   								    				
							   								    				}
							   								    				}catch(Exception ex)
							   								    				{
							   								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
							   								    				JOptionPane.ERROR_MESSAGE);
							   								    				}
																    		        
							    			 					    		       System.out.println("Port " + port + " is open on " + host);
							    			 					    		       
																    		        slno++;
														    			            }
														    			            if(port == 1434){
														    			            	rw[0] = slno;
								    			 					    		        rw[1] = host;
								    			 					    		        rw[2]=port;
								    			 					    		        msg="Microsoft SQL port are open";
								    			 					    		        					    		      
								    			 					    		       rw[3]=msg;
								 		        					    		      
								   								    		        Modl.addRow(rw);
								   								    		        scrollPane_4.setViewportView(table_6);
								   								    		        
								   								    		        
								   								    		        
								   								    		        try
								   								    				{ 
								   								    				Class.forName("com.mysql.jdbc.Driver"); 
								   								    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
								   								    				String sql = "select MAX(id) FROM scaninfo";
								   								    				PreparedStatement ps = con1.prepareStatement(sql);
								   								    				ResultSet rs = ps.executeQuery();
								   								    				if(rs.next()){
								   								    				String id= rs.getString(1);
								   								    				System.out.println(id);
								   								    				
								   								    				
								   								    				
								   								    				try
								   								    				{
								   								    					con=db.conneCtion();
								   								    				
								   								    			String sql3="INSERT INTO vscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','"+msg+"')";
								   								    			smt=con.createStatement();
								   								    	                      @SuppressWarnings("unused")
																							int j=smt.executeUpdate(sql3);
								   								    	                      
								   								    	                     
								   								    				}
								   								    	                    catch(Exception ex)
								   								    				{
								   								    					System.out.println(ex);
								   								    				}
								   								    				
								   								    				
								   								    				}
								   								    				}catch(Exception ex)
								   								    				{
								   								    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
								   								    				JOptionPane.ERROR_MESSAGE);
								   								    				}
																	    		   
								    			 					    		       System.out.println("Port " + port + " is open on " + host);
								    			 					    		        
																	    		        slno++;
															    			            }
															    			            					    		        
					   		 
			    			        } catch (Exception ex) {
			    			        
			    			        	
			    			        }
			    			      }	
			    		        
			    		        
			    				
			    			
			    				
			    				
			    			}
			    			
			    			
			    		}catch (IOException ex){
			    			System.err.println(ex.getMessage());
			    		}
			            
			            }
				
			}
		});
		
		
		
		btnScanning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(scaning);
				pagepane.repaint();
				pagepane.revalidate();
				
				for( int i = tblModel.getRowCount() - 1; i >= 0; i-- )
				{
					tblModel.removeRow(i);
				
				}
			
			}
		});
		
		btnScan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				String cb = (String) comboBox.getItemAt(comboBox.getSelectedIndex()); 
				
				String ip1= textField.getText();
				String ip2= textField_1.getText();
				String ip3= textField_2.getText();
				String ip4= textField_3.getText();
				
				int i =Integer.parseInt(ip4);
				
				String subnet = ip1 + "." + ip2 + "." + ip3;
				System.out.println(subnet);
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate localDate = LocalDate.now();
				String date = dtf.format(localDate);
				System.out.println(date);
				System.out.println(cb);
		
				
				MysqlCon db=new MysqlCon();
				Connection con=null;
				Statement smt=null;
				
							
				
				
				if(cb == "Select type"){
					
					JOptionPane.showMessageDialog(null, "Select Scan Type");
					
				}
				
				if(cb == "Host Scaning"){

					
					try
					{
						con=db.conneCtion();
					
				String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','"+cb+"')";
				smt=con.createStatement();
		                      @SuppressWarnings("unused")
							int j=smt.executeUpdate(sql);
		                      
					}
		                    catch(Exception ex)
					{
						System.out.println(ex);
					}
					
					int slno=1;
					
					
					
					
					for ( ;i < 4; i++)
			        {
					
			            String host = subnet + "." + i;
			            String command = "ping " + host;
			            
			            try{
			    			Process sysProcess = Runtime.getRuntime().exec(command);
			    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			    			
			    			int pings = 0;
			    			@SuppressWarnings("unused")
							int timeouts = 0;
			    			@SuppressWarnings("unused")
							int other = 0;
			    			
			    			
			    			String line;
			    			while((line = streamReader.readLine()) != null){
			    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
			    				
			    					timeouts++;
			    					
			    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
			    					
			    					
			    					pings++;
			    				}else if(line.contains("Request timed out") & line.contains(" TTL=")) {
			    					
			    					pings++;
			    				}
			    			}
			    			if (pings > 0){
			    				
			    				row[0] = slno;
			    		        row[1] = host;
			    		        row[2] = "Not Found";
			    		        row[3] = "Not Found";
			    		        row[4] = "Host Found";
			    		        tblModel.addRow(row);
			    		        scrollPane_1.setViewportView(table_2);
			    		        
			    		        slno++;
			    		        		    							
			    				 
			    		        try
			    				{ 
			    				Class.forName("com.mysql.jdbc.Driver"); 
			    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
			    				String sql = "select MAX(id) FROM scaninfo";
			    				PreparedStatement ps = con1.prepareStatement(sql);
			    				ResultSet rs = ps.executeQuery();
			    				if(rs.next()){
			    				String id= rs.getString(1);
			    				System.out.println(id);
			    				
			    				
			    				
			    				try
			    				{
			    					con=db.conneCtion();
			    				
			    			String sql3="INSERT INTO hostscan(scanid,ipaddress,result) VALUES ('"+id+"','"+host+"','success')";
			    			smt=con.createStatement();
			    	                      @SuppressWarnings("unused")
										int j=smt.executeUpdate(sql3);
			    	                     
			    				}
			    	                    catch(Exception ex)
			    				{
			    					System.out.println(ex);
			    				}
			    				
			    				
			    				}
			    				}catch(Exception ex)
			    				{
			    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			    				JOptionPane.ERROR_MESSAGE);
			    				}
			    		        
			    				System.out.println("ping successful in " + host );
			    			}else {
			    				
			    				
			    				System.out.println("ping failed in " + host);
			    			}
			    			
			    			
			    		}catch (IOException ex){
			    			System.err.println(ex.getMessage());
			    		}
			            
			        }
					
					
				}
                     if(cb == "Port Scaning"){	
                    	 
                    	 
                    	 try
         				{
         					con=db.conneCtion();
         				
         			String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','"+cb+"')";
         			smt=con.createStatement();
         	                      @SuppressWarnings("unused")
								int j=smt.executeUpdate(sql);
         	                      
         				}
         	                    catch(Exception ex)
         				{
         					System.out.println(ex);
         				}
					
					int slno=1;
					
					for ( ;i < 4; i++)
			        {
					
			            String host = subnet + "." + i;
			            String command = "ping " + host;
			           
			            try{
			    			Process sysProcess = Runtime.getRuntime().exec(command);
			    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			    			
			    			int pings = 0;
			    			@SuppressWarnings("unused")
							int timeouts = 0;
			    			@SuppressWarnings("unused")
							int other = 0;
			    			
			    			
			    			String line;
			    			while((line = streamReader.readLine()) != null){
			    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
			    				
			    					timeouts++;
			    					
			    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
			    					
			    					
			    					pings++;
			    				}else if(line.contains("Request timed out") & line.contains(" TTL=")) {
			    					
			    					pings++;
			    				}
			    			}
			    			if (pings > 0){
			 			
			    				System.out.println("ping successful in " + host );
			    		        for (int port = 1; port <= 3000; port++) {
			    			         try {
			    			            Socket socket = new Socket();
			    			            socket.connect(new InetSocketAddress(host, port), 1);
			    			            socket.close();
			    			            row[0] = slno;
					    		        row[1] = host;
					    		        row[2]="Not Found";
					    		        row[3] = port;
					    		        row[4]="open port found on" + host;
					    		      
					    		        tblModel.addRow(row);
					    		        scrollPane_1.setViewportView(table_2);
					    		        
					    		        slno++;
					    		        
					    		        
					    		        try
					    				{ 
					    				Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
					    				String sql = "select MAX(id) FROM scaninfo";
					    				PreparedStatement ps = con1.prepareStatement(sql);
					    				ResultSet rs = ps.executeQuery();
					    				if(rs.next()){
					    				String id= rs.getString(1);
					    				System.out.println(id);
					    				
					    				
					    				
					    				try
					    				{
					    					con=db.conneCtion();
					    				
					    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result) VALUES ('"+id+"','"+host+"','"+port+"','success')";
					    			smt=con.createStatement();
					    	                      @SuppressWarnings("unused")
												int j=smt.executeUpdate(sql3);
					    	                      //int i1=smt.executeUpdate(sql1);
					    	                     
					    				}
					    	                    catch(Exception ex)
					    				{
					    					System.out.println(ex);
					    				}
					    				
					    				
					    				}
					    				}catch(Exception ex)
					    				{
					    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
					    				JOptionPane.ERROR_MESSAGE);
					    				}
					    		        
					    		        
					    		        
					    		        
					    		        
					    		        
			    			            System.out.println("Port " + port + " is open on " + host);
			    			            
			    			        } catch (Exception ex) {
			    			        }
			    			      }	
			    		        
			    		        
			    				
			    			}else {
			    				
			    				
			    			}
			    			
			    			
			    		}catch (IOException ex){
			    			System.err.println(ex.getMessage());
			    		}
			            
			        }
					
					
				}
                    
                     if(cb == "Os detection"){	
                    	 
                    	 try
         				{
         					con=db.conneCtion();
         				
         			String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','"+cb+"')";
         			smt=con.createStatement();
         	                      @SuppressWarnings("unused")
								int j=smt.executeUpdate(sql);
         	                      
         				}
         	                    catch(Exception ex)
         				{
         					System.out.println(ex);
         				}
     					
     					int slno=1;
     					
     					for ( ;i < 4; i++)
     			        {
     					
     			            String host = subnet + "." + i;
     			            String command = "ping " + host;
     			            try{
     			    			Process sysProcess = Runtime.getRuntime().exec(command);
     			    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
     			    			
     			    			int pings = 0;
     			    			@SuppressWarnings("unused")
								int timeouts = 0;
     			    			@SuppressWarnings("unused")
								int other = 0;
     			    			
     			    			
     			    			String line;
     			    			String OsType="";
     			    			while((line = streamReader.readLine()) != null){
     			    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
     			    				
     			    					timeouts++;
     			    					
     			    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
     			    					
     			    					
     			    					pings++;
     			    				}
     			    				
     			    				if(line.contains(" TTL=128")){
     			    					
     			    					OsType="Windows";
     			    				}else if(line.contains(" TTL=64")){
     			    					
     			    					OsType="Linux kernel os";
     			    				}else if(line.contains(" TTL=225")){
     			    					
     			    					OsType="Linux kernel 2.2.14 or 2.4 os";
     			    				}else if(line.contains(" TTL=60")){
     			    					
     			    					OsType="Mac";
     			    				}
     			    			}
     			    			if (pings > 0){
     			    				
     			   				try
    			    				{ 
    			    				Class.forName("com.mysql.jdbc.Driver"); 
    			    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
    			    				String sql = "select MAX(id) FROM scaninfo";
    			    				PreparedStatement ps = con1.prepareStatement(sql);
    			    				ResultSet rs = ps.executeQuery();
    			    				if(rs.next()){
    			    				String id= rs.getString(1);
    			    				System.out.println(id);
    			    				
    			    				
    			    				
    			    				try
    			    				{
    			    					con=db.conneCtion();
    			    				
    			    			String sql3="INSERT INTO osscan(scanid,ipaddress,result) VALUES ('"+id+"','"+host+"','"+OsType+"')";
    			    			smt=con.createStatement();
    			    	                      @SuppressWarnings("unused")
											int j=smt.executeUpdate(sql3);
    			    	                              
    			    				}
    			    	                    catch(Exception ex)
    			    				{
    			    					System.out.println(ex);
    			    				}
    			    				
    			    				
    			    				}
    			    				}catch(Exception ex)
    			    				{
    			    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
    			    				JOptionPane.ERROR_MESSAGE);
    			    				}
     			    				
     			    				
     			    				System.out.println(OsType);     			    				
     			    				System.out.println("ping successful in " + host );
     			    		       
     			    				row[0] = slno;
				    		        row[1] = host;
				    		        row[2]=OsType;
				    		        row[3] = "Not Found";
				    		        row[4]="Operating system found on" + host;
				    		      
				    		        tblModel.addRow(row);
				    		        scrollPane_1.setViewportView(table_2);
     					    		           
				    		        slno++;      			    		        
     			    		        
     			    				
     			    			}else {
     			    				
     			    				
     			    			}
     			    			
     			    			
     			    		}catch (IOException ex){
     			    			System.err.println(ex.getMessage());
     			    		}
     			            
     			        }
     					
     					
     				}
                     
                     
                     
                     
                     
                     
                     
                     
				
						
			
			}

			@SuppressWarnings("unused")
			private TableModel DefaultTableModel() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		btnIdsReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(idsreport);
				pagepane.repaint();
				pagepane.revalidate();
				
				for( int i = idstbl.getRowCount() - 1; i >= 0; i-- )
				{
					idstbl.removeRow(i);
				
				}
				
		    			
			}
				
			
			
		});
		
		scan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String ip1= t1.getText();
				String ip2= t2.getText();
				String ip3= t3.getText();
				String ip4= t4.getText();
				
				int i =Integer.parseInt(ip4);
				
				String subnet = ip1 + "." + ip2 + "." + ip3;
				System.out.println(subnet);
				
				
				int slno=1;
				
				
				
				
				for ( ;i < 5; i++)
		        {
				
		            String host = subnet + "." + i;
		            String command = "ping " + host;
		            
		            try{
		    			Process sysProcess = Runtime.getRuntime().exec(command);
		    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
		    			
		    			int pings = 0;
		    			@SuppressWarnings("unused")
						int timeouts = 0;
		    			@SuppressWarnings("unused")
						int other = 0;
		    			
		    			
		    			String line1;
		    			while((line1 = streamReader.readLine()) != null){
		    				if(line1.contains("Destination host unreachable") || line1.contains("Request timed out")){
		    				
		    					timeouts++;
		    					
		    				}else if(line1.contains(" time=") || line1.contains(" TTL=")) {
		    					
		    					
		    					pings++;
		    				}else if(line1.contains("Request timed out") & line1.contains(" TTL=")) {
		    					
		    					pings++;
		    				}
		    			}
		    			if (pings > 0){
		    				
		    				
		    				Runtime rt = Runtime.getRuntime();
		    			       Process pr = rt.exec("arp -a " + host );

		    			        BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		    			        @SuppressWarnings({ "resource", "unused" })
								FileOutputStream fout=new FileOutputStream("I:\\output1.txt");
		    			     
		    			        String line=null;
		    			        while((line=input.readLine()) != null) {
		    			        	
		    			        	StringTokenizer defaultTokenizer = new StringTokenizer(line);
		    			            String test; 
		    			            while (defaultTokenizer.hasMoreTokens())
		    			            {
		    			    test=defaultTokenizer.nextToken();
		    			             
		    			    Pattern p = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
		    		        Matcher m = p.matcher(test);
		    		     
		    			   if(m.find()==true)
		    			   {
		    				  		
		    				  MysqlCon db=new MysqlCon();
		    					Connection con=null;
		    					java.sql.Statement smt=null;
		    					java.sql.ResultSet rs=null;
		    					try{
		    						con=db.conneCtion();
		    						String sql="select * from devreg where macadd='"+test+"' and status=1";
		    						
		    						smt=con.createStatement();
		    						rs=smt.executeQuery(sql);
		    						
		    						//System.out.println(test);
		    						
		    			int flag=0;
		    						if(rs.next() )
		    						{
		    							
		    							
		    							flag=1;
		    							@SuppressWarnings("unused")
										String Address=rs.getString("macadd");
		    					
		    						}
		    						if(flag==0)
		    						{
		    							
		    							
		    							MysqlCon db1=new MysqlCon();
				    					Connection con1=null;
				    					java.sql.Statement smt1=null;
				    					try{
		    							
		    							 con1=db1.conneCtion();
		    							String st="Indtruder Detected";
		    							
		    			    			String sql3="INSERT INTO ids(ipadd,macadd,status) VALUES ('"+host+"','"+test+"','"+st+"')";
		    			    			smt1=con1.createStatement();
		    			    	        @SuppressWarnings("unused")
										int j=smt1.executeUpdate(sql3);
		    							
				    					}catch (Exception id){
				    						
				    						System.out.println(id);
				    						
				    					}
		    							
		    							idsrow[0]=slno; 
		    							idsrow[1]=host;
		    							idsrow[2]=test;
		    							idsrow[3]="Indtruder Detected";
		    							idstbl.addRow(idsrow);
		    							
		    							
		    							
		    							System.out.println("Intruder Detected "+test);
		    							
		    							 slno++;
		    							
		    						}
		    				}
		    					catch(Exception e)
		    			{
		    						System.out.println(e);
		    						}
		    			   }
		    			            }
		    			        
		    			        	
		    			        }
		    			        @SuppressWarnings("unused")
								int exitVal = pr.waitFor();
		    				
		    				
		    				
		    		        
		    		       
		    		        		    							
		    				 
		    		         				
		    				try
		    				{
		    					
		    				    	                      
		    	                     
		    				}
		    	                    catch(Exception ex)
		    				{
		    					System.out.println(ex);
		    				}
		    				
		    				
		    				}
		    				}catch(Exception ex)
		    				{
		    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
		    				JOptionPane.ERROR_MESSAGE);
		    				}
		    		        
		    				System.out.println("ping successful in " + host );
		    			}
				
				
			}
		});
		
		btnScanReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				pagepane.removeAll();
				pagepane.repaint();
				pagepane.revalidate();
				pagepane.add(scanreport);
				pagepane.repaint();
				pagepane.revalidate();
				
				
				tble.getDataVector().removeAllElements();
				tble.fireTableDataChanged();
				
				
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
				String sql = "select * from scaninfo ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				int slno=0;
				while(rs.next())
				{
				slno = slno+1;
				String id=rs.getString("id");
				String dat = rs.getString("date");
				String stype = rs.getString("scantype");
				
				
				rowtble[0]=slno;
				rowtble[1]=id;				
				rowtble[2]=dat;
				rowtble[3]=stype;
				rowtble[4]="View Report";
				
				tble.addRow(rowtble);
		        scrollPane_3.setViewportView(table_1);
				
				
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		
		
	}
}
@SuppressWarnings("serial")
class ButtonRenderer extends JButton implements TableCellRenderer {

	  public ButtonRenderer() {
	    setOpaque(true);
	  }

	  public Component getTableCellRendererComponent(JTable table_4, Object value,
	      boolean isSelected, boolean hasFocus, int row, int column) {
	    if (isSelected) {
	      setForeground(table_4.getSelectionForeground());
	      setBackground(table_4.getSelectionBackground());
	    } else {
	      setForeground(table_4.getForeground());
	      setBackground(UIManager.getColor("Button.background"));
	    }
	    setText((value == null) ? "" : value.toString());
	    return this;
	  }
	}



	@SuppressWarnings("serial")
	class ButtonEditor extends DefaultCellEditor {
	  protected JButton button;

	  private String label;

	  private boolean isPushed;

	  public ButtonEditor(JCheckBox checkBox) {
	    super(checkBox);
	    button = new JButton();
	    button.setOpaque(true);
	    button.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	    	  //table update code should be write here
	        fireEditingStopped();
	      }
	    });
	  }

	  public Component getTableCellEditorComponent(JTable table_4, Object value,
	      boolean isSelected, int row, int column) {
	    if (isSelected) {
	      button.setForeground(table_4.getSelectionForeground());
	      button.setBackground(table_4.getSelectionBackground());
	    } else {
	      button.setForeground(table_4.getForeground());
	      button.setBackground(table_4.getBackground());
	    }
	    @SuppressWarnings("unused")
		Object label1 = (value == null) ? "" : value.toString();
	  //  label=Integer.toString(table_4.getSelectedRow());
	    
	    int selctrow = table_4.getSelectedRow();
	    label = (String) table_4.getValueAt(selctrow, 1);
	    
	   // label= data.toString();
	    button.setText("Accepted");
	    isPushed = true;
	    return button;
	  }

	  public Object getCellEditorValue() {
	    if (isPushed) {
	      
	    	    	
	    	System.out.println(label);
	    	
	      JOptionPane.showMessageDialog(button, label);
	     
	      MysqlCon db=new MysqlCon();
			Connection con=null;
			Statement smt=null;
			String st="1";
			try
			{
				con=db.conneCtion();
			
		String sql="UPDATE devreg SET status='"+st+"' WHERE id='"+label+"' ";              
		smt=con.createStatement();
                      @SuppressWarnings("unused")
					int i=smt.executeUpdate(sql);
                      
                                          
                        }
                    catch(Exception ex)
			{
				System.out.println(ex);
			}
	      
	      
	      
	    }
	    isPushed = false;
	    return new String("Accepted");
	  }

	  public boolean stopCellEditing() {
	    isPushed = false;
	    return super.stopCellEditing();
	  }

	  protected void fireEditingStopped() {
	    super.fireEditingStopped();
	  }
	}

	@SuppressWarnings("serial")
	class ButtonRendererrej extends JButton implements TableCellRenderer {

		  public ButtonRendererrej() {
		    setOpaque(true);
		  }

		  public Component getTableCellRendererComponent(JTable table_4, Object value,
		      boolean isSelected, boolean hasFocus, int row, int column) {
		    if (isSelected) {
		      setForeground(table_4.getSelectionForeground());
		      setBackground(table_4.getSelectionBackground());
		    } else {
		      setForeground(table_4.getForeground());
		      setBackground(UIManager.getColor("Button.background"));
		    }
		    setText((value == null) ? "" : value.toString());
		    return this;
		  }
		}



		@SuppressWarnings("serial")
		class ButtonEditorrej extends DefaultCellEditor {
		  protected JButton button;

		  private String label;

		  private boolean isPushed;

		  public ButtonEditorrej(JCheckBox checkBox) {
		    super(checkBox);
		    button = new JButton();
		    button.setOpaque(true);
		    button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  //table update code should be write here
		    	 
		        fireEditingStopped();
		      }
		    });
		  }

		  public Component getTableCellEditorComponent(JTable table_4, Object value,
		      boolean isSelected, int row, int column) {
		    if (isSelected) {
		      button.setForeground(table_4.getSelectionForeground());
		      button.setBackground(table_4.getSelectionBackground());
		    } else {
		      button.setForeground(table_4.getForeground());
		      button.setBackground(table_4.getBackground());
		    }
		    @SuppressWarnings("unused")
			Object label1 = (value == null) ? "" : value.toString();
		  //  label=Integer.toString(table_4.getSelectedRow());
		    
		    
		    int selctrow = table_4.getSelectedRow();
		    label = (String) table_4.getValueAt(selctrow, 1);
		    
		   // label= data.toString();
		    button.setText("Rejected");
		    isPushed = true;
		    return button;
		  }

		  public Object getCellEditorValue() {
		    if (isPushed) {
		      
		    	    	
		    	System.out.println( "reject " +label);
		    	
		      JOptionPane.showMessageDialog(null, label + " reject");
		      
		     
		     MysqlCon db=new MysqlCon();
				Connection con=null;
				Statement smt=null;
				String st="2";
				try
				{
					con=db.conneCtion();
				
			String sql="UPDATE devreg SET status='"+st+"' WHERE id='"+label+"' ";              
			smt=con.createStatement();
	                      @SuppressWarnings("unused")
						int i=smt.executeUpdate(sql);
	                      
	                                          
	                        }
	                    catch(Exception ex)
				{
					System.out.println(ex);
				}
		      
		      
		      
		    }
		    isPushed = false;
		    return new String("Rejected");
		    
		  }

		  public boolean stopCellEditing() {
		    isPushed = false;
		    return super.stopCellEditing();
		  }

		  protected void fireEditingStopped() {
		    super.fireEditingStopped();
		  }
		}
		
		@SuppressWarnings("serial")
		class ButtonRendererv extends JButton implements TableCellRenderer {

			  public ButtonRendererv() {
			    setOpaque(true);
			  }

			  public Component getTableCellRendererComponent(JTable table_1, Object value,
			      boolean isSelected, boolean hasFocus, int row, int column) {
			    if (isSelected) {
			      setForeground(table_1.getSelectionForeground());
			      setBackground(table_1.getSelectionBackground());
			    } else {
			      setForeground(table_1.getForeground());
			      setBackground(UIManager.getColor("Button.background"));
			    }
			    setText((value == null) ? "" : value.toString());
			    return this;
			  }
			}



			@SuppressWarnings("serial")
			class ButtonEditorv extends DefaultCellEditor {
			  protected JButton button;
			  static String idsc;
			  static String type;
			  private String label;

			  private boolean isPushed;
			@SuppressWarnings("unused")
			private Object frame;

			  public ButtonEditorv(JCheckBox checkBox) {
			    super(checkBox);
			    button = new JButton();
			    button.setOpaque(true);
			    button.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {
			    	  //table update code should be write here
			        fireEditingStopped();
			      }
			    });
			  }

			  public Component getTableCellEditorComponent(JTable table_1, Object value,
			      boolean isSelected, int row, int column) {
			    if (isSelected) {
			      button.setForeground(table_1.getSelectionForeground());
			      button.setBackground(table_1.getSelectionBackground());
			    } else {
			      button.setForeground(table_1.getForeground());
			      button.setBackground(table_1.getBackground());
			    }
			    @SuppressWarnings("unused")
				Object label1 = (value == null) ? "" : value.toString();
			  //  label=Integer.toString(table_4.getSelectedRow());
			    
			    int selctrow = table_1.getSelectedRow();
			    label = (String) table_1.getValueAt(selctrow, 1);
			    
			   // label= data.toString();
			    button.setText(label);
			    isPushed = true;
			    return button;
			  }

			  public Object getCellEditorValue() {
			    if (isPushed) {
			      
			    	    	
			    	System.out.println( "reject " +label);
			    	
			    //  JOptionPane.showMessageDialog(button, label + " reject");
			     
			     	
			      try
					{ 
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","root");
					String sql = "select * from scaninfo where id='"+label+"' ";
					PreparedStatement ps = con.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					@SuppressWarnings("unused")
					int i =0;
					@SuppressWarnings("unused")
					int slno=0;
					if(rs.next())
					{
						String type=rs.getString("scantype");
						String idsc=rs.getString("id");
						
						if(type.equals("Host Scaning")){
						Showresulthost window = new Showresulthost(idsc);
                    	window.setVisible(true);
                    	//adminhome.frame.dispose();
						}
						
						if(type.equals("Vulnerability scan")){
							Showresultvul window = new Showresultvul(idsc);
	                    	window.setVisible(true);
	                    	//adminhome.frame.dispose();
							}
						if(type.equals("Port Scaning")){
							Showresultport window = new Showresultport(idsc);
	                    	window.setVisible(true);
	                    	//adminhome.frame.dispose();
							}
						if(type.equals("Os detection")){
							Showresultos window = new Showresultos(idsc);
	                    	window.setVisible(true);
	                    	//adminhome.frame.dispose();
							}
						
					}
					}catch(Exception ex)
					{
					JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
					JOptionPane.ERROR_MESSAGE);
					}
			      
			     // System.out.println(type);
			    }
			    isPushed = false;
			    return new String(label);
			  }

			  public boolean stopCellEditing() {
			    isPushed = false;
			    return super.stopCellEditing();
			  }

			  protected void fireEditingStopped() {
			    super.fireEditingStopped();
			  }
			}

