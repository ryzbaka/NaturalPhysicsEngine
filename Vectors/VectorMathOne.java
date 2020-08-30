/* --------------
  ~PVECTOR MATH~
   --------------   
   add() -> Vector addition. Putting them end to end.   
   sub() -> Subtraction works by just adding the negative of the vector
   mult() -> Vector to scalar multiplication. Used for scaling vectors.
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
  line(0,0,mouse.x,mouse.y);
}
