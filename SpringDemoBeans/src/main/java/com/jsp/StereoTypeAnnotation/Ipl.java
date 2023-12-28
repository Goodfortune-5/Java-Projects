package com.jsp.StereoTypeAnnotation;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component
public class Ipl {
 
	@Value("RCB")
	private String teamName;
	@Value("Virat Kohli")
	private String teamCaptain;
	@Value("#{temp}")//SPEL
	private List<String> playersName;
 
	public String getTeamName() {
		return teamName;
	}
 
	public String getTeamCaptain() {
		return teamCaptain;
	}
 
	public List<String> getPlayersName() {
		return playersName;
	}
 
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
 
	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}
 
	public void setPlayersName(List<String> playersName) {
		this.playersName = playersName;
	}
 
	@Override
	public String toString() {
		return "Ipl [teamName=" + teamName + ", teamCaptain=" + teamCaptain + ", playersName=" + playersName + "]";
	}


}