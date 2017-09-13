/******************************************************
‘***  Project 1 - Push Pop Stack
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate Error handling / Classes / Math
‘***
‘******************************************************
‘*** 09/13/2017
‘******************************************************
‘*****************************************************/

/**
 *
 * @author Gabe
 */
public class Stack 
{
private IntLL groot;

/******************************************************
‘***  push(int nextInt)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to push value to list
‘*** Method Inputs: 
‘***      next int value
‘*** Return value:
‘***      void
‘******************************************************
‘*** 9/13/2017
‘******************************************************/
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
    
/******************************************************
‘***  pop()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to pop item off the list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      the IntLL that was popped
‘******************************************************
‘*** 9/13/2017
‘******************************************************/
public IntLL pop()
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

/******************************************************
‘***  printLList()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to print/display list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      entire list 
‘******************************************************
‘*** 9/13/2017
‘******************************************************/ 
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


}
