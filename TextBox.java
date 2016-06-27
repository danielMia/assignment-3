
public class TextBox extends GUIelement {
 private boolean inp;
 public TextBox(double xc, double yc, double hw,double hh, String txt, boolean inp) {
  super(xc,yc,hw,hh,txt,false);
  this.inp = inp;
  // TODO Auto-generated constructor stub
 }
 public void draw(){
  super.draw();
//  StdDraw.setPenColor(StdDraw.BLACK);
//  StdDraw.rectangle(xCentre, yCentre, halfWidth, halfHeight);
  StdDraw.textLeft(xCentre-halfWidth+0.01, yCentre, text);
 }
 public boolean handleClick(double x,double y){
  if(super.handleClick(x,y)) {//The superclass method is always used first.
   if (inp){
    highlighted = true; 
    displayText(text = "");
   }
  }//else
  return highlighted; 
 }
 
 
 public void displayText(String s){
//  StdDraw.setPenColor(StdDraw.WHITE);
//  StdDraw.filledRectangle(xCentre, yCentre, halfWidth, halfHeight);
  text = s;
  draw();
 }
 public boolean handleCharTyped(char c){
  if (highlighted){
   if(c=='\n'){
    highlighted = false;
   }
   else{
    text += ""+c;
    draw();
   }
   return true;
  }
  else{
      return false;
  }
 }
}
