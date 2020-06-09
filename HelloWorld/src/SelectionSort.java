public class SelectionSort {
    public static void main(String[] args) {
        
    }
    public static void selectionsort(int[]dizi){
        for(int i =0; i<dizi.length;i++){
            
            
            int oankienkucuksayi= dizi[i];
            int oankienkucukelemaninindexi = i;
            
            for(int j = i+1; j<dizi.length;j++){
                if (oankienkucuksayi >dizi[j]){
                    oankienkucuksayi = dizi[j];
                    oankienkucukelemaninindexi = j;
                }
            }
            
            if(oankienkucukelemaninindexi !=i){
                
            }
        }
    }


}
