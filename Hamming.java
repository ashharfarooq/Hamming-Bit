public class Hamming {
    public static void main(String[] args) {
        int [] inp ={1,1,0,0,0,0,1,1,1,0,0,1};
        int [] msg ={2,9,9,1,9,1,0,0,9,0,0,1,1,1,0,0,9,1};
        int set = 0;
        int hamm = 0;
        String paristyscheme = "ODD";
        int msglength=msg.length;
        // for h1
        for(int i=3;i<msglength;i=i+2){
            set = set + msg[i];
        }
        if(paristyscheme.equals("ODD")){
            int r=set%2;
            if(r!=0){
                hamm =0;            }
        }
        else{
            hamm =1;
        }
        System.out.println(hamm);
        System.out.println(set);

        //for h2
        for(int i=2;i<msglength;i+=4){
            set= set+msg[i];
            if(i+1<msglength){
                set=set+msg[i+1];
            }
        }
        if(paristyscheme.equals("ODD")){
             int r=set%2;
            if(r!=0){
                hamm =0;            }
        }
        else{
            hamm =1;
        }
        System.out.println(hamm);
        System.out.println(set);

        //for h3
        for(int i=3;i<msglength;i+=8){
            set= set+msg[i];
            if(i+1<msglength){
                set=set+msg[i+1];
            }
            if(i+2<msglength){
                set=set+msg[i+2];
            }
            if(i+3<msglength){
                set=set+msg[i+3];
            }
        }
        if(paristyscheme.equals("ODD")){
             int r=set%2;
            if(r!=0){
                hamm =0;            }
        }
        else{
            hamm =1;
        }
        System.out.println(hamm);
        System.out.println(set);

    }
    
}
