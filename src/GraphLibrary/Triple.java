/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphLibrary;

/**
 *
 * @author Daniel
 */
class Triple implements Comparable<Triple> {
    double w;
    int u,v;

    public Triple(Double f, Integer s, Integer t) {
        w= f;
        u = s;
        v = t;
    }

    public int compareTo(Triple o) {

        if(this.w < o.w){
          return 1;
        }
        if(this.w > o.w)
          return -1;
        return 0;
    }

    double first() { return w; }
    int second() { return u; }
    int third() { return v; }

    public String toString() { return first() + " " + second() + " " + third(); }
}

    

