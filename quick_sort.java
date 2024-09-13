Quick sort:Quick sort is a sorting algorithm in Java that uses a divide-and-conquer approach to sort an array by splitting it into two smaller arrays
{3,5,2,8,5}
the above array will be split as tree.For ex:{3,5}  {2,8,5}
and the above arry wil be split as {3,5}    {2}{8,5} 
the above steps will happen by following the sample code
for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot) 
            {
                i++;
                int temp=arr[i];//this step is swapping the values 
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];// this step is swapping the values
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;

        --> j value is index 0.
        -->     pi value is high value of array.
        --> i value is 1 less than low.

        -->It works on nlogn.
        -->Quick sort goes for recursion(Recursion in Java is a powerful programming technique that allows a function to call itself within the body of its own function. )