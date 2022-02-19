package concentration_game;
import java.awt.Color;
import java.util.*;
//import drawingpanel.DrawingPanel;
import java.awt.*;
public class Concentration_Game{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //GameBoard gb = new GameBoard();
        //gb.fillBoard();
        playgame pg = new playgame();
        pg.fillBoard();
        System.out.println("Enter Player1 name");
        pg.Player1 = sc.next();
        System.out.println("Enter Player2 name");
        pg.Player2 = sc.next();
      do{  
        do {
            System.out.println("Player 1 Turn");
            System.out.println("Select card number 1");
            int card1 = sc.nextInt();
            System.out.println("Select card number 2");
            int card2 = sc.nextInt();
            System.out.println(pg.player1turn(card1, card2));
            
        } 
        while (pg.playagain == true && !pg.gameBoard.isEmpty());
        
        do {  System.out.println("Player 2 Turn");

            System.out.println("Select card number 1");
            int card1 = sc.nextInt();

            System.out.println("Select card number 2");
            int card2 = sc.nextInt();

            System.out.println(pg.player2turn(card1, card2));
            
        } 
        while (pg.playagain == true && !pg.gameBoard.isEmpty());
      }while (!pg.gameBoard.isEmpty());  
      System.out.println("GAME OVER!!");
      System.out.println(pg.Winner());
            
        }
        
    }
    

class Hashset
{
  static HashSet<MemoryCard> set1 = new HashSet<MemoryCard>(36); 
  static HashSet<MemoryCard> set2 = new HashSet<MemoryCard>(36); 
}
class GameBoard extends Hashset
{
    static Map<Integer, MemoryCard> gameBoard = new TreeMap<Integer, MemoryCard>();
    ArrayList carddeck = new ArrayList<MemoryCard>();
    String square = "Square";
      String triangle = "Triangle";
      String circle = "Circle";

