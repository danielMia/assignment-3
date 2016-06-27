
import java.util.ArrayList;
public class GUIgroup extends GUIelement{
 protected ArrayList<GUIelement> list;
 public GUIgroup() {
  list = new ArrayList<GUIelement>();
  // TODO Auto-generated constructor stub
 }
 public void addElement(GUIelement e){
  list.add(e);
 }
 public void draw(){
  int num = list.size();
  for(int i = 0;i < num; i++){
   list.get(i).draw();
  }
 }
 public boolean handleClick(double x, double y){
  int num = list.size();
  for(int i = 0;i < num; i++){
   if(list.get(i).handleClick(x,y) == true){
    return true;
   }
  }
  return false;
 }
 
 public boolean handleCharTyped(char c){
  int num = list.size();
  for(int i = 0;i < num; i++){
   if(list.get(i).handleCharTyped(c) == true){
    return true;
   }
  }
  return false;
 }
 
 public void resetRadioButtons(){
  int num = list.size();
  for(int i = 0;i < num; i++){
   if (list.get(i) instanceof RadioButton){
    ((RadioButton) list.get(i)).reset();
   }
  }
  
 }
}
