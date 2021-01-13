package soft;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.net.NetworkInterface;

public class user {

	static  String username;
	private JFrame frame;
	private JTextField devname;
	private JTextField devtype;
	private JTextField ip;
	private JTextField mac;
	static  String uname;
	private JTable table_1;
	static String id ;
        static String ipn ;
        static String macn ;
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					user window = new user(username);
					window.getFrame().setResizable(false);
					window.getFrame().setVisible(true);
					@SuppressWarnings("unused")
					String uname=username;
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	


	@SuppressWarnings("static-access")
	public user(String username) {
		// TODO Auto-generated constructor stub
		initialize();
		this.username=username;
		System.out.println(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 803, 462);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 803, 462);
		getFrame().getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 804, 42);
		panel.add(panel_1);
		
		JLabel lblUserPanel = new JLabel("USER PANEL");
		lblUserPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserPanel.setForeground(Color.WHITE);
		lblUserPanel.setFont(new Font("BLACK CAPS", Font.BOLD, 12));
		lblUserPanel.setBounds(0, 11, 142, 20);
		panel_1.add(lblUserPanel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 40, 804, 422);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(255, 102, 0));
		panel_3.setBounds(0, 0, 179, 398);
		panel_2.add(panel_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(user.class.getResource("/soft/NETCARE white.png")));
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 0, 179, 77);
		panel_3.add(label_1);
		
		JButton buttonhme = new JButton("Home");
		
		buttonhme.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonhme.setBackground(new Color(255, 102, 0));
		buttonhme.setBounds(0, 81, 179, 34);
		panel_3.add(buttonhme);
		
		JButton btnDeviceRegistration = new JButton("Device Registration");
		
		btnDeviceRegistration.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeviceRegistration.setBackground(new Color(255, 102, 0));
		btnDeviceRegistration.setBounds(0, 113, 179, 34);
		panel_3.add(btnDeviceRegistration);
		
		JButton btnStatus = new JButton("Status");
		
		btnStatus.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnStatus.setBackground(new Color(255, 102, 0));
		btnStatus.setBounds(0, 146, 179, 34);
		panel_3.add(btnStatus);
		
		JButton btnlogout = new JButton("Logout");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				home logout=new home();
				logout.loginframe.setVisible(true);
				frame.dispose();
				
			}
		});
		btnlogout.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnlogout.setBackground(new Color(255, 102, 0));
		btnlogout.setBounds(0, 179, 179, 34);
		panel_3.add(btnlogout);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(178, 0, 622, 398);
		panel_2.add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JPanel homepane = new JPanel();
		homepane.setBackground(Color.WHITE);
		panel_4.add(homepane, "name_33393914163268");
		homepane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(user.class.getResource("/soft/net.gif")));
		lblNewLabel.setBounds(0, 0, 622, 387);
		homepane.add(lblNewLabel);
		
		JPanel devreg = new JPanel();
		devreg.setBackground(Color.WHITE);
		panel_4.add(devreg);
		devreg.setLayout(null);
		
		JLabel lblDeviceRegistration = new JLabel("DEVICE REGISTRATION");
		lblDeviceRegistration.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeviceRegistration.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		lblDeviceRegistration.setBounds(174, 11, 258, 34);
		devreg.add(lblDeviceRegistration);
		
		JLabel lblDeviceName = new JLabel("DEVICE NAME");
		lblDeviceName.setBounds(152, 72, 96, 14);
		devreg.add(lblDeviceName);
		
		devname = new JTextField();
		devname.setColumns(10);
		devname.setBounds(278, 66, 179, 20);
		devreg.add(devname);
		
		JLabel lblDeviceType = new JLabel("DEVICE TYPE");
		lblDeviceType.setBounds(152, 110, 96, 14);
		devreg.add(lblDeviceType);
		
		devtype = new JTextField();
		devtype.setColumns(10);
		devtype.setBounds(278, 104, 179, 20);
		devreg.add(devtype);
		
		
		//////
                InetAddress ip3;
    try {
            
        ip3 = InetAddress.getLocalHost();
        ipn= ip3.getHostAddress();
        
        NetworkInterface network = NetworkInterface.getByInetAddress(ip3);
            
        byte[] mac = network.getHardwareAddress();
            
        System.out.print("Current MAC address : ");
            
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
        }
        macn=sb.toString();
            
    } catch (Exception e) {
        
        e.printStackTrace();
        
    } 
       JLabel lblIpAddress = new JLabel("IP ADDRESS");
		lblIpAddress.setBounds(152, 150, 96, 14);
		devreg.add(lblIpAddress);
		
		ip = new JTextField();
		ip.setColumns(10);
		ip.setBounds(278, 144, 179, 20);
		devreg.add(ip);
		
		JLabel lblMacAddress = new JLabel("MAC ADDRESS");
		lblMacAddress.setBounds(152, 192, 116, 14);
		devreg.add(lblMacAddress);
		
		mac = new JTextField();
		mac.setColumns(10);
		mac.setBounds(278, 186, 179, 20);
		devreg.add(mac);
		ip.setText(ipn);
				mac.setText(macn);         
                /////
		
		
		JButton button_1 = new JButton("SUBMIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				MysqlCon db=new MysqlCon();
				Connection con=null;
				Statement smt=null;
				
				String devicename=devname.getText();
				String devicetype=devtype.getText();
				String deviceip=ip.getText();
				String devicemac=mac.getText();
				
				try
				{
					con=db.conneCtion();
				
			String sql="INSERT INTO devreg(name,email,contact,username,designation,department)SELECT name,email,contact,username,designation,department FROM signin WHERE username='"+username+"'";
			
                        String sqli="SELECT id FROM devreg order by id desc LIMIT 1 ";
                       
                        
			smt=con.createStatement();
	                      @SuppressWarnings("unused")
						int i=smt.executeUpdate(sql);
                              
                              PreparedStatement ps = con.prepareStatement(sqli);
				ResultSet rs = ps.executeQuery();
                                try  {
                                    if(rs.next())
				{
				 
				id=rs.getString("id");
                                } 
                                } 
                                catch (Exception e){
                                    
                                }
                              
                                                   String sql1="UPDATE devreg SET devname='"+devicename+"',devtype='"+devicetype+"',ipadd='"+deviceip+"',macadd='"+devicemac+"', status='0' WHERE id='"+id+"' ";              
   
                              
	                      @SuppressWarnings("unused")
						int i1=smt.executeUpdate(sql1);
	                      
	                    devname.setText(null);
	      				devtype.setText(null);
	      				ip.setText(null);
	      				mac.setText(null);
	      				
	                        
	                        }
	                    catch(Exception ex)
				{
					System.out.println(ex);
				}
				
			}
		});
		
		button_1.setBounds(225, 242, 89, 23);
		devreg.add(button_1);
		
		JButton button_2 = new JButton("RESET");
		
		button_2.setBounds(343, 242, 89, 23);
		devreg.add(button_2);
		
		JPanel homepanemain = new JPanel();
		homepanemain.setLayout(null);
		homepanemain.setBackground(Color.WHITE);
		panel_4.add(homepanemain, "name_67598673005175");
		
		JLabel label = new JLabel("USER DETAILS");
		label.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		label.setBounds(243, 11, 157, 33);
		homepanemain.add(label);
		
		JLabel label_2 = new JLabel("Name :");
		label_2.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_2.setBounds(147, 99, 63, 23);
		homepanemain.add(label_2);
		
		JLabel label_3 = new JLabel("Email :");
		label_3.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_3.setBounds(147, 143, 63, 23);
		homepanemain.add(label_3);
		
		JLabel label_4 = new JLabel("Username :");
		label_4.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_4.setBounds(147, 185, 86, 23);
		homepanemain.add(label_4);
		
		JLabel label_5 = new JLabel("Designation :");
		label_5.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_5.setBounds(147, 233, 86, 23);
		homepanemain.add(label_5);
		
		JLabel label_6 = new JLabel("Department :");
		label_6.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_6.setBounds(147, 279, 86, 23);
		homepanemain.add(label_6);
		
		JLabel name_lbl = new JLabel("");
		name_lbl.setBounds(328, 99, 211, 14);
		homepanemain.add(name_lbl);
		
		JLabel email_lbl = new JLabel("");
		email_lbl.setBounds(328, 147, 211, 14);
		homepanemain.add(email_lbl);
		
		JLabel uname_lbl = new JLabel("");
		uname_lbl.setBounds(328, 189, 211, 14);
		homepanemain.add(uname_lbl);
		
		JLabel desig_lbl = new JLabel("");
		desig_lbl.setBounds(328, 237, 211, 14);
		homepanemain.add(desig_lbl);
		
		JLabel dept_lbl = new JLabel("");
		dept_lbl.setBounds(328, 283, 211, 14);
		homepanemain.add(dept_lbl);
		
		JPanel status = new JPanel();
		panel_4.add(status);
		status.setLayout(null);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		lblStatus.setBounds(241, 11, 99, 23);
		status.add(lblStatus);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 602, 339);
		status.add(scrollPane);
		
		table_1 = new JTable();
		DefaultTableModel tbl = new DefaultTableModel(0,0);
		table_1.setModel(tbl);
		
		tbl.addColumn("Sl No.");
		tbl.addColumn("Device Name");
		tbl.addColumn("Device Type");
		tbl.addColumn("Ip Address");
		tbl.addColumn("Mac Address");
		tbl.addColumn("Status");
		Object rowtbl[] = new Object[12];
		scrollPane.setViewportView(table_1);
		
		
		btnDeviceRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
			panel_4.removeAll();
				panel_4.repaint();
				panel_4.revalidate();
				panel_4.add(devreg);
				panel_4.repaint();
				panel_4.revalidate();
				
				
			}
		});
		
		
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				panel_4.removeAll();
				panel_4.repaint();
				panel_4.revalidate();
				panel_4.add(status);
				panel_4.repaint();
				panel_4.revalidate();
				
				tbl.getDataVector().removeAllElements();
				tbl.fireTableDataChanged();
				
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from devreg where username='"+username+"'  ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				int slno=0;
				while(rs.next())
				{
				slno = slno+1;
				String devnme = rs.getString("devname");
				String devtyp = rs.getString("devtype");
				String ipad = rs.getString("ipadd");
				String macad = rs.getString("macadd");
				String stat = rs.getString("status");
				
				
				if(stat.equals("0")){
					
				rowtbl[0]=slno;
				rowtbl[1]=devnme;
				rowtbl[2]=devtyp;
				rowtbl[3]=ipad;
				rowtbl[4]=macad;
				rowtbl[5]="Pending";
				}
				if(stat.equals("1")){
					
					rowtbl[0]=slno;
					rowtbl[1]=devnme;
					rowtbl[2]=devtyp;
					rowtbl[3]=ipad;
					rowtbl[4]=macad;
					rowtbl[5]="Accepted";
					}
				if(stat.equals("2")){
					
					rowtbl[0]=slno;
					rowtbl[1]=devnme;
					rowtbl[2]=devtyp;
					rowtbl[3]=ipad;
					rowtbl[4]=macad;
					rowtbl[5]="Rejected";
					}
				
				tbl.addRow(rowtbl);
				scrollPane.setViewportView(table_1);
				
				
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		buttonhme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				panel_4.removeAll();
				panel_4.repaint();
				panel_4.revalidate();
				panel_4.add(homepanemain);
				panel_4.repaint();
				panel_4.revalidate();
				
				
				
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from signin where username='"+username+"' ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				@SuppressWarnings("unused")
				int slno=0;
				while(rs.next())
				{
				//slno = slno+1;
				/*
				String devnme = rs.getString("devname");
				String devtyp = rs.getString("devtype");
				String ipad = rs.getString("ipadd");
				String macad = rs.getString("macadd");
				String stat = rs.getString("status");
				*/
				
					name_lbl.setText(rs.getString("name"));
					email_lbl.setText(rs.getString("email"));
					uname_lbl.setText(rs.getString("username"));
					dept_lbl.setText(rs.getString("department"));
					desig_lbl.setText(rs.getString("designation"));
						
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
			
			}
		});
		
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				devname.setText(null);
				devtype.setText(null);
				ip.setText(null);
				mac.setText(null);
				
			}
		});
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
