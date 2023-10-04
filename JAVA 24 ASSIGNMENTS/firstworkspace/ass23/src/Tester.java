import java.awt.*;

class MovingCircles extends Frame implements Runnable{
	private int x1,x2,x3; 		//xaxis var move honar ahe circle so variable ghetle
	private Thread t1,t2,t3;	//3 object ahet mhnun 3 thread ghetle
	
	public MovingCircles() {
		x1=x2=x3=100;
		t1=new Thread(this,"red");
		t2=new Thread(this,"yellow");
		t3=new Thread(this,"blue");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void paint(Graphics g) {			//circles design kele ithe
		setTitle("Moving Circles");
		setBackground(Color.gray);
		g.setColor(Color.RED);
		g.fillOval(x1, 100, 100, 100);
		g.setColor(Color.yellow);
		g.fillOval(x2, 250, 100, 100);
		g.setColor(Color.blue);
		g.fillOval(x3, 400, 100, 100);
	}
	
	/*main method run houn MovingCircles constructor 
	 madhe jael nantr tyat start ahe tr run method lagel*/
	public void run() {				
		while(true)
		{
			if(Thread.currentThread()==t1)	//t1 thread sathi
			{
				synchronized (this) 
				{
					x1++;
					if(x1==this.getWidth()-100) 
					{
						try 
						{
							wait();
						}
						catch (Exception e)
						{
							
						}
					}
				}
				try {
					Thread.sleep(30);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			else if(Thread.currentThread()==t2)   //t2 thread sathi
			{
				synchronized (this) 
				{
					x2++;
					if(x2==this.getWidth()-100) 
					{
						try 
						{
							wait();				//wait use kela bcz ek circle pohchla ki dusrya sathi thammbel
						}
						catch (Exception e)
						{
							
						}
					}
				}
				try {
					Thread.sleep(40);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			else if(Thread.currentThread()==t3)		//t3 thread sathi
			{
				synchronized (this) 				//wait() ahe mhnun synchronizes use kela nahitr exception yet
				{
					x3++;
					if(x3==this.getWidth()-100) 
					{
						x1=x2=x3=0;
						notifyAll();
					}
				}
				try {
					Thread.sleep(60);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			repaint();
		}
	}
}
public class Tester {

	public static void main(String[] args) {
		MovingCircles mc = new MovingCircles();
		mc.setSize(600,600);
		mc.setVisible(true);
	}

}
