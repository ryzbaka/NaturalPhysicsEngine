void setup() {
	size(800,400);
}
float  t= 0;
void draw(){
	loadPixels();
	for(int x=0;x<width;x++){
		for(int y = 0; y<height;y++){
			float bright = random(255);
			pixels[x+y*width] = color(bright,0,0);
		}
	}
	updatePixels();
	float x = map(noise(t),0,1,0,width);
	float y = map(noise(t,t),0,1,0,height);
	float s = map(noise(t,t,t),0,1,20,70);
	ellipse(x,y,s,s);
	t+=0.01;
}