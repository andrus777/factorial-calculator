public class Division {
    int a;
    int b;

    public double divResult(){
        if(this.b == 0) {
            return -1;
        }
        return a/b;
    }
}
