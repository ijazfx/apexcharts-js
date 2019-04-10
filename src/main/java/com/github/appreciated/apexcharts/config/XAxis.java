package com.github.appreciated.apexcharts.config;

import com.github.appreciated.apexcharts.config.xaxis.*;

import java.util.List;

public class XAxis {
    private Type type;
    private List<String> categories;
    private List<String> labels;
    private AxisBorder axisBorder;
    private AxisTicks axisTicks;
    private Double tickAmount;
    private Double min;
    private Double max;
    private Double range;
    private Boolean floating;
    private String position;
    private Title title;
    private Crosshairs crosshairs;
    private Tooltip tooltip;


    public XAxis() {
    }

    public Type getType() {
        return type;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getLabels() {
        return labels;
    }

    public AxisBorder getAxisBorder() {
        return axisBorder;
    }

    public AxisTicks getAxisTicks() {
        return axisTicks;
    }

    public Double getTickAmount() {
        return tickAmount;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }

    public Double getRange() {
        return range;
    }

    public Boolean getFloating() {
        return floating;
    }

    public String getPosition() {
        return position;
    }

    public Title getTitle() {
        return title;
    }

    public Crosshairs getCrosshairs() {
        return crosshairs;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setAxisBorder(AxisBorder axisBorder) {
        this.axisBorder = axisBorder;
    }

    public void setAxisTicks(AxisTicks axisTicks) {
        this.axisTicks = axisTicks;
    }

    public void setTickAmount(Double tickAmount) {
        this.tickAmount = tickAmount;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setMax(Double max) {
        this.max = max;
    }

    public void setRange(Double range) {
        this.range = range;
    }

    public void setFloating(Boolean floating) {
        this.floating = floating;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setCrosshairs(Crosshairs crosshairs) {
        this.crosshairs = crosshairs;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

}
