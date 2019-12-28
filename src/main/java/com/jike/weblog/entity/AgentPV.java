package com.jike.weblog.entity;

import java.util.Objects;

public class AgentPV {
    private String agent;
    private String countpv;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentPV agentPV = (AgentPV) o;
        return Objects.equals(agent, agentPV.agent) &&
                Objects.equals(countpv, agentPV.countpv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agent, countpv);
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCountpv() {
        return countpv;
    }

    public void setCountpv(String countpv) {
        this.countpv = countpv;
    }

    public AgentPV(String agent, String countpv) {
        this.agent = agent;
        this.countpv = countpv;
    }

    public AgentPV() {
    }

    @Override
    public String toString() {
        return "AgentPV{" +
                "agent='" + agent + '\'' +
                ", countpv='" + countpv + '\'' +
                '}';
    }
}
