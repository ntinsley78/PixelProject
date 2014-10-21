//#####################################
//DRIVER Class  Created 5-30-2013 - Nick Tinsley - for OOP homework number1


import javax.swing.JOptionPane;

public class Driver 
{

	public static void main(String[] args) throws exceptionList 
	{
		
		
		
		//*********TESTING PIXEL ******************
		
		try
		{
		Pixel p = new Pixel(255,255,255);
						
		JOptionPane.showMessageDialog(null,"Red is  " + p.getRed() );
		JOptionPane.showMessageDialog(null,"Green is  " + p.getGreen() );
		JOptionPane.showMessageDialog(null,"Blue is  " + p.getBlue() );
		p.printHex();
		
		}
		catch (exceptionList so)
		{
			System.out.println("Number is invalid they must be between 0 and 255");
		}
		
		
		
		
		
		//**********TESTING ICON ******************
		//build icon grid of 40x40
		   
		Icon test = new Icon(10,10);
			
		//build pixel colors
		//pixel 1
		test.setRed(0, 0, 255);
		test.setGreen(0,0,0);
		test.setBlue(0, 0, 0);
	
		//pixel 2
		test.setRed(0, 9, 0);
		test.setGreen(0,9,255);
		test.setBlue(0, 9, 0);
		
		//pixel 3
		test.setRed(9, 0, 0);
		test.setGreen(9,0,0);
		test.setBlue(9, 0, 255);
		
		//pixel 4
		test.setRed(9, 9, 0);
		test.setGreen(9,9,0);
		test.setBlue(9, 9, 0);
		
		//pixel 5
		test.setRed(5, 3, 0);
		test.setGreen(5, 3, 0);
		test.setBlue(5,3,0);
		
		
		
		
		//print the pixels to terminal
		test.printIcon();
		test.createBitmap();
		
		
		
		
		
		//*****************TESTING BITMAP CREATOR *****************
		/*
		BitmapCreator test2 = new BitmapCreator(40,40);
		test2.addPixel(0, 0, 111, 111, 111);
		test2.addPixel(0, 1, 111, 111, 111);
		test2.addPixel(0, 2, 111, 111, 111);
		test2.addPixel(0, 3, 255, 111, 111);
		test2.addPixel(0, 4, 0, 111, 111);
		test2.addPixel(0, 5, 111, 111, 111);
		test2.addPixel(0, 6, 111, 111, 111);
		test2.addPixel(0, 7, 125, 111, 255);
		test2.addPixel(0, 8, 111, 111, 111);
		test2.addPixel(0, 9, 111, 111, 111);
		test2.addPixel(0, 10, 111, 111, 111);
		test2.addPixel(1, 11, 111, 111, 111);
		test2.addPixel(1, 12, 111, 111, 111);
		test2.addPixel(1, 13, 111, 111, 111);
		test2.addPixel(1, 14, 111, 111, 111);
		test2.addPixel(1, 15, 111, 111, 111);
		test2.addPixel(1, 16, 111, 111, 111);
		test2.addPixel(1, 17, 111, 111, 111);
		test2.addPixel(1, 18, 111, 111, 111);
		test2.addPixel(1, 19, 111, 111, 111);
		test2.addPixel(1, 20, 111, 111, 111);
		test2.addPixel(2, 21, 111, 111, 111);
				
		
		test2.writeToFile("nick.bmp");
		
		*/
		
		
			
		
	
	}

}
