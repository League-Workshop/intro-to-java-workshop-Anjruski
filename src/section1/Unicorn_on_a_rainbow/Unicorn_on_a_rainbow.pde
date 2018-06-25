PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("rain.png");
  size(512, 512);
  rainbow.resize(512, 512);
  unicorn = loadImage("Unicorn.png");
  unicorn.resize(350, 300);
}
void draw() {
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}