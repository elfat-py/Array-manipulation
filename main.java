{

    public static int[] reverseArray(int []array)
    {
        for (int i=0; i<=array.length/2; i++)
        {
            int temp = array[0];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;

        }
        return array;
    }

    public static int[] fillWithRandom(int []array)
    {
        for (int i = 0; i<array.length; i++)
        {
            array[i]=(int)(Math.random()*100);
        }
        return array;
    }
    public static int[] sortArray(int []array){
        for (int i =0; i<array.length; i++)
        {
            for (int j= 0; j<array.length; j++)
            {
                if (array[i]>array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }
            }
        }
        return array;
    }



    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        int [] returnedArray =fillWithRandom(array);
        int [] reversedArray = reverseArray(returnedArray);
        int [] sortedArray = sortArray(returnedArray);


        System.out.println("The array with random numbers is: ");
        for (int i = 0; i<array.length; i++)
        {
            System.out.print(returnedArray[i]+" ");
        }
        System.out.println();

        System.out.println("The reversed array is: ");
        for (int i = 0; i<array.length; i++)
        {
            System.out.print(reversedArray[i]+" ");
        }
        System.out.println();

        System.out.println("The sorted array: ");
        for (int i = 0; i<array.length; i++)
        {
            System.out.print(sortedArray[i]+" ");
        }
        System.out.println();

    }
}
