import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo {
	private JLabel label;
	private String names[]={"Ana", "Marija", "Bob",
							"Danijel", "Uros", "Sabina",
							"Milisav", "Timotije", "Iva",
							"Slavisa", "Majkl", "Antony",
							"Gordan", "Ivana", "Fonseka"};
	
	//constructor
	public ListDemo(){
		JFrame frame=new JFrame("JList App");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		
		JList<String> list =new JList<>(names);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {	
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int index;
				int indices[];
				if((index=list.getSelectedIndex())!=-1){
					//label.setText("Selected: " + names[index]);
					//label.setText("Selected: " + list.getSelectedValue());
					indices=list.getSelectedIndices();
					String s="";
					for(int i=0; i<indices.length; i++)
						s+=" " + names[indices[i]];
					label.setText(s);		
				}
				else
					label.setText("Please select one item");
			}
		});
		
		JScrollPane scroll=new JScrollPane(list);
		scroll.setPreferredSize(new Dimension(150, 200));
		frame.add(scroll);
		
		label=new JLabel("Please select one item");
		frame.add(label);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ListDemo();
			}
		});
	}

}
