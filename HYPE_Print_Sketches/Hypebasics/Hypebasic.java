import hype.*;
import hype.extended.behavior.HRotate;//not included in hype base library

HRect d1;//drawable rectangle
void setup(){
  size(600,600);
  H.init(this).background(#666666).autoClear(false);//autoClear is true by default and it clears the background
  d1 = new HRect();
  d1.size(50).rotation(45).anchor(15,-15).loc(100,height/2).fill(#00FFFF);//or anchorAt(H.CENTER)
  HRotate r1 = new HRotate().target(d1).speed(1); 
  H.add(d1);
  H.drawStage();
}
void draw(){
  //d1.fill(color(random(200),random(200),random(200)));
  H.drawStage();
}
