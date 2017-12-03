import java.util.ArrayList;

public class Player {
	private String name;
	private int chips; 
	private int bet;
	private ArrayList<Card> oneRoundCard = new ArrayList();
	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
	}
	public String getName() {
		return name;
	}
	public int makeBet() {
		if(chips!=0) {
			bet = 1;
			return bet;
		}
		else {
			bet = 0;
			System.out.println("沒錢就回家吃奶，別在這丟人現眼!");
		}
		return bet;
	}
	public void setOneRoundCard(ArrayList cards) {
		oneRoundCard=cards;
	}
	public boolean hitMe() {
		if(getTotalValue() <=16) {
			return true;
		}
		return false;
	}
	public int getTotalValue() {
		int total=0;
		for(int i=0;i<oneRoundCard.size();i++) {
			total += oneRoundCard.get(i).getRank();
		}
		return total;
	}
	public int getCurrentChips() {
		return chips;		
	}
	public void increaseChips (int diff) {
		chips+=diff;
	}
	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}
}
