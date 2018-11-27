package com.example.lab.metamaths;

public class Chapter {
    private int graph;
    private String chapterName;

    public Chapter() {
    }

    public Chapter(int graph, String chapterName) {
        this.graph = graph;
        this.chapterName = chapterName;
    }

    public int getGraph() {
        return graph;
    }

    public void setGraph(int graph) {
        this.graph = graph;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }
}
