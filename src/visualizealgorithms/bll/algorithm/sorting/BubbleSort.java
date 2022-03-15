package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {


    public BubbleSort() {
        super("BubbleSort", "Slow 0(N^2) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] b = (int[]) super.getData();

        // 0(N^2)
        for (int i = 1; i < b.length; i++ ){ //0(N)
            for (int j = 0; j < b.length - i; j++){ // 0(N)
                if (b[j] > b[j + 1]){
                    int tmp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = tmp;
                }
            }
        }
    }
}
