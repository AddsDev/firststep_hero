package com.adrian.firststep.domain.model;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero {
    private String name;
    private int level;
    private List<Skill> skills;

    public Hero(List<Skill> skills) {
        this.skills = skills;
    }

    public Hero(String nombre, int nivel, List<Skill> skills) {
        this.name = nombre;
        this.level = nivel;
    }
    
}
