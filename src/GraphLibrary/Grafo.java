package GraphLibrary;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList; 
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
public class Grafo 
{
    int m,n;
    boolean auto,dirigido;
    ArrayList <ArrayList <Par>> ListaAdj=new ArrayList <>();
    ArrayList<Double> CoordX=new ArrayList<>();
    ArrayList<Double> CoordY=new ArrayList<>();
    ArrayList<Double>  distancia=new ArrayList<>(this.ListaAdj.size());
     public Grafo(int n, int m, boolean auto, boolean dirigido) 
    {
        this.m = m;
        this.n = n;
        this.auto = auto;
        this.dirigido = dirigido;
        for(int i=0;i<n;i++){
            ListaAdj.add(new ArrayList<>());
        }
    }
     
        public void AgregarArista(int a,int b)
    {
        ListaAdj.get(a).add(new Par(0,b));
        if(dirigido==false)
        {
        ListaAdj.get(b).add(new Par(0,a));
        }
    }
        
        
        public void AgregarArista(int a,int b, double w)
    {
        ListaAdj.get(a).add(new Par(w,b));
        if(dirigido==false)
        {
        ListaAdj.get(b).add(new Par(w,b));
        }
    }
        
        
        
     public boolean ChecaAristasRepetidos(int a,int b){
     for (int i=0;i<ListaAdj.get(a).size();i++)
     {
      if (ListaAdj.get(a).get(i).second()==b){
          return true;
     }
    }
     return false;
    }
    public String imprimirGrafo()
    {
        String neri = "";
        for(int i=0;i<(n);i++)            
        {
        //System.out.print((i)); 
            
            neri += "" + i;
             for(int j=0;j<ListaAdj.get(i).size();j++)
             {
             neri += ";"+ListaAdj.get(i).get(j).second();
             }
             neri += "\n";
         
        }
        
        System.out.println(neri);
        return neri;
    }
    
    
    public String imprimirGrafoDijkstra()
    {
        String neri = "";
        
        for(int i=0;i<this.ListaAdj.size();i++)            
        {
        //System.out.print((i)); 
            String formato = String.format("%.2f", distancia.get(i));
            if(ListaAdj.get(i).size()>0)
              neri += "" + i + "_" + formato;
             else
                continue;
             for(int j=0;j<ListaAdj.get(i).size();j++)
             { 
                 int v = ListaAdj.get(i).get(j).second();
                 formato = String.format("%.2f", distancia.get(v));
                neri += ";"+ v + "_" + formato;
             }
             neri += "\n";
         
        }
        
        System.out.println(neri);
        return neri;
    }
    
    
    public String imprimirGrafoConPesos()
    {
        String neri = "";
        neri += "source;target;label\n";
        for(int i=0;i<(n);i++)            
        {
        //System.out.print((i)); 
            
            
             for(int j=0;j<ListaAdj.get(i).size();j++)
             {
                String formato = String.format("%.2f", ListaAdj.get(i).get(j).first() );
             neri += i + ";"+ListaAdj.get(i).get(j).second() + ";" + formato + "\n";
             }
         
        }
        
        System.out.println(neri);
        return neri;
    }
   
    
    public static Grafo genErdosRenyi (int n,int m,boolean auto,boolean dirigido)
    {
    Grafo g1= new Grafo (n,m,auto,dirigido);
    for (int i=0;i<m; i++){
        int u= (int)(Math.random()*(double)n);
        int v= (int)(Math.random()*(double)n);
     
        if (g1.auto==false && u==v){
            continue;
        }
        if (g1.ChecaAristasRepetidos(u, v)){
            continue;
        }
        g1.AgregarArista(u, v);
     

    }
    return g1;
            }

   public static Grafo genGilbert (int n,double p,boolean auto,boolean dirigido)
    {
        Grafo g2= new Grafo (n,0,auto,dirigido);
        
        for(int k=0;k<n;k++)
        {
            for (int l=0;l<n;l++)
            {
             double random= Math.random();
             if (g2.auto==false && k==l){
                continue;
             }
            if (g2.ChecaAristasRepetidos(k, l)){
                continue;
            }
            
              if(random<=p)
             {
                 g2.AgregarArista(k, l);
            // 
             }
            }
        }
        return g2;
    }
   
