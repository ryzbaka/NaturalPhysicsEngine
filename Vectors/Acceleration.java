/*
   ------------
  ~ACCELERATION~
   ------------
   
   Velocity changes by acceleration over time.
*/
class Mover{
  PVector location;
  PVector velocity;
  PVector acceleration;
  public Mover(){
    this.location = new PVector(width/2,height/2);
    this.velocity = new PVector(0,0);
    this.acceleration = new PVector(0,0);//constant acceleration if this 
is not updated.
  }
  public void move(){
    //this.acceleration = PVector.random2D();//random acceleration.
    //trying to accelerate towards the mouse.
    PVector mouse = new PVector(mouseX,mouseY);
    fill(100,0,0);
    ellipse(mouse.x,mouse.y,10,10);
    //the difference between two locations is the vector that points 
from one location to the other.
    mouse.sub(this.location);//now if I simply use this vector the mover 
will just move to the location
    //what I should do is normalise the mouse vector and scale it to 
some value.
    mouse.setMag(0.5);
    this.acceleration = mouse;//comment this out to get constant 
acceleration
    this.velocity.add(this.acceleration);
    this.velocity.limit(5); //limiting the velocity to 5
    this.location.add(this.velocity);
    if(this.location.x>width){
      this.location.x = 0;
    }
    if(this.location.y>height){
      this.location.y = 0;
    }
    if(this.location.x<0){
      this.location.x = width;
    }
    if(this.location.y<0){
      this.location.y = height;
    }
  }
  public void display(){
    fill(100);
    stroke(0);
    strokeWeight(1);
    ellipse(this.location.x,this.location.y,40,40);
  }
}
Mover m;
void setup(){
  size(640,360);
  m = new Mover();
}
void draw(){
  //background(255);
  m.move();
  m.display();
}
