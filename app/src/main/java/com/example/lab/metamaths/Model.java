package com.example.lab.metamaths;

import java.util.ArrayList;

public class Model {

    private int in_degree, out_degree;
    private ArrayList<String> in_edges, out_edges;

    public Model() {
    }

    public Model(int in_degree, int out_degree, ArrayList<String> in_edges, ArrayList<String> out_edges) {
        this.in_degree = in_degree;
        this.out_degree = out_degree;
        this.in_edges = in_edges;
        this.out_edges = out_edges;
    }

    public int getIn_degree() {
        return in_degree;
    }

    public void setIn_degree(int in_degree) {
        this.in_degree = in_degree;
    }

    public int getOut_degree() {
        return out_degree;
    }

    public void setOut_degree(int out_degree) {
        this.out_degree = out_degree;
    }

    public ArrayList<String> getIn_edges() {
        return in_edges;
    }

    public void setIn_edges(ArrayList<String> in_edges) {
        this.in_edges = in_edges;
    }

    public ArrayList<String> getOut_edges() {
        return out_edges;
    }

    public void setOut_edges(ArrayList<String> out_edges) {
        this.out_edges = out_edges;
    }
}
