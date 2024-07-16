public class BubbleSort {
        public static void main(String [] args) {
            int [] A = {5,3,9,2,7,1,4} ;
            int N = A.length ;
            int k=2 ;
            for(int i=0 ; i<N ; i++){
                for(int j=0 ; j<N-i-1 ; j++){
//Swapping
                    if(A[j]>A[j+1]){
                        int temp = A[j] ;
                        A[j] = A[j+1] ;
                        A[j+1] = temp ;
                    }
                }
            }
            for(int i=0 ; i<N ; i++){
                System.out.print(A[i] + " ");
            }
            System.out.println();
            System.out.println(A[N-k]);
        }
    }

