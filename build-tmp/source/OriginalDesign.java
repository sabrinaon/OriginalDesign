import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup() 
{
	size(300,350);
	background(255);
}
public void draw() 
{
  racket();
  strings();
  frame();
  grip();
}
public void racket() 
{
	fill(173,255,47);
	strokeWeight(1);
	ellipse(150,140,170,200);
}
public void strings()
{
	strokeWeight(2);
	stroke(255);
	int y =60;
	while(y < 230)
	{
		line(50, y, 250, y);
		y = y + 10;
	}
	int  x=80;
	while(x < 230)
	{
		line(x, 30, x, 230);
		x = x + 10;
	}
}
public void frame()
{
	noFill();
	strokeWeight(8);
	stroke(10);
	ellipse(150,140,170,200);
}
public void grip() 
{
	stroke(51);
	strokeWeight(20);
  	line(150,250,150,350);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
