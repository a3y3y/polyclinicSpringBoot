package com.perakladau.polyclinic.entity;

import java.util.ArrayList;
import java.util.List;

public enum MedicalNoteType {
    DIAGNOSIS("Диагноз"),
    INDIVIDUAL_TREATMENT("Лечение"),
    MEDICAL_TEST("Анализ"),
    PRESCRIPTION("Рецепт"),
    SICK_LEAVE("Больничный"),
    VACCINATION("Прививка");

    public final String name;

    MedicalNoteType(String name){
        this.name = name;
    }

    public static List<String> getNames() {
        List<String> names = new ArrayList();
        for (MedicalNoteType noteType : values()) {
            names.add(noteType.name);
        }
        return names;
    }

}
