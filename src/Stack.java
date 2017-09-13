/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabe
 */
public class Stack 
{
private IntLL groot;


    public void push(int nextInt)
    {
        IntLL temp = new IntLL();
        temp.value = nextInt;
        IntLL temp2;

        
        if(groot == null)
        {
            groot = temp;
        }
        
        else
        {
            temp2 = groot;
            while(temp2.nextLL != null)
                temp2 = temp2.nextLL;
            temp2.nextLL = temp;
        }
    }

    
public String printLList()
    {
        IntLL temp = groot;
        String display = "<html>";
        while(temp!= null)
        {
           display += (temp.value + "<br>");
           //System.out.println(temp.value + "    "); //prints link list from beginning
           temp = temp.nextLL; //points to next link
        }
        
        return display;
    }


public IntLL pop(int number)
    {
        IntLL current = groot;              
        IntLL previous = groot;
        if (groot != null)
        {
 
            while(current.nextLL != null) 
            { 
                    previous = current;
                    current = current.nextLL;
            }  


            if(current == groot) 
                groot = groot.nextLL;         
            else                               
                previous.nextLL = current.nextLL; 

            
        }
        return current;
    }
}
