import hype.*;
import hype.extended.colorist.HColorPool;
import hype.extended.behavior.HRotate;

HShape mandala;
HColorPool colors;
HRotate rotor;
void setup(){
  H.init(this).background(#666666).autoClear(false);
  size(1920,1080);
  colors = new HColorPool(#FFFFFF,#F7F7F7,#FF6600,#333333,#0095a8,#FF3300);
  for(int i=0;i<50;i++){
    mandala = new HShape("vectors.svg");
    mandala.enableStyle(false).stroke(#111111).strokeJoin(ROUND).strokeCap(ROUND).rotation((int)random(360))
           .size((int)random(200,500)).loc((int)random(width),(int)random(height))
           .anchorAt(H.CENTER);
    mandala.randomColors(colors.fillOnly());
    //rotor = new HRotate().target(mandala).speed(10);
    H.add(mandala);
  }
    H.drawStage();
}
void draw(){
  H.drawStage();
}
