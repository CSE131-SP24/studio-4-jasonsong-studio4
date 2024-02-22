package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		double ballX = 0.3;
		double ballY = 0.9;
		double ball2X = 0.3;
		double ball2Y = 0.1;
		double ball3Y = 0.69;
		double ball4Y = 0.66;
		double ball5Y = 0.66;
		double ball6Y = 0.69;
		
		StdDraw.setPenColor(66, 28, 0);
		StdDraw.filledRectangle(0.5, 0.3, .45, .1);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, 0.5, .45, .1);
		StdDraw.setPenColor(173, 218, 254);
		StdDraw.filledRectangle(0.5, 0.7, .45, .1);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.01);
		double a=-6;
		
		while (ballX<0.7) 
		{
		ballY = ballY - 0.002;	
			a=a+0.03; //speedup
			ballX=0.3+0.401/(1+Math.exp(-a));
		
		StdDraw.point(ballY, ballX);
		}
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.01);
		double b=6;
		
		while (b>-a) 
		{
		ball2Y = ball2Y + 0.002;	
			b=b-0.03; //speedup
			ball2X=0.7-0.401/(1+Math.exp(-b));
		StdDraw.point(ball2Y, ball2X);
		}
		
		StdDraw.setPenRadius(0.015);
		int c=0;
		while (ball3Y>0.31) 
		{
			StdDraw.setPenColor(255-c, 0, 0+c);
			ball3Y = ball3Y - 0.00150;
			//draw on canvas
			StdDraw.point(0.2, ball3Y);
			c=c+1;
		}
		
		c=0;
		while (ball4Y>0.341) 
		{
			StdDraw.setPenColor(255-c, 0, 0+c);
			ball4Y = ball4Y - 0.00126;
			//draw on canvas
			StdDraw.point(0.35, ball4Y);
			c=c+1;
		}
		
		c=0;
		while (ball5Y>0.343) 
		{
			StdDraw.setPenColor(c, 0, 255-c);
			ball5Y = ball5Y - 0.00126;
			//draw on canvas
			StdDraw.point(0.65, ball5Y);
			c=c+1;
		}
		
		c=0;
		while (ball6Y>0.31) 
		{
			StdDraw.setPenColor(c, 0, 255-c);
			ball6Y = ball6Y - 0.00150;
			//draw on canvas
			StdDraw.point(0.8, ball6Y);
			c=c+1;
		}
	}
}