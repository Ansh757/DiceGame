
import java.io.*;
public class Die { //Blueprint Method 


 private int value;
 private final int FACES= 6;
 static int p1Points = 100;
 static int cpuPoints= 100;
 static int totalpPoints;
 static int totalcPoints;
 static int total2;
 static int total;


 
 public Die() //Constructor Method 
 {
  
  this.dieRoll();
 }
 
 public void dieRoll() 
 {
  value = (int)(Math.random() * FACES + 1 );
 
 }
 
 public int getValue()
 {
  return value; 
 }
 
 public static void DieObject()
 {
  int count=0; 
  int d1Value, d2Value, d3Value, d4Value, d5Value, d6Value;
  
  Die d1= new Die(); 
  Die d2= new Die(); 
  Die d3= new Die(); 
  Die d4= new Die(); 
  Die d5= new Die(); 
  Die d6= new Die();
  
  do {
   
  d1.dieRoll();
  d2.dieRoll();
  d3.dieRoll();
  d4.dieRoll();
  d5.dieRoll();
  d6.dieRoll();
  
  d1Value= d1.getValue();
  d2Value= d2.getValue();
  d3Value= d3.getValue();
  d4Value= d4.getValue();
  d5Value= d5.getValue();
  d6Value= d6.getValue();
  
  
  count++;
  }while(!((d1Value==d2Value) && (d1Value==d3Value) && (d1Value==d4Value) && (d1Value==d5Value) && (d1Value==d6Value) && (d2Value==d3Value) && (d2Value==d4Value) && (d2Value==d5Value) && (d2Value==d6Value) && (d3Value==d4Value) && (d3Value==d5Value) && (d3Value==d6Value) && (d4Value==d5Value) && (d4Value==d6Value) && (d5Value==d6Value))); 
   
   if ((d1Value==d2Value) && (d1Value==d3Value) && (d1Value==d4Value) && (d1Value==d5Value) && (d1Value==d6Value) && (d2Value==d3Value) && (d2Value==d4Value) && (d2Value==d5Value) && (d2Value==d6Value) && (d3Value==d4Value) && (d3Value==d5Value) && (d3Value==d6Value) && (d4Value==d5Value) && (d4Value==d6Value) && (d5Value==d6Value))
   {
    System.out.println("The value is: "+ d1Value);
    System.out.println("The value is: "+ d2Value); 
    System.out.println("The value is: "+ d3Value); 
    System.out.println("The value is: "+ d4Value); 
    System.out.println("The value is: "+ d5Value); 
    System.out.println("The value is: "+ d6Value); 
   }
    
   else 
   {
    d1.dieRoll();
    d2.dieRoll();
    d3.dieRoll();
    d4.dieRoll();
    d5.dieRoll();
    d6.dieRoll();   
   } 
   System.out.println("It took the following tries "+ count);
   System.out.println("");
 }
 
