
package GraphLibrary;
import java.io.*;
import java.util.Locale;


public class Main {
    public static void main(String[] args) throws IOException {

                //PROYECTO 1
        //---------------------------------------------------------------------------------------
        /* 
                      //ERDOS 30
        Grafo g1= Grafo.genErdosRenyi(30,50,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/ERDOS30.csv");
        g1.imprimirGrafo();
        Imprime.write(g1.imprimirGrafo());
        Imprime.close ();

                      //ERDOS 100
          Grafo g1= Grafo.genErdosRenyi(100,160,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/ERDOS100.csv");
        g1.imprimirGrafo();
        Imprime.write(g1.imprimirGrafo());
        Imprime.close ();      

         // ERDOS 500
          Grafo g1= Grafo.genErdosRenyi(500,840,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/ERDOS500.csv");
        g1.imprimirGrafo();
        Imprime.write(g1.imprimirGrafo());
        Imprime.close ();    

                       //GILBERT 30
        Grafo g2= Grafo.genGilbert(30,0.9,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/GILBERT30.csv");
        g2.imprimirGrafo();
        Imprime.write(g2.imprimirGrafo());
        Imprime.close ();      

                       //GILBERT100
        Grafo g2= Grafo.genGilbert(100,0.2,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/GILBERT100.csv");
        g2.imprimirGrafo();
        Imprime.write(g2.imprimirGrafo());
        Imprime.close ();    

        Grafo g2= Grafo.genGilbert(500,0.01,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/GILBERT500.csv");
        g2.imprimirGrafo();
        Imprime.write(g2.imprimirGrafo());
        Imprime.close (); 

                 //GEOGRAFICO 30
        Grafo g3= Grafo.genGeografico(30,0.4,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/GEOGRAFICO30.csv");
        g3.imprimirGrafo();
        Imprime.write(g3.imprimirGrafo());
        Imprime.close ();

                        //GEOGRAFICO 100
          Grafo g3= Grafo.genGeografico(100,0.6,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/GEOGRAFICO100.csv");
        g3.imprimirGrafo();
        Imprime.write(g3.imprimirGrafo());
        Imprime.close ();


                        //GEOGRAFICO 500
          Grafo g3= Grafo.genGeografico(500,0.05,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/GEOGRAFICO500.csv");
        g3.imprimirGrafo();
        Imprime.write(g3.imprimirGrafo());
        Imprime.close ();

        */
        //BARABASI 30
          /**

          Grafo g1= Grafo.genErdosRenyi(30,50,false,false);  
          g1.randomEdgeValues(1,50);
          PrintWriter Imprime=new PrintWriter("C:/Proyecto3/ERDOS30.csv");
          Imprime.write(g1.imprimirGrafoConPesos());
          Imprime.close ();

          Grafo g1Dijkstra = g1.Dijkstra(0);
          g1Dijkstra.distancia = g1.distancia;
          Imprime = new PrintWriter("C:/Proyecto3/ERDOS30_PESOS.csv");
          Imprime.write(g1Dijkstra.imprimirGrafoDijkstra());
          Imprime.close ();


          
        /*
                //BARABASI 100
          Grafo g4= Grafo.genBarabasiAlbert(100,20,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/BARABASI100.csv");
        g4.imprimirGrafo();
        Imprime.write(g4.imprimirGrafo());
        Imprime.close ();

             //BARABASI 500
          Grafo g4= Grafo.genBarabasiAlbert(500,5,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto1/BARABASI500.csv");
        g4.imprimirGrafo();
        Imprime.write(g4.imprimirGrafo());
        Imprime.close ();
        */



                //PROYECTO 2
         //--------------------------------------------------------------------------------       
          /*      Grafo de Erdos con 30 vertices

        Grafo g1= Grafo.genErdosRenyi(30,45,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/ERDOS30.csv");
        g1.imprimirGrafo();
        Imprime.write(g1.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/ERDOS30BFS.csv");
        Grafo g5=g1.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/ERDOS30DFS_R.csv");
        Grafo g6=g1.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/ERDOS30DFS_I.csv");
        Grafo g7=g1.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();


                //Grafo de Erdos con 100 vertices 

                  Grafo g1= Grafo.genErdosRenyi(100,160,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/ERDOS100.csv");
        g1.imprimirGrafo();
        Imprime.write(g1.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/ERDOS100BFS.csv");
        Grafo g5=g1.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/ERDOS100DFS_R.csv");
        Grafo g6=g1.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/ERDOS100DFS_I.csv");
        Grafo g7=g1.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();


          //Grafo de Erdos con 500 vertices

                    Grafo g1= Grafo.genErdosRenyi(500,650,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/ERDOS500.csv");
        g1.imprimirGrafo();
        Imprime.write(g1.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/ERDOS500BFS.csv");
        Grafo g5=g1.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/ERDOS500DFS_R.csv");
        Grafo g6=g1.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();


        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/ERDOS500DFS_I.csv");
        Grafo g7=g1.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();




          //Grafo de genGilbert con 30 vertices

          Grafo g2= Grafo.genGilbert(30,0.5,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/GILBERT30.csv");
        g2.imprimirGrafo();
        Imprime.write(g2.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/GILBERT30BFS.csv");
        Grafo g5=g2.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/GILBERT30DFS_R.csv");
        Grafo g6=g2.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/GILBERT30DFS_I.csv");
        Grafo g7=g2.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();




          //Grafo de genGilbert con 100 vertices

          Grafo g2= Grafo.genGilbert(100,0.2,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/GILBERT100.csv");
        g2.imprimirGrafo();
        Imprime.write(g2.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/GILBERT100BFS.csv");
        Grafo g5=g2.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/GILBERT100DFS_R.csv");
        Grafo g6=g2.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/GILBERT100DFS_I.csv");
        Grafo g7=g2.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();

          //Grafo de genGilbert con 500 vertices

          Grafo g2= Grafo.genGilbert(500,0.01,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/GILBERT500.csv");
        g2.imprimirGrafo();
        Imprime.write(g2.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/GILBERT500BFS.csv");
        Grafo g5=g2.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/GILBERT500DFS_R.csv");
        Grafo g6=g2.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/GILBERT500DFS_I.csv");
        Grafo g7=g2.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();



          //Grafo de GEOGRAFICO SIMPLE con 30 vertices

          Grafo g3= Grafo.genGeografico(30,0.9,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/GEOGRAFICO30.csv");
        g3.imprimirGrafo();
        Imprime.write(g3.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/GEOGRAFICO30BFS.csv");
        Grafo g5=g3.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/GEOGRAFICO30DFS_R.csv");
        Grafo g6=g3.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/GEOGRAFICO30DFS_I.csv");
        Grafo g7=g3.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();



           //Grafo de GEOGRAFICO SIMPLE con 100 vertices

          Grafo g3= Grafo.genGeografico(100,0.6,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/GEOGRAFICO100.csv");
        g3.imprimirGrafo();
        Imprime.write(g3.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/GEOGRAFICO100BFS.csv");
        Grafo g5=g3.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/GEOGRAFICO100DFS_R.csv");
        Grafo g6=g3.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/GEOGRAFICO100DFS_I.csv");
        Grafo g7=g3.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();



           //Grafo de GEOGRAFICO SIMPLE con 500 vertices

          Grafo g3= Grafo.genGeografico(500,0.08,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/GEOGRAFICO500.csv");
        g3.imprimirGrafo();
        Imprime.write(g3.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/GEOGRAFICO500BFS.csv");
        Grafo g5=g3.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/GEOGRAFICO500DFS_R.csv");
        Grafo g6=g3.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/GEOGRAFICO500DFS_I.csv");
        Grafo g7=g3.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();



           //Grafo de BARABASI con 30 vertices

          Grafo g4= Grafo.genBarabasiAlbert(30,12,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/BARABASI30.csv");
        g4.imprimirGrafo();
        Imprime.write(g4.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/BARABASI30BFS.csv");
        Grafo g5=g4.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/BARABASI30DFS_R.csv");
        Grafo g6=g4.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/BARABASI30DFS_I.csv");
        Grafo g7=g4.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();



            //Grafo de BARABASI con 100 vertices

          Grafo g4= Grafo.genBarabasiAlbert(100,15,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/BARABASI100.csv");
        g4.imprimirGrafo();
        Imprime.write(g4.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/BARABASI100BFS.csv");
        Grafo g5=g4.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/BARABASI100DFS_R.csv");
        Grafo g6=g4.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();

        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/BARABASI100DFS_I.csv");
        Grafo g7=g4.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();



             //Grafo de BARABASI con 500 vertices

          Grafo g4= Grafo.genBarabasiAlbert(500,5,false,false);  

        PrintWriter Imprime=new PrintWriter("C:/Proyecto2/BARABASI500.csv");
        g4.imprimirGrafo();
        Imprime.write(g4.imprimirGrafo());
        Imprime.close ();

        PrintWriter ImprimeBFS=new PrintWriter("C:/Proyecto2/BARABASI500BFS.csv");
        Grafo g5=g4.BFS(0);
        g5.imprimirGrafo();
        ImprimeBFS.write(g5.imprimirGrafo());
        ImprimeBFS.close ();

        PrintWriter ImprimeDFS_R=new PrintWriter("C:/Proyecto2/BARABASI500DFS_R.csv");
        Grafo g6=g4.DFS_R(0);
        g6.imprimirGrafo();
        ImprimeDFS_R.write(g6.imprimirGrafo());
        ImprimeDFS_R.close ();
        *//*
        PrintWriter ImprimeDFS_I=new PrintWriter("C:/Proyecto2/BARABASI500DFS_I.csv");
        Grafo g7=g4.DFS_I(0);
        g7.imprimirGrafo();
        ImprimeDFS_I.write(g7.imprimirGrafo());
        ImprimeDFS_I.close ();
         */
                //System.out.println(Grafo.generarAleatorio(10, 20));

                
                
          //PROYECTO 3
         //-------------------------------------------------------------------------------------------     
/*
        
         ERDOS 30
         
        Grafo g1= Grafo.genErdosRenyi(30,50,false,false);  
        g1.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/ERDOS30_PESOS.csv");
        Imprime.write(g1.imprimirGrafoConPesos());
        Imprime.close ();

         DIJKSTRA ERDOS 30
         
        Grafo g1Dijkstra = g1.Dijkstra(0);
        g1Dijkstra.distancia = g1.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/ERDOS30_PESOS_DIJKSTRA.csv");
        Imprime.write(g1Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();  
        
        ERDOS 100
         
        Grafo g1= Grafo.genErdosRenyi(100,125,false,false);  
        g1.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/ERDOS100_PESOS.csv");
        Imprime.write(g1.imprimirGrafoConPesos());
        Imprime.close ();
         
        DIJKSTRA ERDOS 100
         
        Grafo g1Dijkstra = g1.Dijkstra(0);
        g1Dijkstra.distancia = g1.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/ERDOS100_PESOS_DIJKSTRA.csv");
        Imprime.write(g1Dijkstra.imprimirGrafoDijkstra());
        Imprime.close (); 
        
        ERDOS 500
         
        Grafo g1= Grafo.genErdosRenyi(500,480,false,false);  
        g1.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/ERDOS500_PESOS.csv");
        Imprime.write(g1.imprimirGrafoConPesos());
        Imprime.close ();

        DIJKSTRA ERDOS 500 
         
        Grafo g1Dijkstra = g1.Dijkstra(0);
        g1Dijkstra.distancia = g1.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/ERDOS500_PESOS_DIJKSTRA.csv");
        Imprime.write(g1Dijkstra.imprimirGrafoDijkstra());
        Imprime.close (); 
        

        //GILBERT 30
         
        Grafo g2= Grafo.genGilbert(30,0.6,false,false);  
        g2.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/GILBERT30_PESOS.csv");
        Imprime.write(g2.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA GILBERT 30 
         
        Grafo g2Dijkstra = g2.Dijkstra(0);
        g2Dijkstra.distancia = g2.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/GILBERT30_PESOS_DIJKSTRA.csv");
        Imprime.write(g2Dijkstra.imprimirGrafoDijkstra());
        Imprime.close (); 


         //GILBERT 100
         
        Grafo g2= Grafo.genGilbert(100,0.1,false,false);  
        g2.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/GILBERT100_PESOS.csv");
        Imprime.write(g2.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA GILBERT 100 
         
        Grafo g2Dijkstra = g2.Dijkstra(0);
        g2Dijkstra.distancia = g2.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/GILBERT100_PESOS_DIJKSTRA.csv");
        Imprime.write(g2Dijkstra.imprimirGrafoDijkstra());
        Imprime.close (); 



         //GILBERT 500
         
        Grafo g2= Grafo.genGilbert(500,0.009,false,false);  
        g2.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/GILBERT500_PESOS.csv");
        Imprime.write(g2.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA GILBERT 500 
         
        Grafo g2Dijkstra = g2.Dijkstra(0);
        g2Dijkstra.distancia = g2.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/GILBERT500_PESOS_DIJKSTRA.csv");
        Imprime.write(g2Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();


         //GEOGRAFICO 30
         
        Grafo g3= Grafo.genGeografico(30,0.4,false,false);  
        g3.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/GEOGRAFICO30_PESOS.csv");
        Imprime.write(g3.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA GEOGRAFICO 30 
         
        Grafo g3Dijkstra = g3.Dijkstra(0);
        g3Dijkstra.distancia = g3.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/GEOGRAFICO30_PESOS_DIJKSTRA.csv");
        Imprime.write(g3Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();


         //GEOGRAFICO 100
         
        Grafo g3= Grafo.genGeografico(100,0.3,false,false);  
        g3.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/GEOGRAFICO100_PESOS.csv");
        Imprime.write(g3.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA GEOGRAFICO 100 
         
        Grafo g3Dijkstra = g3.Dijkstra(0);
        g3Dijkstra.distancia = g3.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/GEOGRAFICO100_PESOS_DIJKSTRA.csv");
        Imprime.write(g3Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();



         //GEOGRAFICO 500
         
        Grafo g3= Grafo.genGeografico(500,0.05,false,false);  
        g3.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/GEOGRAFICO500_PESOS.csv");
        Imprime.write(g3.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA GEOGRAFICO 500 
         
        Grafo g3Dijkstra = g3.Dijkstra(0);
        g3Dijkstra.distancia = g3.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/GEOGRAFICO500_PESOS_DIJKSTRA.csv");
        Imprime.write(g3Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();

         //BARABASI 30
         
        Grafo g4= Grafo.genBarabasiAlbert(30,10,false,false);  
        g4.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/BARABASI30_PESOS.csv");
        Imprime.write(g4.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA BARABASI 30 
         
        Grafo g3Dijkstra = g4.Dijkstra(0);
        g3Dijkstra.distancia = g4.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/BARABASI30_PESOS_DIJKSTRA.csv");
        Imprime.write(g3Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();

         //BARABASI 100
         
        Grafo g4= Grafo.genBarabasiAlbert(100,20,false,false);  
        g4.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/BARABASI100_PESOS.csv");
        Imprime.write(g4.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA BARABASI 100 
         
        Grafo g3Dijkstra = g4.Dijkstra(0);
        g3Dijkstra.distancia = g4.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/BARABASI100_PESOS_DIJKSTRA.csv");
        Imprime.write(g3Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();
     
         //BARABASI 500
         
        Grafo g4= Grafo.genBarabasiAlbert(500,5,false,false);  
        g4.randomEdgeValues(1,90);
        PrintWriter Imprime=new PrintWriter("C:/Proyecto3/BARABASI500_PESOS.csv");
        Imprime.write(g4.imprimirGrafoConPesos());
        Imprime.close ();

        //DIJKSTRA BARABASI 500 
         
        Grafo g3Dijkstra = g4.Dijkstra(0);
        g3Dijkstra.distancia = g4.distancia;
        Imprime = new PrintWriter("C:/Proyecto3/BARABASI500_PESOS_DIJKSTRA.csv");
        Imprime.write(g3Dijkstra.imprimirGrafoDijkstra());
        Imprime.close ();
    
   */  
                //PROYECTO 4
         //----------------------------------------------------------------------------------------- 
       
         //ERDOS 30
         
          Grafo g1= Grafo.genErdosRenyi(30,54,false,false);  
          g1.randomEdgeValues(1,90);
          PrintWriter Imprime=new PrintWriter("C:/Proyecto4/ERDOS30.csv");
          Imprime.write(g1.imprimirGrafoConPesos());
          Imprime.close ();

         Grafo g1KruskalD = g1.Kruskal_D();
         Imprime = new PrintWriter("C:/Proyecto4/ERDOS30_KruskalD.csv");
         g1KruskalD.imprimirGrafoConPesos();
         g1KruskalD.imprimirGrafo();
         Imprime.write(g1KruskalD.imprimirGrafoConPesos());
         Imprime.close ();   

          Grafo g1KruskalI = g1.Kruskal_I();
          Imprime = new PrintWriter("C:/Proyecto4/ERDOS30_Kruskal_I.csv");
          Imprime.write(g1KruskalI.imprimirGrafoConPesos());
          Imprime.close ();           
          
          Grafo g1Prim = g1.Prim();
          Imprime = new PrintWriter("C:/Proyecto4/ERDOS30_Prim.csv");
          Imprime.write(g1Prim.imprimirGrafoConPesos());
          Imprime.close (); 

          //ERDOS 100
          
          g1= Grafo.genErdosRenyi(100,250,false,false);  
          g1.randomEdgeValues(1,90);
          Imprime=new PrintWriter("C:/Proyecto4/ERDOS100.csv");
          Imprime.write(g1.imprimirGrafoConPesos());
          Imprime.close ();

         g1KruskalD = g1.Kruskal_D();
         Imprime = new PrintWriter("C:/Proyecto4/ERDOS100_KruskalD.csv");
         g1KruskalD.imprimirGrafoConPesos();
         g1KruskalD.imprimirGrafo();
         Imprime.write(g1KruskalD.imprimirGrafoConPesos());
         Imprime.close ();   

          g1KruskalI = g1.Kruskal_I();
          Imprime = new PrintWriter("C:/Proyecto4/ERDOS100_Kruskal_I.csv");
          Imprime.write(g1KruskalI.imprimirGrafoConPesos());
          Imprime.close ();           
          
          g1Prim = g1.Prim();
          Imprime = new PrintWriter("C:/Proyecto4/ERDOS100_Prim.csv");
          Imprime.write(g1Prim.imprimirGrafoConPesos());
          Imprime.close (); 

          //ERDOS 500
          
          g1= Grafo.genErdosRenyi(500,800,false,false);  
          g1.randomEdgeValues(1,90);
           Imprime=new PrintWriter("C:/Proyecto4/ERDOS500.csv");
          Imprime.write(g1.imprimirGrafoConPesos());
          Imprime.close ();

         g1KruskalD = g1.Kruskal_D();
         Imprime = new PrintWriter("C:/Proyecto4/ERDOS500_KruskalD.csv");
         g1KruskalD.imprimirGrafoConPesos();
         g1KruskalD.imprimirGrafo();
         Imprime.write(g1KruskalD.imprimirGrafoConPesos());
         Imprime.close ();   

          g1KruskalI = g1.Kruskal_I();
          Imprime = new PrintWriter("C:/Proyecto4/ERDOS500_Kruskal_I.csv");
          Imprime.write(g1KruskalI.imprimirGrafoConPesos());
          Imprime.close ();           
          
          g1Prim = g1.Prim();
          Imprime = new PrintWriter("C:/Proyecto4/ERDOS500_Prim.csv");
          Imprime.write(g1Prim.imprimirGrafoConPesos());
          Imprime.close (); 
     
          
        //GILBERT 30
         
        Grafo g2= Grafo.genGilbert(30,0.3,false,false);  
        g2.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/GILBERT30_PESOS.csv");
        Imprime.write(g2.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalD = g2.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT30_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();
        

        g1KruskalI = g2.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT30_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g2.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT30_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close (); 

        //GILBERT 100
        
        g2= Grafo.genGilbert(100,0.3,false,false);  
        g2.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/GILBERT100_PESOS.csv");
        Imprime.write(g2.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalD = g2.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT100_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalI = g2.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT100_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g2.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT100_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close (); 

        //GILBERT 500
        
        g2= Grafo.genGilbert(500,0.09,false,false);  
        g2.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/GILBERT500_PESOS.csv");
        Imprime.write(g2.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalD = g2.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT500_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalI = g2.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT500_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g2.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/GILBERT500_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close (); 

        //GEOGRAFICO 30
        
        Grafo g3= Grafo.genGeografico(30,0.2,false,false);  
        g3.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/GEOGRAFICO30_PESOS.csv");
        Imprime.write(g3.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalD = g3.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO30_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();

        g1KruskalI = g3.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO30_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g3.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO30_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close (); 

        //GEOGRAFICO 100
        
        g3= Grafo.genGeografico(100,0.2,false,false);  
        g3.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/GEOGRAFICO100_PESOS.csv");
        Imprime.write(g3.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalD = g3.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO100_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalI = g3.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO100_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g3.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO100_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close (); 

        //GEOGRAFICO 500
        
        g3= Grafo.genGeografico(500,0.1,false,false);  
        g3.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/GEOGRAFICO500_PESOS.csv");
        Imprime.write(g3.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalD = g3.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO500_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalI = g3.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO500_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g3.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/GEOGRAFICO500_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close ();
        
        
        //BARABASI 30
        
        Grafo g4= Grafo.genBarabasiAlbert(30,12,false,false);  
        g4.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/BARABASI30_PESOS.csv");
        Imprime.write(g4.imprimirGrafoConPesos());
        Imprime.close ();
        
         g1KruskalD = g4.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI30_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();
        
        g1KruskalI = g4.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI30_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g4.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI30_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close ();
       
        //BARABASI 100

        g4= Grafo.genBarabasiAlbert(100,12,false,false);  
        g4.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/BARABASI100_PESOS.csv");
        Imprime.write(g4.imprimirGrafoConPesos());
        Imprime.close ();

        g1KruskalD = g4.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI100_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();

        g1KruskalI = g4.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI100_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           
 
        g1Prim = g4.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI100_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close ();
       
        //BARABASI 500
        
        g4= Grafo.genBarabasiAlbert(500,15,false,false);  
        g4.randomEdgeValues(1,90);
        Imprime=new PrintWriter("C:/Proyecto4/BARABASI500_PESOS.csv");
        Imprime.write(g4.imprimirGrafoConPesos());
        Imprime.close ();
         
        g1KruskalD = g4.Kruskal_D();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI500_KruskalD.csv");
        g1KruskalD.imprimirGrafoConPesos();
        g1KruskalD.imprimirGrafo();
        Imprime.write(g1KruskalD.imprimirGrafoConPesos());
        Imprime.close ();

        g1KruskalI = g4.Kruskal_I();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI500_Kruskal_I.csv");
        Imprime.write(g1KruskalI.imprimirGrafoConPesos());
        Imprime.close ();           

        g1Prim = g4.Prim();
        Imprime = new PrintWriter("C:/Proyecto4/BARABASI500_Prim.csv");
        Imprime.write(g1Prim.imprimirGrafoConPesos());
        Imprime.close ();

    }

}



