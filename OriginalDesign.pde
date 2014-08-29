
void setup() {
	size(300,350);
	background(255);
}

void draw() {
  racket();
  strings();
  frame();
  grip();
}

void racket() {
	fill(173,255,47);
	strokeWeight(1);
	ellipse(150,140,170,200);
}

void strings()
{
	strokeWeight(2);
	stroke(255);
	int y =60;
	while(y < 230)
	{
		line(50, y, 250, y);
		y = y + 10;
	}
	int  x=80;
	while(x < 230)
	{
		line(x, 30, x, 230);
		x = x + 10;
	}
	
}

void frame(){
	noFill();
	strokeWeight(8);
	stroke(10);
	ellipse(150,140,170,200);
}

void grip() {
	stroke(51);
	strokeWeight(20);
  	line(150,250,150,350);
}