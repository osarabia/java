public class QuickUnionWeightedUF{
    private int[] id;
    private int[] sz;

    public QuickUnionWeightedUF(int N){
        id = new int[N];
        for(int i =0;i<N;i++){
            id[i] = i;
            sz[i] = 0;
        }
    }

    private int root(int i){
        while(i != id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p,int q){
        return root(p) == root(p);
    }

    public void union(int p, int q){
        int r_p = root(p);
        int r_q = root(p);
        if ( r_q == r_q ) return;

        if (sz[r_p] < sz[r_q] ){
            id[r_p] = r_q;
            sz[r_q] += sz[r_p]; 
        }else{
            id[r_q] = r_p;
            sz[r_p] += sz[r_q];
        }
    }
}
