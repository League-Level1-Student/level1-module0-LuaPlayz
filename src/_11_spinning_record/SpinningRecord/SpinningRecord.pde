  PImage pictureOfRecord;      
  int imageangle=0;
    import ddf.minim.*;      
      Minim minim;     
        AudioPlayer song;     
void setup(){
              
        size(600,600);                             
        pictureOfRecord= loadImage("record.png");     
       
         pictureOfRecord.resize(height,width);    
         
  minim = new Minim(this);  
  song = minim.loadFile("idk.mp3", 512);  
}


void draw(){
 if (mousePressed){
    rotateImage(pictureOfRecord,imageangle);
     image(pictureOfRecord, 0,0);
    imageangle=imageangle+100;
 }
    }
  
       void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
           
 