   public static Grafo genGeografico (int n, double r, boolean auto, boolean dirigido)
   {
   Grafo g3= new Grafo (n,0,auto,dirigido);
   for(int s=0;s<n;s++)
   {
       double x=Math.random();
       double y=Math.random();
       g3.CoordX.add(x);
       g3.CoordY.add(y);
   }
   for (int y=0;y<n;y++)
   {
       for (int z=0;z<n;z++)
       {
           double x1=g3.CoordX.get(y);
           double y1=g3.CoordY.get(y);
           double x2=g3.CoordX.get(z);
           double y2=g3.CoordY.get(z);    
           double d=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        if (g3.auto==false && y==z){
            continue;
        }
        if (g3.ChecaAristasRepetidos(y, z)){
        continue;
        }
       if(d<=r)
            {
           g3.AgregarArista(y, z);
           }
       }
   }
   return g3;       
   }


public static Grafo genBarabasiAlbert (int n,double d,boolean auto,boolean dirigido){
    Grafo g4= new Grafo (n,0,auto,dirigido);
    
    for(int f=0;f<d;f++)
    {
          for(int g=f+1;g<d;g++)
          {
           g4.AgregarArista(f,g);              
          }
    }
    int integer_d = (int)d;
    for (int h=integer_d;h<n;h++)
    {
        for (int m=0;m<=h;m++)
        {
            double adj=g4.ListaAdj.get(m).size();
            double proba=1.00-(adj/d);
            double random=Math.random();
       
            
     if (g4.auto==false && h==m){
           continue; 
       }
        if (g4.ChecaAristasRepetidos(h, m))
        {
        continue;
        }
        if(random<=proba)
       {
           g4.AgregarArista(h,m);
       }
      }
    }
    return g4; 
}

public Grafo BFS (int s)
{
    Grafo g5= new Grafo (n,0,false,false);
    Queue<Integer> q = new LinkedList<>();            //Hacemos la cola vacia
    ArrayList<Integer> visitado=new ArrayList();

    for (int i = 0; i < n; i++) 
    visitado.add(0);
    visitado.set(s, 1);
    q.add(s);
    while (!q.isEmpty())
    {
    int u=q.poll();
        for (int j = 0; j <ListaAdj.get(u).size(); j++) {
           int v=ListaAdj.get(u).get(j).second();
           if (visitado.get(v)==0)
           {
               visitado.set(v, 1);
               q.add(v);
               g5.AgregarArista(u, v);
           }
        }
    }
     return g5;         
}
public Grafo DFS_R (int s)
{
    Grafo g6= new Grafo (n,0,false,false);
    ArrayList<Integer> visitado=new ArrayList();    
    for (int i = 0; i < n; i++) 
    visitado.add(0);
    
    visitado.set(s,1);
    DFS(s,visitado,g6);
    return g6;
}
    void DFS(int s,ArrayList<Integer> visitado,Grafo g6)
    {
    for (int j = 0; j <ListaAdj.get(s).size();j++)
    {
        int v = ListaAdj.get(s).get(j).second();
        if(visitado.get(v)==0)
        {
        g6.AgregarArista(s, v);
         visitado.set(v,1) ;
         DFS(v,visitado,g6);
        }
    }
    return;
}
    
public Grafo DFS_I (int s) 
{
    Grafo g7= new Grafo (n,0,false,false);
    Stack<Integer> pila = new Stack<Integer>();
    ArrayList<Integer> visitado=new ArrayList();
    for (int i = 0; i < n; i++) 
    visitado.add(0);
    visitado.set(s, 1);
   pila.push(s);
   while (!pila.isEmpty())
    {
    int u=pila.pop();
        for (int j = 0; j <ListaAdj.get(u).size(); j++) {
           int v=ListaAdj.get(u).get(j).second();
           if (visitado.get(v)==0)
           {
               visitado.set(v, 1);
               pila.add(v);
               g7.AgregarArista(u, v);
           }
        }
    }
     return g7;
}  
 




// metodo para agregar peso a las aristas

public static double generarAleatorio(double x, double y) {
    double dif = y-x;
    return Math.random()*dif + x;
}



double valorArista(int u,int v){
  for(int i=0;i<ListaAdj.size();i++){
    int x = ListaAdj.get(u).get(i).second();
    if(x == v)
      return ListaAdj.get(u).get(i).first();
  }
  return 0.0;
}

void randomEdgeValues(double min, double max) {

    for(int i=0;i<this.ListaAdj.size();i++){
        for(int j=0;j<this.ListaAdj.get(i).size();j++){
            int v =  ListaAdj.get(i).get(j).second();
            if( i == v){
                continue;
            }

            if( v < i){
                double valor = valorArista(v,i);
                ListaAdj.get(i).get(j).w = valor;
                continue;
            }

            double nuevoPeso = generarAleatorio(min,max);
            ListaAdj.get(i).get(j).w = nuevoPeso;
        }
    }
}

Grafo Dijkstra(int nodo){
        int n = ListaAdj.size();
        Grafo g8 = new Grafo(n,0,false,false);
        distancia=new ArrayList<>(this.ListaAdj.size());
        ArrayList<Integer>  parent=new ArrayList<>(this.ListaAdj.size());

        for(int i=0;i<this.ListaAdj.size();i++){
            distancia.add(1000000.00);
            parent.add(i);
        }

        int u = nodo;
        //g8.Nodes.get(u).setName( "node_" + (u + 1) + " - 0.0 ");
        distancia.set(u,0.0);

        PriorityQueue < Par > pq = new PriorityQueue < Par >();

        pq.offer(new Par(0.0,u));
        while(pq.size()>0){
            Par top = pq.poll();
            double d = top.first();
            u =  top.second();

            if(distancia.get(u)<d){
                continue;
            }

            for(int i = 0; i < ListaAdj.get(u).size();i++){
                int v = (int) ListaAdj.get(u).get(i).second();
                double w = (double) ListaAdj.get(u).get(i).first();
                if( distancia.get(u) + w < distancia.get(v)){
                    distancia.set(v,distancia.get(u) + w);
                    pq.offer(new Par(distancia.get(v),v));
                    parent.set(v,u);
                }
            }

        }

        for(int i=0;i<n;i++){
            u = parent.get(i);
            String dstring = String.format("%.2f", distancia.get(i));
         //   g8.Nodes.get(i).setName( "node_" + (i + 1) + "-" + dstring);
            int v = i;
            if(u != v){
                g8.AgregarArista(u,v,0);
            }
        }

        //System.out.println(distancia);
        return g8;
    }

Grafo Kruskal_D(){
     int n = ListaAdj.size();
     Grafo g9 = new Grafo(n,0,false,false);


     Vector<Triple> EdgeList = new Vector<Triple>();
     for(int i=0;i<n;i++){

         for(int j=0;j<ListaAdj.get(i).size();j++){
             int v = ListaAdj.get(i).get((j)).second();
             double w = ListaAdj.get(i).get(j).first();
             EdgeList.add(new Triple(w,i,v));
        }
     }

     Collections.sort(EdgeList);

     double mst_cost = 0;           // all V are disjoint sets at the beginning
     Conjuntos conjuntos = new Conjuntos(n);
     for (int i = 0; i < EdgeList.size(); i++) {                   // for each edge, O(E)
         Triple front = EdgeList.get(i);
         if (!conjuntos.isSameSet(front.second(), front.third())) {          // check
             mst_cost += front.first();            // add the weight of e to MST
             g9.AgregarArista(front.second(),front.third(),front.first());
             conjuntos.unionSet(front.second(), front.third());            // link them
         }
     }
     System.out.println("Kruskal: " + mst_cost);
     return g9;
 }


void process(int vtx ,Vector<Boolean> taken, PriorityQueue<Triple> pq) { //  we do not need to use -ve sign to reverse the sort order
    taken.set(vtx, true);
    for (int j = 0; j < ListaAdj.get(vtx).size(); j++) {
        Par v = ListaAdj.get(vtx).get(j);
        if (!taken.get(v.second()))
            pq.offer(new Triple(v.first(), vtx,v.second()));
    }
}



Grafo Prim(){
    int n = ListaAdj.size();
    Grafo g = new Grafo(n,0,false,false);

    Vector<Boolean> taken = new Vector<Boolean>(); // global boolean flag to avoid cycle
    PriorityQueue<Triple> pq = new PriorityQueue<>();

    for(int i=0;i<n;i++){
        taken.add(false);
    }
    double mst_cost = 0.0;
    for(int i=0;i<n;i++){
        if(!taken.get(i)){
            process(i,taken,pq);
            while (!pq.isEmpty()) { // repeat until V vertices (E=V-1 edges) are taken
                Triple front = pq.peek(); pq.poll();
                int u = front.second(),v = front.third();
                double w = front.first();   // no need to negate id/weight
                if (!taken.get(v)) {           // we have not connected this vertex yet
                    mst_cost += w;
                    g.AgregarArista(u,v,w);
                    process(v,taken,pq); // take u, process all edges incident to u
                }
            }
        }
    }
    System.out.println("PRIM: " + mst_cost);
    System.out.println();
    return g;
}

