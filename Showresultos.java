package soft;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Showresultos extends JFrame {

	private JPanel contentPane;
	static String idsc;
	 static String type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Showresultos frame = new Showresultos(idsc);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("static-access")
	public Showresultos(String idsc2) {
		
		this.idsc=idsc2;
		
		
		DefaultTableModel tble = new DefaultTableModel(0,0);
				
				tble.addColumn("Sl No.");
				tble.addColumn("Port");
				tble.addColumn("Result");
				Object rowtble[] = new Object[3];
				
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(100, 100, 745, 473);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 729, 434);
				contentPane.add(panel);
				panel.setLayout(null);
				
				JButton button = new JButton("Back");
				
				button.setBounds(600, 70, 75, 40);
				contentPane.add(button);
				button.setLayout(null);
				
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						
		            	Showresultos.this.dispose();
						
						
					}
				});
				
				JLabel lblResult = new JLabel("Result");
				lblResult.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
				lblResult.setBounds(332, 11, 82, 24);
				panel.add(lblResult);
				
				JLabel lblScanType = new JLabel("Scan Type :");
				lblScanType.setBounds(28, 70, 75, 14);
				panel.add(lblScanType);
				
				JLabel lblNewLabel = new JLabel("Os detection");
				lblNewLabel.setBounds(107, 70, 219, 14);
				panel.add(lblNewLabel);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(10, 114, 709, 309);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 0, 699, 309);
				panel_1.add(scrollPane);
				
				JTable table = new JTable();
				table.setModel(tble);
				scrollPane.setViewportView(table);
				
				tble.getDataVector().removeAllElements();
				tble.fireTableDataChanged();
				
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from osscan where scanid='"+idsc+"' ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				int slno=0;
				while(rs.next())
				{
				slno = slno+1;
				String ipadd = rs.getString("ipaddress");
				String result = rs.getString("result");
				
				
				
				
					
				rowtble[0]=slno;
				rowtble[1]=ipadd;
				rowtble[2]=result;
				
				
				tble.addRow(rowtble);
				scrollPane.setViewportView(table);
				
				
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
	}

}
