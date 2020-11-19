  int y=0;
   int j=0;
void draw(){
     background(250,250,250);
         fill(0,0,50);
    stroke(25,25,25);
    ellipse(250, y, 25, 25);
    y++;
    if (y==500){
               fill(0,0,50);
    stroke(25,25,25);
    ellipse(250, j, 25, 25);
    }
    j++;
    
   
}


void setup (){
     size(500,500);
   
}
