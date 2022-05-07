package br.com.projAulaSpring.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;

@Document
public class Assessment implements Serializable {

    @Id
    private String _id;
    private String description;
    private String date;
    private int NumberOfStudent;

    public Assessment(){}

    public Assessment(String description){
        this.description = description;
    }

    //Id
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    //Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    //NumberOfStudent
    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(int NumberOfStudent) {
        this.NumberOfStudent = NumberOfStudent;
    }
}