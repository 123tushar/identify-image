
package Img;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class game extends Applet implements ActionListener{
Button b[]=new Button[100];
Image img;
public void init() {
	img=getImage(getDocumentBase(),"ch.jpg");
	setLayout(new GridLayout(10,10,0,0));
	for(int i=0;i<100;i++)
	{
		b[i]=new Button(" "+(i+1));
		add(b[i]);
		b[i].addActionListener(this);
	}
}
public void actionPerformed(ActionEvent e)
{
	Button bbButton=(Button)e.getSource();
	bbButton.setVisible(false);
}
public void paint(Graphics g)
{
	g.drawImage(Img, 100, 100, this)
}
}
/*<appletr code=game width=400, height=400></applet>*/
 

