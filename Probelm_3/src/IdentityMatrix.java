public class IdentityMatrix extends Matrix{
    public IdentityMatrix(int size) {
        super(size, size);
        for(int i = 0; i < size; i++) this.data[i][i] = 1;
    }


}
