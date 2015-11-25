/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento.view;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author flavio
 */
public class MainView extends JFrame {
    
    public JPanel mainPanel;
    private CardLayout layout;
    
    public MainView()
    {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        layout = new CardLayout();
        
        mainPanel = new JPanel(layout);
        add(mainPanel);
        setVisible(true);
    }
    
    public void swapPanel(JPanel panel)
    {
        layout.show(mainPanel, panel.getClass().getName());
    }
    
    public void addPanel(JPanel panel)
    {
        mainPanel.add(panel, panel.getClass().getName());
        setVisible(true);
    }
}
