/* ------------------------------------
  ~INTRODUCTION TO VECTORS WITH PVECTOR~
   ------------------------------------
   
   A vector consists of magnitude and direction.
   PVector is a class in Processing whose object is a vector.
   
   PVector stores the components of a vector.
   The components are x, y and z.   
    
   Instead of having a separate x and y we can have:
   PVector location = new PVector(100,50);
*/

class Ball{
  PVector location;
  PVector velocity;
  public Ball(){
    this.location = new PVector(width/2,height/2);
    this.velocity = new PVector(2.5,-2);
  }
  public void move(){
    this.location.add(this.velocity); //add the x of velocity to x of 
location and the same for y.
  }
  public void bounce(){
    if((this.location.x>width) ||(this.location.x<0)){
      this.velocity.x*=-1;  //flipping the direction
    }
    if((this.location.y>height) ||(this.location.y<0)){
      this.velocity.y*=-1;  //flipping the direction
    }
  }
  public void display(){
    stroke(0);
    strokeWeight(2);
    fill(127);
    ellipse(this.location.x,this.location.y,48,48);
  }
}
Ball b;
void setup(){
  size(400,300);
  b = new Ball();
}

void draw(){
  background(255);
  b.move();
  b.bounce();
  b.display();
}
