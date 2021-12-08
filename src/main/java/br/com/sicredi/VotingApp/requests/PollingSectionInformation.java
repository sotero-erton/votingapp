package br.com.sicredi.VotingApp.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.Objects;

@ApiModel(description = "Informações da Seção de Votação.")
public class PollingSectionInformation {

    @JsonProperty("agenda-identifier")
    String agendaIdentifier;

    @JsonProperty("start-date")
    String startDate;

    @JsonProperty("start-time")
    String startTime;

    @JsonProperty("duration")
    String duration;

    @JsonProperty("authentication-key")
    String authenticationKey;

    public PollingSectionInformation(String agendaIdentifier, String startDate, String startTime, String duration,
                                     String authenticationKey) {
        this.agendaIdentifier = agendaIdentifier;
        this.startDate = startDate;
        this.startTime = startTime;
        this.duration = duration;
        this.authenticationKey = authenticationKey;
    }

    public String getAgendaIdentifier() {
        return agendaIdentifier;
    }

    public void setAgendaIdentifier(String agendaIdentifier) {
        this.agendaIdentifier = agendaIdentifier;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAuthenticationKey() {
        return authenticationKey;
    }

    public void setAuthenticationKey(String authenticationKey) {
        this.authenticationKey = authenticationKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PollingSectionInformation that = (PollingSectionInformation) o;
        return agendaIdentifier.equals(that.agendaIdentifier) && startDate.equals(that.startDate) &&
                startTime.equals(that.startTime) && duration.equals(that.duration) &&
                Objects.equals(authenticationKey, that.authenticationKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agendaIdentifier, startDate, startTime, duration, authenticationKey);
    }
}