    public void fillBoard()
    {
      MemoryCard bluesquare = new MemoryCard();
      bluesquare.setShape(square);
      bluesquare.setColor(Color.BLUE);
      //bluesquare.setState(true);
      carddeck.add(bluesquare);
     carddeck.add(bluesquare);
      MemoryCard bluecircle = new MemoryCard();
      bluecircle.setShape(circle);
      bluecircle.setColor(Color.BLUE);
      //bluecircle.setState(true);
      carddeck.add(bluecircle);
     carddeck.add(bluecircle);
      MemoryCard bluetriangle = new MemoryCard();
      bluetriangle.setShape(triangle);
      bluetriangle.setColor(Color.BLUE);
      //bluetriangle.setState(true);
      carddeck.add(bluetriangle);
     carddeck.add(bluetriangle);
      MemoryCard redsquare = new MemoryCard();
      redsquare.setShape(square);
      redsquare.setColor(Color.RED);
     // redsquare.setState(true);
      carddeck.add(redsquare);
     carddeck.add(redsquare);
      MemoryCard redcircle = new MemoryCard();
      redcircle.setShape(circle);
      redcircle.setColor(Color.RED);
      //redcircle.setState(true);
      carddeck.add(redcircle);
     carddeck.add(redcircle);
      MemoryCard redtriangle = new MemoryCard();
      redtriangle.setShape(triangle);
      redtriangle.setColor(Color.RED);
      //redtriangle.setState(true);
      carddeck.add(redtriangle);
      carddeck.add(redtriangle);
      MemoryCard yellowsquare = new MemoryCard();
      yellowsquare.setShape(square);
      yellowsquare.setColor(Color.YELLOW);
     // yellowsquare.setState(true);
      carddeck.add(yellowsquare);
      carddeck.add(yellowsquare);
      MemoryCard yellowcircle = new MemoryCard();
      yellowcircle.setShape(circle);
      yellowcircle.setColor(Color.YELLOW);
      //yellowcircle.setState(true);
      carddeck.add(yellowcircle);
      carddeck.add(yellowcircle);
      MemoryCard yellowtriangle = new MemoryCard();
      yellowtriangle.setShape(triangle);
      yellowtriangle.setColor(Color.YELLOW);
      //yellowtriangle.setState(true);
      carddeck.add(yellowtriangle);
      carddeck.add(yellowtriangle);
      MemoryCard greensquare = new MemoryCard();
      greensquare.setShape(square);
      greensquare.setColor(Color.GREEN);
      //greensquare.setState(true);
      carddeck.add(greensquare);
      carddeck.add(greensquare);
      MemoryCard greencircle = new MemoryCard();
      greencircle.setShape(circle);
      greencircle.setColor(Color.GREEN);
      //greencircle.setState(true);
      carddeck.add(greencircle);
      carddeck.add(greencircle);
      MemoryCard greentriangle = new MemoryCard();
      greentriangle.setShape(triangle);
      greentriangle.setColor(Color.GREEN);
      //greentriangle.setState(true);
      carddeck.add(greentriangle);
      carddeck.add(greentriangle);
      MemoryCard orangesquare = new MemoryCard();
      orangesquare.setShape(square);
      orangesquare.setColor(Color.ORANGE);
      //orangesquare.setState(true);
      carddeck.add(orangesquare);
      carddeck.add(orangesquare);
      MemoryCard orangecircle = new MemoryCard();
      orangecircle.setShape(circle);
      orangecircle.setColor(Color.ORANGE);
      //orangecircle.setState(true);
      carddeck.add(orangecircle);
      carddeck.add(orangecircle);
      MemoryCard orangetriangle = new MemoryCard();
      orangetriangle.setShape(triangle);
      orangetriangle.setColor(Color.ORANGE);
      //orangetriangle.setState(true);
      carddeck.add(orangetriangle);
      carddeck.add(orangetriangle);
      MemoryCard pinksquare = new MemoryCard();
      pinksquare.setShape(square);
      pinksquare.setColor(Color.PINK);
      //pinksquare.setState(true);
      carddeck.add(pinksquare);
      carddeck.add(pinksquare);
      MemoryCard pinkcircle = new MemoryCard();
      pinkcircle.setShape(circle);
      pinkcircle.setColor(Color.PINK);
      //pinkcircle.setState(true);
      carddeck.add(pinkcircle);
      carddeck.add(pinkcircle);
      MemoryCard pinktriangle = new MemoryCard();
      pinktriangle.setShape(triangle);
      pinktriangle.setColor(Color.PINK);
      //pinktriangle.setState(true);
      carddeck.add(pinktriangle);
      carddeck.add(pinktriangle);
        Collections.shuffle(carddeck);
    
        for (int i = 0; i < 36; i++) 
        {
        gameBoard.put(i, (MemoryCard)carddeck.get(i));
        }
    
    }
    /*public void drawBoard()
    {
        DrawingPanel panel = new DrawingPanel(600, 600);
        Graphics g = panel.getGraphics();
        panel.setGridLines(true, 100);
       // Collection set= gameBoard.values();
       // Iterator<MemoryCard> it = set.iterator();
       int x= 10;
          int y =80;      
          int a= 10; 
                int b = 50;
                int c =90; 
        //while(it.hasNext()){
          for(int grid = 0; grid < 36; grid++){
           for (int i = 0; i < carddeck.size(); i++) { 
        MemoryCard card = (MemoryCard)carddeck.get(i);
        if (card.getState() == true) {
            
            String shape = card.getShape() ;
            Color shapecolor = card.getColor();
            if(shapecolor == Color.RED) 
            {
                g.setColor(Color.RED);
                if(shape == "Sqaure"){
                    g.drawRect(x, y, 60, 60);
                    if (grid < 6) 
                    {
                     x+=100;   
                    }
                }
                else if (shape == "Triangle") 
                {
                int z[]={a,b,c};
                    int v[]={c,a,c};
                    g.drawPolygon(z,v,3);
                    g.fillPolygon(z,v, 3);
                    x+=100;
                    a+=100;
                    b+=100;
                    c+=100;
                    g.setColor(Color.blue);            
                 }
                else {
                    g.drawOval(x, y, 60, 60);
                
                }}
                else if(shapecolor == Color.BLUE){ 
                g.setColor(Color.BLUE);
                if(shape== "Sqaure"){
                    g.drawRect(x, y, 60, 60);
                }
                else if (shape == "Triangle") 
                {
                int z[]={a,b,c};
                    int v[]={c,a,c};
                    g.drawPolygon(z,v,3);
                    g.fillPolygon(z,v, 3);
                    x+=100;
                    a+=100;
                    b+=100;
                    c+=100;
                    g.setColor(Color.blue);
                 }
                else {
                    g.drawOval(x, y, 60, 60);
                }}
           else if(shapecolor == Color.GREEN){ 
                g.setColor(Color.GREEN);
                if(shape== "Sqaure"){
                    g.drawRect(x, y, 60, 60);
                    g.fillRect(x, y, 60, 60);
                }
                else if (shape == "Triangle") 
                {
                int z[]={a,b,c};
                    int v[]={c,a,c};
                    g.drawPolygon(z,v,3);
                    g.fillPolygon(z,v, 3);
                    x+=100;
                    a+=100;
                    b+=100;
                    c+=100;
                    g.setColor(Color.blue);
                 }
                else {
                    g.drawOval(x, y, 60, 60);
                }}
        else     if(shapecolor == Color.YELLOW){ 
                g.setColor(Color.YELLOW);
                if(shape== "Sqaure"){
                    g.drawRect(x, y, 60, 60);
                }
                else if (shape == "Triangle") 
                {
                int z[]={a,b,c};
                    int v[]={c,a,c};
                    g.drawPolygon(z,v,3);
                    g.fillPolygon(z,v, 3);
                    x+=100;
                    a+=100;
                    b+=100;
                    c+=100;
                    g.setColor(Color.blue);
                 }
                else {
                    g.drawOval(x, y, 60, 60);
                }}
            else  if(shapecolor == Color.ORANGE) {
                g.setColor(Color.ORANGE);
                if(shape== "Sqaure"){
                    g.drawRect(x, y, 60, 60);
                    g.fillRect(x, y, 60, 60);
                    
                }
                else if (shape == "Triangle") 
                {
                int z[]={a,b,c};
                    int v[]={c,a,c};
                    g.drawPolygon(z,v,3);
                    g.fillPolygon(z,v, 3);
                    x+=100;
                    a+=100;
                    b+=100;
                    c+=100;
                    g.setColor(Color.blue);
                 }
                else {
                    g.drawOval(x, y, 60, 60);
                    g.fillOval(x, y, 60, 60);
                }}
            else{
                g.setColor(Color.PINK);
                if(shape== "Sqaure"){
                    g.drawRect(x, y, 60, 60);
                }
                else if (shape == "Triangle") 
                {
                int z[]={a,b,c};
                    int v[]={c,a,c};
                    g.drawPolygon(z,v,3);
                    g.fillPolygon(z,v, 3);
                    x+=100;
                    a+=100;
                    b+=100;
                    c+=100;
                    g.setColor(Color.blue);
                 }
                else {
                    g.drawOval(x, y, 60, 60);
                }}
}        
                else{
            g.drawString(Integer.toString(i), x, c);
                }

        }}
    }*/
    
}  class playgame extends GameBoard {
    
    
    String Player1;  
    String Player2;
    boolean playagain = false;
    
    playgame(){
        
    }
    playgame(String playern1, String playern2){
        playern1 = Player1;
        playern2 = Player2;
    }
    public String player1turn(int cardnumber1 , int cardnumber2)
    {
        MemoryCard currentcard1 = null;
        MemoryCard currentcard2 = null;
        String st = null;
        String st1,st2;
        if (cardnumber1 >=0 && cardnumber1 <=35 && cardnumber2 >=0 && cardnumber2 <=35) {
            //System.out.println("Entering if condition");
            currentcard1 = (MemoryCard)gameBoard.get(cardnumber1);
            if (currentcard1.getState() == false) {
            currentcard1.setState(true);
            
            }else {
                System.out.println("Didnt work");
            }
            st1 = currentcard1.toString();
            
            currentcard2 = (MemoryCard)gameBoard.get(cardnumber2);
            currentcard2.setState(true);
            st2 = currentcard2.toString();
            if (st1.equals(st2)) {
                st = st1 + "\n" + "The cards match. Please go again.";
                //System.out.println("equals");
            set1.add(currentcard1);
            gameBoard.replace(cardnumber2, (MemoryCard)gameBoard.get(cardnumber2), null);
            gameBoard.replace(cardnumber1, (MemoryCard)gameBoard.get(cardnumber1), null);
            Set<Integer> keys = gameBoard.keySet();
            System.out.println("These are the remaining cards:" );    
            int counter = 0;
            for (int key : keys)
                {
                    
                    if (gameBoard.get(key) == null)  
                    {
                        System.out.print("X, ");
                        counter++;
                        
                    }
                    else
                    {
                    System.out.print(key + ", ");
                    }
                    if (counter == 36) 
                    {
                    gameBoard.clear();
                    }
                }
                
            //set1.add(currentcard2);
            //carddeck.remove(currentcard1);
           //carddeck.remove(currentcard2);
            playagain = true;
            }
            else{
                //System.out.println("not equals");
                
                st= "The cards do not match.";
//                gameBoard.remove(cardnumber1, currentcard1);
//                gameBoard.remove(cardnumber2, currentcard2);
                currentcard1.setState(false);
                currentcard2.setState(false);
                 gameBoard.replace(cardnumber2, (MemoryCard)gameBoard.get(cardnumber2), currentcard2);
            gameBoard.replace(cardnumber1, (MemoryCard)gameBoard.get(cardnumber1), currentcard1);
            System.out.println(currentcard1.toString());
            System.out.println(currentcard2.toString());
             Set<Integer> keys = gameBoard.keySet();
            System.out.println("These are the remaining cards:" );    
            int counter = 0;
            for (int key : keys)
                {
                    
                    if (gameBoard.get(key) == null)  
                    {
                        System.out.print("X, ");
                        counter++;
                        
                    }
                    else
                    {
                    System.out.print(key + ", ");
                    }
                    if (counter == 36) 
                    {
                    gameBoard.clear();
                    }
                }
            
            playagain = false;
            
            }
            
        }else{
             st = "Enter Valid Number.(0-35)";
        }
           return st;
}
    public String player2turn(int cardnumber1 , int cardnumber2)
    {
        MemoryCard currentcard1 = null;
        MemoryCard currentcard2 = null;
        String st = null;
        String st1,st2;
        if (cardnumber1 >=0 | cardnumber1 <=35 | cardnumber2 >=0 | cardnumber2 <=35) {
            currentcard1 = (MemoryCard)gameBoard.get(cardnumber1);
            currentcard1.setState(true);
            st1 = currentcard1.toString();
            currentcard2 = (MemoryCard)gameBoard.get(cardnumber2);
            currentcard2.setState(true);
            st2 = currentcard2.toString();
            if (st1.equals(st2)) {
                st = st1 + "\n" + "The cards match. Please go again.";
            set2.add(currentcard1);
           // set2.add(currentcard2);
            gameBoard.replace(cardnumber2, (MemoryCard)gameBoard.get(cardnumber2), null);
            gameBoard.replace(cardnumber1, (MemoryCard)gameBoard.get(cardnumber1), null);
             Set<Integer> keys = gameBoard.keySet();
            System.out.println("These are the remaining cards:" );    
            int counter = 0;
            for (int key : keys)
                {
                    
                    if (gameBoard.get(key) == null)  
                    {
                        System.out.print("X, ");
                        counter++;
                        
                    }
                    else
                    {
                    System.out.print(key + ", ");
                    }
                    if (counter == 36) 
                    {
                    gameBoard.clear();
                    }
                }
            playagain = true;
            }
            else{
                st= "The cards do not match.";
               
                currentcard1.setState(false);
                currentcard2.setState(false);
            gameBoard.replace(cardnumber2, (MemoryCard)gameBoard.get(cardnumber2), currentcard2);
            gameBoard.replace(cardnumber1, (MemoryCard)gameBoard.get(cardnumber1), currentcard1);
                
                System.out.println(currentcard1.toString());
            System.out.println(currentcard2.toString());
             Set<Integer> keys = gameBoard.keySet();
            System.out.println("These are the remaining cards:" );    
            int counter = 0;
            for (int key : keys)
                {
                    
                    if (gameBoard.get(key) == null)  
                    {
                        System.out.print("X, ");
                        counter++;
                        
                    }
                    else
                    {
                    System.out.print(key + ", ");
                    }
                    if (counter == 36) 
                    {
                    gameBoard.clear();
                    }
                }
                playagain = false;
            }
            
        }else{
             st = "Enter Valid Number.(0-35)";
        }
           return st;
}
    public String Winner()
    {
        String winner = null;
        if (set1.size()> set2.size()) 
        {
            winner = "PLAYER 1 WINS" + "\n" + "Player 1 found: " + set1.size()+ " apairs" + "\n";
            
        }
        else if (set1.size() < set2.size()) 
        {
            winner = "PLAYER 2 WINS" + "\n" + "Player 2 found: " + set2.size()+ " pairs" + "\n";
            
        }else
        {
            winner = "DRAW" + "\n" + "Both players found 18 cards." + "\n";
        }
        return winner;
        
    }
  
    
    
}
