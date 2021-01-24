package exercise.generics.player;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add(1);
		list.add("Tim");

		FootballPlayer joe = new FootballPlayer("Joe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		CricketPlayer lyon = new CricketPlayer("Lyon");

		Team<CricketPlayer> csk = new Team("Chennai Super Kings");
		csk.addPlayer(lyon);

		System.out.println(csk.numPlayers());

		Team<BaseballPlayer> chicagoCubs = new Team("Chicago Cubs");
		chicagoCubs.addPlayer(pat);

		Team<FootballPlayer> brokenTeam = new Team("Argentina");
		brokenTeam.addPlayer(joe);

		CricketPlayer warne = new CricketPlayer("Warne");

		csk.addPlayer(warne);

		CricketPlayer broad = new CricketPlayer("Broad");
		csk.addPlayer(broad);

		Team<CricketPlayer> dc = new Team("Delhi Capitals");
		Team<CricketPlayer> rr = new Team("Rajasthan Royals");

		dc.matchResult(csk, 1, 3);
		rr.matchResult(csk, 2, 5);

		csk.matchResult(rr, 1, 2);

		System.out.println("#######Rankings#######");

		System.out.println(csk.getName() + " : " + csk.ranking());
		System.out.println(dc.getName() + " : " + dc.ranking());

		System.out.println(rr.getName() + " : " + rr.ranking());

		System.out.println(csk.compareTo(dc));
		System.out.println(csk.compareTo(rr));
		System.out.println(dc.compareTo(rr));

	}
}
