
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

class MyMouse extends JFrame
{
    JButton AC = new JButton("AC Milan");
    JButton Real = new JButton("Real Madrid");
    JLabel Res=new JLabel("Result: 0 X 0");
    JLabel Last=new JLabel("Last Scorer: N/A");
    JLabel Winner=new JLabel("Winner: DRAW");
    public int AC_int=0;
    public int Real_int=0;
    Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
    public class TestActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            AC_int++;
            Res.setText("Result: "+AC_int+" X "+Real_int);
            Last.setText("Last Scorer: AC Milan");
            Winner.setText("Winner: "+((AC_int>Real_int)?"AC Milan":((AC_int==Real_int)?"DRAW":"Real Madrid")));
        }
    }
    public class TestActionListener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Real_int++;
            Res.setText("Result: "+AC_int+" X "+Real_int);
            Last.setText("Last Scorer: Real Madrid");
            Winner.setText("Winner: "+((AC_int>Real_int)?"AC Milan":((AC_int==Real_int)?"DRAW":"Real Madrid")));
        }
    }
    public MyMouse()
    {
        super("results of match");
        setLayout(null);
        setSize(800,400);


        AC.setBounds(50,30,300,50);
        ActionListener actionListener = new TestActionListener();
        AC.addActionListener(actionListener);
        add(AC);

        Real.setBounds(350,30,300,50);
        ActionListener actionListener1 = new TestActionListener1();
        Real.addActionListener(actionListener1);
        add(Real);



        Res.setBounds(180,90,300,50);
        Res.setFont(new Font("Serif", Font.PLAIN, 18));
        Res.setHorizontalAlignment(JLabel.CENTER);
        Res.setBorder(border);
        add(Res);


        Last.setBounds(50,150,300,50);
        Last.setFont(new Font("Serif", Font.PLAIN, 18));
        Last.setHorizontalAlignment(JLabel.CENTER);
        Last.setBorder(border);
        add(Last);


        Winner.setBounds(355,150,290,50);
        Winner.setFont(new Font("Serif", Font.PLAIN, 18));
        Winner.setHorizontalAlignment(JLabel.CENTER);
        Winner.setBorder(border);
        add(Winner);

    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}