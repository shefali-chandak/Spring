package com;

import java.util.List;
import java.util.Map;

public class DID {
    private String seasonName;
    private List<String> brandPartners;
    private Map<Participants,String> participants;//value=>team


    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public List<String> getBrandPartners() {
        return brandPartners;
    }

    public void setBrandPartners(List<String> brandPartners) {
        this.brandPartners = brandPartners;
    }

    public Map<Participants, String> getParticipants() {
        return participants;
    }

    public void setParticipants(Map<Participants, String> participants) {
        this.participants = participants;
    }

    public void display()
    {
        System.out.println("Season Name : " + getSeasonName());
        System.out.println("Brand Partners : " + getBrandPartners());
        Map<Participants,String> m = getParticipants();
        for (Map.Entry<Participants,String> m1 : m.entrySet())
        {
            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
        }
    }
}
