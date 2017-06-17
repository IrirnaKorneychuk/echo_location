package echo_location.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

@Document
public class Project {

    @Id
    private String id;

    private String name;

    private File isoLineFile;

    private BufferedImage image;

    private Double power;

    private Double limit;

    private Double detalization;

    public Project() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getIsoLineFile() {
        return isoLineFile;
    }

    public void setIsoLineFile(File isoLineFile) {
        this.isoLineFile = isoLineFile;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getDetalization() {
        return detalization;
    }

    public void setDetalization(Double detalization) {
        this.detalization = detalization;
    }
}
