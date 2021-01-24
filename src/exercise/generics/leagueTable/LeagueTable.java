package exercise.generics.leagueTable;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {

	private String name;
	private ArrayList<T> teams = new ArrayList<>();

	public LeagueTable(String name) {

		this.name = name;
	}

	public boolean addTeams(T team) {
		if (teams.contains(team.getName())) {
			System.out.println(team.getName() + " is already present in the table");
			return false;
		} else {
			teams.add(team);
			System.out.println(team.getName() + " added to the league table");
			return true;
		}
	}

	public void printLeagueTable() {
		Collections.sort(teams);

		for (T t : teams) {
			System.out.println(t.getName() + ":" + t.ranking());
		}
	}

}
