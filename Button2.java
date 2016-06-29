
public class Button2 extends GUIelement {
 private Handler handler;
 public Button2(double xc, double yc, double hw,double hh, String title,Handler handler) {
   super(xc,yc,hw,hh,title,false);
   this.handler = handler;
  // TODO Auto-generated constructor stub
 }
 public void draw(){
  if(highlighted){
   StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
   StdDraw.filledRectangle(xCentre, yCentre, halfWidth, halfHeight);
  }
  else{
   StdDraw.setPenColor(StdDraw.WHITE);
   StdDraw.filledRectangle(xCentre, yCentre, halfWidth, halfHeight);
  }
  StdDraw.setPenColor(StdDraw.BLACK);
  StdDraw.rectangle(xCentre, yCentre, halfWidth, halfHeight);
  StdDraw.text(xCentre, yCentre, text);
 }
 public boolean handleClick(double x,double y){
  
  if(!super.handleClick(x,y)) //The superclass method is always used first.
        return false; //Nothing to do with me. Not in my rectangle.
  else {
      highlighted = true; //Toggle the box's status
      draw(); //And redraw it.
      Utilities.waitMouseUp();
      highlighted = false;
      draw();
      handler.doIt();
      return true; //I handled it. Nobody else should.
  }//else
 }
}
