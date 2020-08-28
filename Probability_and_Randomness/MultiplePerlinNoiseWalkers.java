//perlin noise random walker
import java.util.ArrayList;
class PerlinWalker{
  float t = random(0,100);
  float xPos;
  float yPos;
  float r;
  float g;
  float b;
  float speed;
  public PerlinWalker(float r,float g,float b,float speed){
    this.r=r;
    this.g=g;
    this.b=b;
    this.speed = speed;
  }
  public void show(){
    this.t+=this.speed;
    this.xPos = map(noise(this.t),0,1,0,width);
    this.yPos = map(noise(this.t,this.t),0,1,0,height);
    fill(this.r,this.g,this.b);
    ellipse(this.xPos,this.yPos,40,40);
  }
}
ArrayList<PerlinWalker> walkers = new ArrayList<PerlinWalker>();
int numWalkers = 100;

void setup(){
  size(1920,1080);
  background(0);
  for(int i=0;i<numWalkers;i++){
    PerlinWalker  walker = new 
PerlinWalker(random(0,255),random(0,255),random(0,255),0.01);
    walkers.add(walker);
  }
}
void draw(){
  background(0);
  for(int i=0;i<numWalkers;i++){
    PerlinWalker walker = walkers.get(i);
    walker.show();
  }
}

