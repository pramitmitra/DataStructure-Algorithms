package Easy;

public  class FrequencyInteger {
    static void frequencyCounter(int []a) {
        int []arr=a;
        int element=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            int tempElement=arr[i];
            int tempCount=0;
            for (int j=0;j<arr.length;j++)
                if (arr[j]==tempElement)
                    tempCount++;
            if (tempCount>count)
            {
                element=tempElement;
                count=tempCount;
            }
        }
        System.out.printf("\n %d element appeared %d time", element, count);
    }

    public static void main(String args[])
    {
        int []arr=new int[]{9,9,5,5,6,7,9};
        frequencyCounter(arr);
    }
}
