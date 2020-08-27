/*
Every number in the range of the random() function has an equal probability of ocurring.
*/
import java.util.ArrayList;
class RandomWalker{
  float x;
  float y;
  float r=100;
  float g=100;
  float b=100;
  public RandomWalker(float x,float y){
    this.x = x;
    this.y = y;
  }
  public RandomWalker(float x,float y, float r, float g, float b){
    this.r = r;
    this.g = g;
    this.b = b;
    this.x = x;
    this.y = y;
  }
  public void show(){
    fill(this.r,this.g,this.b);
    //update this.x and this.y randomly
    this.x+=random(-4,4);
    this.y+=random(-4,4);
    ellipse(this.x,this.y,50,50);
  }
}
int sizeX = 500;
int sizeY = 500;
ArrayList<RandomWalker> walkers = new ArrayList<RandomWalker>();
int numWalkers = 5;
void setup(){
  size(500,500);
  background(40);
  for(int i=0;i<numWalkers;i++){
    RandomWalker someWalker = new 
RandomWalker(sizeX/2,sizeY/2,random(0,255),random(0,255),random(0,255));
    walkers.add(someWalker);
  }
}
void draw(){
  for(int i=0;i<numWalkers;i++){
     RandomWalker x = walkers.get(i);
     x.show();
  }
}
