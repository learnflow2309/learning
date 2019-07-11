//Klasa
public class Passenger implements Comparable{
	//other members elided for clarity

	public static class RewardProgram{
		private int memberLevel;
		private int memberDays;

		public int getLevel(){return level;}
		public void setLevel(int level){this.level = level;}

		public int getMemberDays(){return memberDays;}
		public void setMemberDays(int days){this.memberDays = days;}
	}

	private RewardProgram rewardProgram = new RewardProgram();
	public RewardProgram getRewardProgram(){
		return rewardProgram;
	}
}

//Pozivanje izvan klase
Passenger steve = new Passenger();
steve.setName("Steve");
steve.getRewardProgram().setLevel(3);
steve.getRewardProgram().setMemberDays(180);

Passenger.RewardProgram platinum = new Passenger.RewardProgram();
platinum.setLevel(3);

if(steve.getRewardProgram().getLevel() == platinum.getLevel()){
	System.out.println("Steve is platinum")
}