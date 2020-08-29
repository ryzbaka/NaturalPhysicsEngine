let volume;
let h;
let w;
class PerlinWalker{
  constructor(){
   this.r = random(0,255);
   this.g = random(0,255);
   this.b = random(0,255);
   this.t = random(0,100);
  this.xPos = null;
    this.yPos = null;
  }
  show(){
    stroke('white');
    this.xPos = map(noise(this.t),0,1,0,w)
    this.yPos = map(noise(this.t,this.t),0,1,0,h);
    this.t+=mic.getLevel()/10;
    const walkerSize = map(volume,0,0.3,0,150);
    fill(this.r,this.g,this.b,200);
    strokeWeight(5);
    noStroke();
    ellipse(this.xPos,this.yPos,walkerSize,walkerSize);
  }
}

let walkers=[];
const numWalkers = 20;
let mic;
function setup(){
  h = windowHeight;
  w = windowWidth;
  createCanvas(w,h)
  for(let i=0;i<numWalkers;i++){
    walkers.push(new PerlinWalker());
  }
  mic = new p5.AudioIn();
  mic.start()
  background(0);
}
function draw(){
  volume = mic.getLevel();
  let micVal = map(volume,0,0.4,0,255);
  //console.log(mic.getLevel())
  fill(micVal,20);
  rect(0,0,w,h)
  walkers.forEach(function(item){item.show()})
}
