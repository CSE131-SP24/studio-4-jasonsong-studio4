package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String type =in.next();
		// TODO: 1. Read in the number of entities from Scanner
		int red=in.nextInt();
		int green=in.nextInt();
		int blue=in.nextInt();
		boolean filled=in.nextBoolean();
		double N1 = 0;
		double N2 = 0;
		double N3 = 0;
		double N4 = 0;
		double [] xs=new double [3];
		double [] ys=new double [3];
		double [] a=new double [100];
		double [] b=new double [100];
		int n=0;
		int m=0;
		StdDraw.setPenColor(red, green, blue);
		if (type.equals("rectangle"))
		{
		N1= in.nextDouble();
		N2=in.nextDouble();
		N3=in.nextDouble();
		N4=in.nextDouble();
			if (filled)
			{
				StdDraw.filledRectangle(N1, N2, N3, N4);
			}
			else
			{
				StdDraw.rectangle(N1, N2, N3, N4);
			}
		}
		if (type.equals("ellipse"))
		{
				N1= in.nextDouble();
				N2=in.nextDouble();
				N3=in.nextDouble();
				N4=in.nextDouble();
				if (filled)
				{
					StdDraw.filledEllipse(N1, N2, N3, N4);
				}
				else
				{
					StdDraw.ellipse(N1, N2, N3, N4);
				}
		}

		else
		{
			while(in.hasNext())
			{
				a[n]=in.nextDouble();
				b[n]=in.nextDouble();
				n++;
			}
			
			double [] xxs=new double [n];
			double [] yys=new double [n];
			
			while(m<n) 
			{
				xxs[m]=a[m];
				yys[m]=b[m];
				m++;
			}
			if (filled)
			{
				StdDraw.filledPolygon(xxs, yys);
			}
			else
			{
				StdDraw.polygon(xxs, yys);
			}
		}
}}
