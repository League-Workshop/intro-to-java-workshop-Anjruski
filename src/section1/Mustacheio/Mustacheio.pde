PImage mustache;
PImage friend;
void setup () {
  friend = loadImage ("Way.jpg");
  size (630, 630);
  friend.resize(630, 630);
  mustache = loadImage ("Mustache.png");
}

void draw () {
  background(friend);if(mousePressed)
  image(mustache, mouseX-200, mouseY-90);
}