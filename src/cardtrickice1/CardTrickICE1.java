/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */

/*Piero Caramutti - 991662541*/
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);
        
        Card one = new Card();
        Card two = new Card();
        Card three = new Card();
        Card four = new Card();
        Card five = new Card();
        Card six = new Card();
        Card seven = new Card();
        Card luckyCard = new Card();
  
        
        Card[] magicHand = {one, two, three, four, five, six, seven, luckyCard}; //Array of object
        luckyCard.setValue(10);
	luckyCard.setSuits("diamonds");

        
        for( int i=0;i<magicHand.length;i++)
        { 
          
            magicHand[i].setValue(rand.nextInt(13)+1);//use a method to generate random *13
            magicHand[i].setSuits(magicHand[i].SUITS[rand.nextInt(4)]);//random method suit

        }

        //step 2:take input 
        System.out.println(
                "Please choose a suit\n"
                + "1: Diamonds\n"
                + "2: Clubs\n"
                + "3: Spades\n"
                + "4: Hearts\n" 
        );
        int ansOne = inp.nextInt();
        
        System.out.println(
                "Please choose a value (1 to 13)"
        );
        int ansTwo = inp.nextInt();
        
        Card user = new Card();
        switch(ansOne){ //Set Suits
            case 1:
                user.setSuits("diamonds");
                break;
            case 2:
                user.setSuits("clubs");
                break;
            case 3:
                user.setSuits("Spades");
                break;
            case 4:
                user.setSuits("hearts");
                break;
        }
        user.setValue(ansTwo);//Set Value
        
        //step 3: match with array 
        
        boolean bool = false;
            for(int i=0; i<magicHand.length; i++){
                if((user.getValue() == magicHand[i].getValue()) && (user.getSuits() == magicHand[i].getSuits()))
                {bool = true;
                break;
                }
            }
                   
            
            if(bool == true)
                System.out.println("Your card is in the magic hand!");
            else
                System.out.println("Your card not match");
    }
}

 


