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
    public class Par implements  Comparable<Par>{
    double w;
    int  u;

    public Par(double ww, int uu) { w = ww; u = uu; }

    double first() { return w; }
    int second() { return u; }



    public int compareTo(Par other){
        if((double)this.first() < (double)other.first())
            return 1;
        if((double)this.first() > (double)other.first())
            return -1;
        return 0;

    }
}


