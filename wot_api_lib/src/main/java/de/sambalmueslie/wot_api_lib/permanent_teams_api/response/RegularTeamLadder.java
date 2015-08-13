package de.sambalmueslie.wot_api_lib.permanent_teams_api.response;

public class RegularTeamLadder {
	public long getDivision() {
		return division;
	}

	public long getGroup() {
		return group;
	}

	public long getPoints() {
		return points;
	}

	public long getRank() {
		return rank;
	}

	private long division;
	private long group;
	private long points;
	private long rank;
}