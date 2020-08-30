/*
    ------------------------------
  ~ PUSHING AND POPPING THE MATRIX ~
    ------------------------------
    Any canvas transformations like rotate and translate done between a 
pushMatrix 
    popMatrix is executed and then the canvas is reset to its original 
form.
    
    In the resulatant sketch the green square is our starting point.
    Then we translate the canvas to 100,100.
    Thats when you get the blue square at 0,0.
    Then we rotate by 45 degrees and then plot another rectangle
    and we get the red square.
*/

void setup(){
  //rectMode(CENTER);//sets anchorpoint to center for the rectangle
  size(600,600);
  pushMatrix();
  fill(0,200,0);
  rect(0,0,100,100);
  translate(100,100);
  fill(0,0,200);
  rect(0,0,100,100);
  rotate(radians(45));
  fill(200,0,0,80);
  rect(0,0,100,100);
  popMatrix();
}
