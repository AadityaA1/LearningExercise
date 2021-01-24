package exercise.generics.leagueTable;

public class Main {

	public static void main(String[] args) {

		LeagueTable<Team<CricketPlayer>> ipl = new LeagueTable<>("IPL");

		Team<CricketPlayer> csk = new Team("Chennai Super Kings");

		Team<CricketPlayer> dc = new Team("Delhi Capitals");
		Team<CricketPlayer> rr = new Team("Rajasthan Royals");

		Team<BaseballPlayer> chicagoCubs = new Team("Chicago Cubs");

		ipl.addTeams(csk);
		ipl.addTeams(rr);
		ipl.addTeams(dc);

		dc.matchResult(csk, 1, 3);
		rr.matchResult(csk, 2, 5);

		csk.matchResult(rr, 1, 2);

		System.out.println("#######Rankings#######");

		System.out.println(csk.getName() + " : " + csk.ranking());
		System.out.println(dc.getName() + " : " + dc.ranking());

		System.out.println(rr.getName() + " : " + rr.ranking());

		System.out.println("###########IPL League Table###########");
		ipl.printLeagueTable();

	}
}
