
public class TextBox extends GUIelement {
 private boolean inp;
 public TextBox(double xc, double yc, double hw,double hh, String txt, boolean inp) {
  super(xc,yc,hw,hh,txt,false);
  this.inp = inp;
  // TODO Auto-generated constructor stub
 }
 public void draw(){
   super.draw();
  StdDraw.textLeft(xCentre-halfWidth+0.01, yCentre, text);
 }
 public boolean handleClick(double x,double y){
  if(super.handleClick(x,y)) {//The superclass method is always used first.
   if (inp){
    highlighted = true; 
    displayText(text = "");
   }
  }//else
  else{
    highlighted = false;
  }
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
   if(c!='\n'){
    text += ""+c;
    displayText(text);
    
   }
   else{
    highlighted = false;
   }
//   double i = TestA3Q1.LEFT;
//   for(int i  = 0 ; i< num; i++){
//     if(TestA3Q1.allElements.get(i) instanceof TextBox)
//       TestA3Q1.allElements.get(i).highlighted = false;
//   }
   return true;
  }
  else{
      return false;
  }
 }
}
