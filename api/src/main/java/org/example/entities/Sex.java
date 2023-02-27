package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sexes")
public class Sex {
    @Id
    private boolean sexId;

    private String name;
    public boolean isSexId() {
        return sexId;
    }

    public void setSexId(boolean id) {
        this.sexId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
