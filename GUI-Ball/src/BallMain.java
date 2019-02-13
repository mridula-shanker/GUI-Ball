import javax.swing.JFrame;

public class BallMain 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(100,100,600,600);//X,Y,Width,Height
		
		Ball myBall=new Ball();
		myBall.setBounds(30,30,100,100);
		myFrame.add(myBall);

	}

}
