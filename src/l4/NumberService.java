package l4;

public class NumberService {
    public int rangeSumCounter(int start,int finish){
        int rangeSum = 0;

        if(start < finish) {
            System.out.println("start < finish");
            while (start <= finish) {
                System.out.print(start + " ");
                rangeSum += start;
                start++;
            }
        }
            else {
                System.out.println("start > finish");
                while (start >= finish){
                    System.out.print(start + " ");
                    rangeSum += start;
                    start--;
                }
            }
            return rangeSum;
        }
        public int evenCounter(int start, int finish){
        int evenCount = 0;

        if(start<finish) {
            while (start < finish) {
                if (start % 2 == 0) {
                    evenCount++;
                }
                start++;
            }
        }
        else {
                while(start>finish){
                    if(finish %2==0){
                        evenCount++;
                    }
                    finish++;
                }

            }
            return evenCount;
        }
    }

