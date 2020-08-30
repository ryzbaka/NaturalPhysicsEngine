/* --------------
  ~PVECTOR MATH 2~
   --------------   
   mag() -> Gives us the magnitude. sqrt((x*x)+(y*y)))
   normalize() -> Take a vector and convert its magnitude to 1.  Divide 
all components by magnitude.
   setMag() ->normalizes the vector and multiplies by the float provided 
to set the magnitude to that value.
 */

void setup(){
  size(500,300);
}
void draw(){
  background(255);
  strokeWeight(2);
  stroke(0);
  translate(width/2,height/2);//translating the whole stage to 
(width/2,height/2)
  ellipse(0,0,4,4);
  PVector mouse = new PVector(mouseX,mouseY);
  PVector center = new PVector(width/2,height/2);
  mouse.sub(center); //to adjust mouse coordinates after the stage has 
been translated to (width/2,height/2)
  mouse.mult(0.1);//scaling the vector to 0.1 times the original.
  //float m = mouse.mag();
  mouse.normalize();//magnitude is now 1.
  mouse.mult(50);// magnitude will always be 50 now
  //rect(0,0,m,m);
  line(0,0,mouse.x,mouse.y);
  
}