 public static void UserVsCpu() throws IOException
 {
  
  int totalP = 0;
  int totalcpu =0;
  int cpuValue = 0, p1Value = 0, cpu2Value = 0, p1Value2 = 0;
  
  Die p2 = new Die();
  Die p1 = new Die();
  Die cpu = new Die ();
  Die cpu2 = new Die ();
  
  
  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
  System.out.println ("Type yes if you'd like to roll the dies");
  String answer = kb.readLine();

  
  
  while (answer.equalsIgnoreCase("yes"))
  {
   if (answer.equalsIgnoreCase("yes"))
   {
     p1Points= p1Points-20;
     cpuPoints = cpuPoints-20;
   }   
   
      
   p1.dieRoll();
   p2.dieRoll();
   cpu.dieRoll();
   cpu2.dieRoll();
 
   
   cpuValue = cpu.getValue();
   cpu2Value= cpu2.getValue();
   p1Value2 = p2.getValue();
   p1Value  = p1.getValue();
   
   System.out.println("The Player rolled a: " + p1Value); 
   System.out.println("The Player rolled again and got: " + p1Value2);
   System.out.println("The CPU rolled a: " + cpuValue);
   System.out.println("The CPU rolled again and got: " + cpu2Value); 
   System.out.println("");
   
    
   System.out.println ("");
         
     if ((p1Value + p1Value2) == 3)
     {
       totalpPoints= totalpPoints+2;
       total= (totalpPoints + (p1Points));
       System.out.println("Total Points after this turn for Player are: " + total);
       
       
     }
     
     if ((p1Value + p1Value2) == 4)
     {
      totalpPoints= totalpPoints+3;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }
     
     if ((p1Value + p1Value2) == 5)
     {
     
      totalpPoints= totalpPoints+5;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }

     if ((p1Value + p1Value2) == 6)
     
      {
     totalpPoints= totalpPoints+7;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     } 
     
     if ((p1Value + p1Value2) == 7)
     {
    
     totalpPoints= totalpPoints+10;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }
    
     if ((p1Value + p1Value2) == 8)
     
      {
     totalpPoints= totalpPoints+11;
      total= (totalpPoints + (p1Points));
     System.out.println("Total Points after this turn for Player are: " + total);
     }
    
     if ((p1Value + p1Value2) == 9)
     {
    
     totalpPoints= totalpPoints+ 13;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }
    
     if ((p1Value + p1Value2) == 10)
     {
    
     totalpPoints= totalpPoints+15;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }
    
     if ((p1Value + p1Value2) == 11)
     {
    
     totalpPoints= totalpPoints+ 17;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }
     
     if ((p1Value + p1Value2) == 12)
     {
    
     totalpPoints= totalpPoints+20;
      total= (totalpPoints + (p1Points));
      System.out.println("Total Points after this turn for Player are: " + total);
     }
     
     if ((p1Value + p1Value2)==2) 
     {
       total = p1Points;
      System.out.println("Total Points after this turn for Player are: " + p1Points);

     }
  //---------------------------------------------------------------------------------------------------------   
     
     if (((cpuValue+cpu2Value)==3))
     {
       
       totalcPoints= totalcPoints+2;
       total2= (totalcPoints + (cpuPoints));
       System.out.println("Total Points after this turn for Computer are: " + total2);
     }
     
     if (((cpuValue+cpu2Value)==4))
     {
      
      totalcPoints= totalcPoints+3;
      total2= (totalcPoints + (cpuPoints));
      System.out.println("Total Points after this turn for computer are: " + total2);
      
     }
     
     if (((cpuValue+cpu2Value)==5))
     {
      
      totalcPoints= totalcPoints+5;
      total2= (totalcPoints + (cpuPoints));
      System.out.println("Total Points after this turn for computer are: " + total2);
      
     }

     if (((cpuValue+cpu2Value)==6))
     {    
      totalcPoints= totalcPoints+7;
      total2= (totalcPoints + (cpuPoints));
      System.out.println("Total Points after this turn for computer are: " + total2);

     } 
     
     if (((cpuValue+cpu2Value)==7))
     {
      
      totalcPoints= totalcPoints+10;
      total2= (totalcPoints + (cpuPoints));
      System.out.println("Total Points after this turn for computer are: " + total2);

     }
    
     if (((cpuValue+cpu2Value)==8))
     {
         
     totalcPoints= totalcPoints+11;
      total2= (totalcPoints + (cpuPoints));
      System.out.println("Total Points after this turn for computer are: " + total2);

     }
    
     if (((cpuValue+cpu2Value)==9))
     {
    
      totalcPoints= totalcPoints+13;
      total2= (totalcPoints + (cpuPoints-10));
      System.out.println("Total Points after this turn for computer are: " + total2);

     }
    
     if (((cpuValue+cpu2Value)==10))
     {
    
      totalcPoints= totalcPoints+15;
      total2= (totalcPoints + (cpuPoints-10));
      System.out.println("Total Points after this turn for computer are: " + total2);

     }
    
     if (((cpuValue+cpu2Value)==11))
     {     
      totalcPoints= totalcPoints+17;
      total2= (totalcPoints + cpuPoints);
      System.out.println("Total Points after this turn for computer are: " + total2);

     }
     
     if (((cpuValue+cpu2Value)==12))
      { 
      
      totalcPoints= totalcPoints+20;
      total2= (totalcPoints + (cpuPoints));
      System.out.println("Total Points after this turn for computer are: " + total2);

     }  
     
     if ((cpuValue + cpu2Value)==2) 
     {
       total2 = cpuPoints;
      System.out.println("Total Points after this turn for computer are: " + cpuPoints);
     }
    
     
  if (total<=0)
   {
    System.out.println("The player lost!");
    System.exit(0);
   }
   
   else if(total2<=0)
   {
    System.out.println("The computer lost!");
    System.exit(0);
   } 
  
  	System.out.println ("");
  	System.out.println ("");
    System.out.println ("Type yes if you'd like to roll the dies AGAIN");
     answer = kb.readLine(); 

    } 
  }  
  
 public static void main (String [] args) throws IOException 
 
  { 
  System.out.println ("");
  DieObject();
  System.out.println("");
  UserVsCpu();
  }  

 }
 
 
