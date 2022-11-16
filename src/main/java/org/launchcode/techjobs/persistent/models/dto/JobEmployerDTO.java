package org.launchcode.techjobs.persistent.models.dto;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Skill;

import javax.validation.constraints.NotNull;

public class JobEmployerDTO {

    @NotNull
    private Employer employer;

    @NotNull
    private Skill skill;

    public JobEmployerDTO() {}

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
