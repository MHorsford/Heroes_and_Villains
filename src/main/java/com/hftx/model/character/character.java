package com.hftx.model.character;

public abstract class Character {
    private int id;
    private String name;
    private String description;
    private byte[] image;
    private byte[] video;
    private String team;
    private String type;
    private String superPower;
    private String weakness;
    private int threatLevel;
    private Album album;

    public Character(int id, String name, String description, byte[] image, byte[] video, String group, String type, String superPower, String weakness, int threatLevel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.video = video;
        this.team = group;
        this.type = type;
        this.superPower = superPower;
        this.weakness = weakness;
        this.threatLevel = threatLevel;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getSuperPower() {
        return superPower;
    }
    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getWeakness() {
        return weakness;
    }
    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getThreatLevel() {
        return threatLevel;
    }
    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }
    
    @Override
    public String toString() {
        return "character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", group='" + team + '\'' +
                ", type='" + type + '\'' +
                ", superPower='" + superPower + '\'' +
                ", weakness='" + weakness + '\'' +
                ", threatLevel=" + threatLevel +
                '}';
    }
}
