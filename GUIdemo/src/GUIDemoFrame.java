import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUIDemoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDemoFrame frame = new GUIDemoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	
	
	
	  
	  
	  
	  int[] TempArr={29,26,23,30,25,22,27};
	  int[] MoistArr= {30,24,31,26,33,35,34};
	  
	  public int[] getMinMax(int[] array){
	  
		  TreeSet ts=new TreeSet();
		  for(int ele:array) {
				ts.add(ele);
			}
		  int minEle=(int) ts.first();
		  int maxEle=(int) ts.last();	
		  return new int[]{minEle,maxEle};
	  }
	  
	  
	  

	public GUIDemoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Temperature");
		lblNewLabel.setBounds(6, 6, 79, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastHumidity = new JLabel("Moisture");
		lblLastHumidity.setBounds(6, 34, 55, 16);
		contentPane.add(lblLastHumidity);
		
		JLabel minTempLabel = new JLabel("…");
		minTempLabel.setBounds(160, 6, 61, 16);
		contentPane.add(minTempLabel);
		
		JLabel minMoistLabel = new JLabel("…");
		minMoistLabel.setBounds(160, 34, 61, 16);
		contentPane.add(minMoistLabel);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(110, 6, 55, 16);
		contentPane.add(lblMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(233, 6, 79, 16);
		contentPane.add(lblMax);
		
		JLabel maxTempLabel = new JLabel("…");
		maxTempLabel.setBounds(287, 6, 61, 16);
		contentPane.add(maxTempLabel);
		
		JLabel lblMin_1 = new JLabel("Min");
		lblMin_1.setBounds(110, 34, 55, 16);
		contentPane.add(lblMin_1);
		
		JLabel lblMax_1 = new JLabel("Max");
		lblMax_1.setBounds(233, 34, 79, 16);
		contentPane.add(lblMax_1);
		
		JLabel maxMoistLabel = new JLabel("…");
		maxMoistLabel.setBounds(287, 34, 61, 16);
		contentPane.add(maxMoistLabel);
		
		
		JButton RefreshBttn = new JButton("Refresh");
		RefreshBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] Temp=getMinMax(TempArr);
				int[] Moist=getMinMax(MoistArr);
				//Temperature Labels
				minTempLabel.setText(Integer.toString(Temp[0]));
				maxTempLabel.setText(Integer.toString(Temp[1]));
				//Moisture Labels
				minMoistLabel.setText(Integer.toString(Moist[0]));
				maxMoistLabel.setText(Integer.toString(Moist[1]));
				
				
			}
		});
		RefreshBttn.setBounds(6, 509, 117, 29);
		contentPane.add(RefreshBttn);
		
		
	}
}
