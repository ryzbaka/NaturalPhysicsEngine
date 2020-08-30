void setup(){
  rectMode(CENTER);//sets anchorpoint to center for the rectangle
  size(600,600);
}
float r=0;
float t=0;
void draw(){
  background(0,20);
  r+=1;
  for(int i=1;i<6;i++){
    if(r%2==0){
      continue;
    }
    t+=0.01;
    pushMatrix();
    translate(i*100,height/2);
    rotate(radians(r));
    fill(255);
    float rectSize = map(noise(t),0,1,10,100);
    rect(0,0,rectSize,rectSize);
    popMatrix();
  }
  //ellipse(width/2,height/2,10,10);
  ellipse(random(0,width),random(0,height),5,5);
}
