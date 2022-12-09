/**
 *  This class represents a player object
 *
 * @author Wafa Berri
 */
public class Player {
    /** The name of the player*/
    private String name;
    /** The word of the player*/
    private String word;
    /** The money of the player*/
    private int money;
    /** The guesses of the player*/
    private int guesses;

    /**
     * Instantiates a Player object.
     * <p>
     * @param name the name
     * @param word the word
     * @param money1 the money
     */
    public Player (String name, String word, int money1) {
        this.name = name;
        this.word = word;
        money = money1;
        guesses = 0;
    }

    /**
     * Instantiates a Player object
     * <p>
     * @param name the name
     * @param word the word
     */
    public Player (String name, String word) {
        this.name = name;
        this.word = word;
        money = setMoney();
        guesses = 0;
    }

    /**
     * Sets money to new value inputted by user (money)
     *
     * @param money the new value of money
     */
    public void setMoney(int money){
        this.money = money;
    }

    /**
     *Returns a value of money from 25 to 100.
     *
     * @return a random value from 25-100
     */
    public int setMoney() {
        return (int) ((Math.random() * 76)+25);
    }

    /**
     * Decreases money by five
     */
    public void loseMoney() {
        money -= 5;
    }

    /**
     * Increases money by 10
     */
    public void addMoney() {
        money += 10;
    }

    /**
     * Returns the name of the Player
     * @return the name of player
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the word of the player
     * @return word of the player
     */
    public String getWord() {
        return word;
    }

    /**
     * Returns the money of the player
     * @return money of the player
     */
    public int getMoney() {
        return money;
    }

    /**
     * Increases the guesses by one
     */
    public void addGuess() {
        guesses++;
    }

    /**
     * Returns the number of guesses
     * @return the int of guesses
     */
    public int getGuesses() {
        return guesses;
    }//iniyial

}