 void numberCC(ArrayList<ArrayList<Integer>> adj,int u,ArrayList<Integer> visited){
        visited.set(u,1);
        for(int i=0;i<adj.get(u).size();i++){
            int v = adj.get(u).get(i);
            if(visited.get(v) == -1){
                numberCC(adj,v,visited);
            }
        }
    }
    int numberCC(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> visited = new ArrayList<>();
        int n = adj.size();
        for(int i=0;i<n;i++){
            visited.add(-1);
        }
        int cc = 0;
        for(int i=0;i<n;i++){
            if(visited.get(i) == -1){
                cc++;
                numberCC(adj,i,visited);
            }
        }
        return cc;
    }
    Grafo  Kruskal_I(){
        int n = ListaAdj.size();
        Grafo g = new Grafo(n,0,false,false);
        Vector<Triple> EdgeList = new Vector<>();


        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            for(int j=0;j<ListaAdj.get(i).size();j++){
                int v = ListaAdj.get(i).get(j).second();
                double w = ListaAdj.get(i).get(j).first();
                adj.get(i).add(v);
                EdgeList.add(new Triple(-w,i,v));
            }
        }


        Collections.sort(EdgeList);

        double mst_cost = 0.0;
        int cc = numberCC(adj);
        for(int i=0;i<EdgeList.size();i++){
            int u = EdgeList.get(i).second();
            int v = EdgeList.get(i).third();
            double w = - EdgeList.get(i).first();


            adj.get(u).remove((Integer)v);
            adj.get(v).remove((Integer)u);
            if(g.ChecaAristasRepetidos(u,v)){
                adj.get(u).add(v);
                adj.get(v).add(u);
                continue;
            }
            int new_cc = numberCC(adj);
            if(new_cc != cc){
                mst_cost += w;
                adj.get(u).add(v);
                adj.get(v).add(u);
                g.AgregarArista(u,v,w);
            }
        }
        System.out.println("KruskalI: " + mst_cost/2);
        return g;
    }







}








