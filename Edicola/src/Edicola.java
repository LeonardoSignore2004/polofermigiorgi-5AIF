public class Edicola {
    public static int numQuaderni;
    public static int numMatite;
    
    public Edicola (int numQuaderni,int numMatite){
        this.numQuaderni = numQuaderni;
        this.numMatite = numMatite;
    }

    public static int getNumQuaderni() {
        return numQuaderni;
    }

    public static void setNumQuaderni(int numQuaderni) {
        Edicola.numQuaderni = numQuaderni;
    }

    public static int getNumMatite() {
        return numMatite;
    }

    public static void setNumMatite(int numMatite) {
        Edicola.numMatite = numMatite;
    }

    
    
}
