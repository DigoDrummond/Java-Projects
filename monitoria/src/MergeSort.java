public class MergeSort{
    private int[] array;

    MergeSort(int[] array) {
        this.array = array;
    }
    public void mergeSort(int esq, int dir){
        if(esq<dir){
            int meio = (esq+dir)/2;
            mergeSort(esq,meio);
            mergeSort(meio+1,dir);
            intercalar(esq,meio,dir);
        }
    }
    public void intercalar(int esq,int meio, int dir){
        int nEsq = (meio+1)-esq;
        int nDir = dir-meio;

        int[] arrayEsq = new int[nEsq +1];
        int[] arrayDir = new int[nDir+1];

        arrayEsq[nEsq] = arrayDir[nDir] = 0x7FFFFFFF;

        int iEsq,iDir,i;

        for(iEsq = 0;iEsq<nEsq;iEsq++){
            arrayEsq[iEsq] = array[esq+iEsq];
        }
        for(iDir = 0;iDir<nDir;iDir++){
            arrayDir[iDir] = array[(meio+1) + iDir];
        }

        for(iEsq=iDir=0,i = esq;i<=dir;i++)
            array[i] = (arrayEsq[iEsq] <= arrayDir[iDir]) ? arrayEsq[iEsq++] : arrayDir[iDir++];

    }
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 2, 6, 9, 3, 5};
        MergeSort a = new MergeSort(array);
        a.mergeSort(0, array.length - 1);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

}