class Conjuntos {
    
    private Vector<Integer> p, rank, setSize;
    private int numSets;

    public Conjuntos(int N) {
        p = new Vector<Integer>(N);
        rank = new Vector<Integer>(N);
        setSize = new Vector<Integer>(N);
        numSets = N;
        
        for (int i = 0; i < N; i++) {
            
            p.add(i);
            rank.add(0);
            setSize.add(1);
        }
    }

    public int findSet(int i) {
        
        if (p.get(i) == i) return i;
        else 
        {
            int ret = findSet(p.get(i)); p.set(i, ret);
            return ret; 
        } 
    }

    
    
    public Boolean isSameSet(int i, int j) { return findSet(i) == findSet(j); }

    public void unionSet(int i, int j) {
        if (!isSameSet(i, j)) 
        { numSets--;
            int x = findSet(i), y = findSet(j);
            // rank is used to keep the tree short
            if (rank.get(x) > rank.get(y)) { p.set(y, x); setSize.set(x, setSize.get(x) + setSize.get(y)); }
            else                           { p.set(x, y); setSize.set(y, setSize.get(y) + setSize.get(x));
                if (rank.get(x) == rank.get(y)) rank.set(y, rank.get(y) + 1);
            } } }
    
    public int numDisjointSets() { return numSets; }
    
    public int sizeOfSet(int i) { return setSize.get(findSet(i)); }
}



