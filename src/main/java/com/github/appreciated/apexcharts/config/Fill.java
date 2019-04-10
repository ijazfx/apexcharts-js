package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.fill.Gradient;
import com.github.appreciated.apexcharts.config.fill.Image;
import com.github.appreciated.apexcharts.config.fill.Pattern;

import java.util.List;

public class Fill {
    List<String> colors;
    Double opacity;
    String type;
    Gradient gradient;
    Image image;
    Pattern pattern;

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public Double getOpacity() {
        return opacity;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Gradient getGradient() {
        return gradient;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
}
