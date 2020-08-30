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

public class noiseTwoDim extends PApplet {

public void setup() {
	
}
float  t= 0;
public void draw(){
	loadPixels();
	for(int x=0;x<width;x++){
		for(int y = 0; y<height;y++){
			float bright = random(255);
			pixels[x+y*width] = color(bright,0,0);
		}
	}
	updatePixels();
	float x = map(noise(t),0,1,0,width);
	float y = map(noise(t,t),0,1,0,height);
	float s = map(noise(t,t,t),0,1,20,70);
	ellipse(x,y,s,s);
	t+=0.01f;
}
  public void settings() { 	size(800,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "noiseTwoDim" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
