package com.example.sbpractice.domain;

public class Major {

    private String name;
    private String subjectGroup;

    public Major(){}
    public Major(String name){
        this.name  = name.toUpperCase();
        String magicSubs = "HERBOLOGY POTIONS DADA CHARMS TRANSFIGURATION ASTRONOMY";
        String scienceSubs = "BIOLOGY MEDICINE EARTH SCIENCE PHYSICS";
        String mathSubs = "MATHS MATH GEOMETRY ALGEBRA CALCULUS STATISTICS";

        if(magicSubs.contains(name.toUpperCase())){
            this.subjectGroup = "MAGIC";
        }else if(scienceSubs.contains(name.toUpperCase())){
            this.subjectGroup = "SCIENCE";
        }else if(mathSubs.contains(name.toUpperCase())){
            this.subjectGroup = "MATHS";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectGroup() {
        return subjectGroup;
    }

    public void setSubjectGroup(String subjectGroup) {
        this.subjectGroup = subjectGroup;
    }
}
