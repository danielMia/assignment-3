
public class RadioButton extends GUIelement {
 protected double radius;
 protected GUIgroup group;
 public RadioButton(double xc, double yc, double radius, String title,
            boolean hilite, GUIgroup g) {
  super(xc,yc,radius,radius,title,hilite);
  this.radius = radius;
  this.group = g;
 }
 public void draw(){
  StdDraw.setPenRadius();
  StdDraw.circle(xCentre, yCentre, radius);
  StdDraw.textLeft(xCentre+radius+0.01, yCentre, text);
  if (highlighted == true){
   StdDraw.filledCircle(xCentre, yCentre, radius-0.01);
  }
  else{
   StdDraw.setPenColor(StdDraw.WHITE);
   StdDraw.filledCircle(xCentre, yCentre, radius-0.005);
   StdDraw.setPenColor(StdDraw.BLACK);
  }
 }
 public void reset(){
  highlighted = false;
  draw();
 }
 public boolean handleClick(double x,double y){
  if(!super.handleClick(x,y)) //The superclass method is always used first.
        return false; //Nothing to do with me. Not in my rectangle.
  else {
      group.resetRadioButtons();
      highlighted = !highlighted; //Toggle the box's status
      draw(); //And redraw it.
      return true; //I handled it. Nobody else should.
  }//else
 }

}
