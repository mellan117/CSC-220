/** Adam Mellan */
/** CSC220-02   */
/** Lab 1       */
/** Recreation of the title of a cartoon */
/** Link to picture: http://img3.wikia.nocookie.net/__cb20130809184248/mugen/images/7/75/One_Piece_Logo.png  */

// Color Variables
color lightBlue = color(51,187,232);
color red = color(255,0,0);
color yellow = color(245,226,22);
color black = color(0,0,0);
color white = color(255,255,255);

// Canvas Setup
size (700,500);
fill(white);
rect(0,0,1000,500);

// Letter "O" in "ONE PIECE"
fill(lightBlue);
ellipse(75,250,100,100);
  // Hat
fill(yellow);
ellipse(75,250,75,75);
ellipse(75,250,100,10);
fill(red);
ellipse(75,245,75,3);
  // Skull Mouth
fill(white);
ellipse(75,290,40,40);
arc(75,290,40,20,0,PI);
arc(75,284,40,20,0,PI);
strokeWeight(2);
line(65,285,65,298);
line(75,285,75,300);
line(85,285,85,298);
strokeWeight(1);
  // Skull Face
arc(75,250,75,75,0,PI);
fill(black);
ellipse(60,260,15,15);
ellipse(90,260,15,15);
ellipse(75,275,5,5);

// Letter "N" in "ONE PIECE"
fill(lightBlue);
beginShape();
vertex(130,300);
vertex(130,200);
vertex(145,200);
vertex(165,250);
vertex(165,200);
vertex(180,200);
vertex(180,300);
vertex(165,300);
vertex(145,250);
vertex(145,300);
vertex(130,300);
endShape(CLOSE);

// Letter "E" in "ONE PIECE"
fill(lightBlue);
rect(185,200,15,100);
rect(200,200,40,15);
noStroke();
rect(186,201,39,14);
stroke(black);
rect(200,245,30,10);
noStroke();
rect(186,246,29,9);
stroke(black);
rect(200,285,40,15);
noStroke();
rect(186,286,39,14);
stroke(black);

// Letter "P" in ONE "PIECE"
fill(lightBlue);
rect(300,200,15,100);
arc(316,235,50,70,3*PI/2,5*PI/2);
noStroke();
rect(310,201,10,68);
stroke(black);
fill(white);
arc(316,235,30,35,3*PI/2,5*PI/2);
line(316,218,316,252);

// Letter "I" in ONE "PIECE"
  // Head of figure
fill(red);
ellipse(380,210,25,25);
ellipse(380,208,45,5);
noStroke();
ellipse(380,210,23,23);
stroke(black);
  // Arms of figure
ellipse(380,243,40,40);
fill(white);
arc(372,243,10,20,PI/2,3*PI/2);
line(372,233,372,253);
arc(388,243,10,20,3*PI/2,5*PI/2);
line(388,233,388,253);
  // Hands and shorts of figure
fill(red);
triangle(365,265,380,250,395,265);
triangle(365,270,380,255,395,270);
triangle(368,283,380,255,391,283);
  // Legs of figure
stroke(red);
strokeWeight(5);
line(365,315,378,290);
line(395,315,382,290);
strokeWeight(1);
  // Body of figure
noStroke();
rect(374,210,12,85);
stroke(black);

// Letter 2nd "E" in ONE "PIECE"
fill(lightBlue);
rect(415,200,15,100);
rect(430,200,40,15);
noStroke();
rect(416,201,39,14);
stroke(black);
rect(430,245,30,10);
noStroke();
rect(416,246,29,9);
stroke(black);
rect(430,285,40,15);
noStroke();
rect(416,286,39,14);
stroke(black);

// Letter "C" in "ONE PIECE"
ellipse(510,250,50,105);
fill(white);
ellipse(510,250,25,75);
noStroke();
rect(510,230,30,40);
stroke(black);

// Letter 3rd "E" in "ONE PIECE"
fill(lightBlue);
arc(600,250,100,115,PI/2,3*PI/2);
fill(white);
arc(600,250,75,100,PI/2,3*PI/2);
fill(lightBlue);
  // Triangular points of the "E"
triangle(595,185,620,195,597,205);
triangle(595,313,620,305,597,293);
noStroke();
rect(595,193,5,7);
rect(595,301,5,6);
stroke(black);
  // Middle part of the "E"
rect(585,235,5,30);
ellipse(610,250,25,25);
rect(562,245,37,10);
noStroke();
rect(558,247,43,8);
rect(586,236,4,29);
stroke(black);
fill(white);
ellipse(610,250,15,15);

// Upper line above words
noFill();
stroke(lightBlue);
strokeWeight(10);
line(25,175,625,175);

// Lower line below words
line(25,325,625,325);