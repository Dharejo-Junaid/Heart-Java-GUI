import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class Heart implements MouseInputListener {

    JFrame frame=new JFrame();
    JLabel label[]=new JLabel[25];
    int counter=0; boolean flag=false;

    Heart(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
	frame.setResizable(false);
        frame.setLayout(new GridLayout(5, 5, 10, 10));

        for(int i=0; i<25; i++){
            label[i]=new JLabel();
            label[i].setBackground(Color.BLUE);
            label[i].setOpaque(true);
            // label[i].setText("HELLO");
            label[i].setForeground(Color.WHITE);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setFont(new Font("Ink Free", Font.BOLD, 30));

            label[i].addMouseListener(this);
            frame.add(label[i]);
        }

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for(int i=0; i<25; i++){
            if(e.getSource()==label[i]){

                if(i==1 || i==3 || i==5 || i==7 || i==9 || i==10 || i==14 || i==16 || i==18 || i==22){

                    if(label[i].getBackground()==Color.BLUE){
                        counter++;
                    }

                    label[i].setBackground(Color.RED);

                    if(counter==10){
                        flag=true;
                    }
                }

                else if(flag && e.getSource()==label[11]){
                    label[11].setText("I");
                }

                else if(flag && e.getSource()==label[12]){
                    label[12].setText("Love");
                }

                else if(flag && e.getSource()==label[13]){
                    label[13].setText("You");
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }
    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String args[]) {
	new Heart();
    }
}
