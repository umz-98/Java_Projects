import java.util.concurrent.TimeUnit;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_button extends JFrame implements ActionListener {
  
    int count = 0;
    JLabel welcome;
     
    public GUI_button() {
        
        int width = 30;
        int height = 30;
        int dimension = 20;
        welcome = new JLabel("Numer of times I failed at keeping calm: 0");

       
        JButton button = new JButton("Click");
        button.addActionListener(this);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        add(panel, BorderLayout.CENTER);
        panel.add(button);
        panel.add(welcome);
        pack();
        welcome.setVisible(true);
        setTitle("Hello");
        setSize(width * dimension + 2, height * dimension + 4);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) throws InterruptedException {
    GUI_button v = new GUI_button();

    //System.out.println("Help me");

    //TimeUnit.SECONDS.sleep(5);

    //System.out.println("why mate?");

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        welcome.setText("Numer of times I failed at keeping calm: " + count);
        // TODO Auto-generated method stub
        
    }


}
