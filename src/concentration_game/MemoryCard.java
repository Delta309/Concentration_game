package concentration_game;


import java.awt.Color;


public class MemoryCard {
     private String Shapetype;
        private Color color;
        private boolean isUncovered = false;
       /* MemoryCard(String shape, Color newcolor){
            Shapetype= shape;
            color = newcolor;
        } */
        
        public String getShape (){
            return Shapetype;
        }
        public Color getColor (){
            return color;
        }
        public boolean getState() {
            return isUncovered;
        }
        public void setShape (String shape){
            Shapetype = shape;    
        }
        public void setColor (Color newcolor) {
            color = newcolor;
        }
        public void setState (boolean state){
            state = true;
            isUncovered = state;           
        }
        
        @Override
       public String toString(){
           return "Shape: "+getShape()+"/n"+"Color :"+getColor()+"\n"+ "State: "+getState();
       }
}
