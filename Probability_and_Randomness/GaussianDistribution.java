/*
    ---------------------
  ~ Gaussian Distribution ~
    ---------------------
  In nature, probability distributions follow a normal distribution i.e. not 
all values in the range
  have an equal probability of existing but it's a bell shaped curve.
  Most values will be centered around the mean.
  Random.nextGaussian()  returns values such that the mean is 0 and the 
standard deviation 1.
  Standard deviation is measure of how much the values are *deviating* from 
the mean.
  To set the mean to 150 we just 150 to every value being returned by the 
Random.nextGaussian() method.
  To set the standard deveiation we just multiply the value returned with 
the desired std dev.

import java.util.Random;
Random generator;
void setup(){
  size(500,1000);
  background(100);
  generator = new Random();
}

void draw(){
  background(100);
  float h = (float)generator.nextGaussian();//generator.nextGaussian returns 
a double
  ellipse(250,250,h*50,h*50);
}
*/
import java.util.Random;

Random gen = new Random();
class Walker{
  float x;
  float y;
  public Walker(float x,float y){
    this.x = x;
    this.y = y;
  }
  public void show(){
    float h = (float)gen.nextGaussian();
    h=h*10;
    h=h+100;
    this.x+=0.25;
    fill(100,0,100);
    ellipse(this.x,this.y,h,h);
  }
}
Walker stephen = new Walker(0,250);
void setup(){
  size(500,500);
  background(100);
}

void draw(){
  stephen.show();
}
