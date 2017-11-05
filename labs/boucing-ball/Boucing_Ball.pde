import java.awt.Shape;
import java.awt.geom.Ellipse2D;

boolean tempBool = false;

void setup(){
  size(500,500);
  background(255);
  //moveBall(50,50);
}
Shape ball = new Ellipse2D.Float(50,50,25,25);
void draw(){
  int randColorR = (int)random(1,255);
  int randColorG = (int)random(1,255);
  int randColorB = (int)random(1,255);
  
  fill(randColorR, randColorG, randColorB);
  
  if (ball.getX() == 50) {
    
  }
}

/*void moveBall(int x, int y){
  int randColorR = (int)random(1,255);
  int randColorG = (int)random(1,255);
  int randColorB = (int)random(1,255);
  
  fill(randColorR, randColorG, randColorB);
  
  ellipse(x,y,25,25);
}*/