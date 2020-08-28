/*
  ----------------
  ~ Perlin Noise ~
  ----------------
  Ken Perlin (professor ar NYU), developed perlin noise for the movie 
Tron.
  It was used for creating procedural graphics for 3D models.
  
  Perlin noise looks very smooth over time when the random numbers 
generated are plotted across time.
  The numbers change slightly over time. This is because a random number 
generated depends on the number before
  it.
  
  noise() -> gives a value between 0 and 1
  map() can help us map it to a different range
  
  The argument going into the noise() function is time.
  Time is basically the random number at a particular moment in time if 
plotted.
  
  So we need to create a variable t as 0 and then increment it with 
every frame to generate the next
  random value.
  So the time value gives us a deterministic perlin noise value.
  
  noise() expect three params x, y and z each specifying a coordinate in 
noise space.
*/

float t=0;
void setup(){
  size(1920,1080);
  //frameRate(10);
}
void draw(){
  //background(0);
  fill(200,0,0);
  float xPos = map(noise(t),0,1,0,width);
  float yPos = map(noise(t,t),0,1,0,height);
  ellipse(xPos,yPos,80,80);
  t+=0.01;
}
