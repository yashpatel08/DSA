// import java.io.*;
// import java.util.*;

// public class Main{

// public static void main(String[] args) throws Exception {
//   int[] arr = {10,20,30,40,50,60,70,80,90,100};
//   int data = 20;
//   int l = 0;
//   int h = arr.length-1;
//   int m = (l+h)/2;
  
//   while(l<=h){
//       if(data<arr[m]){
//           h=m-1;
//       }
//       else if(data>arr[m]){
//           l = m+1;
//       }
//       else{
//           System.out.println(m);
//           return;
//       }
//   }
//   System.out.println(-1);
//  }
 
// }

#include <iostream>
using namespace std;

int binarysearch(int arr[],int size,int key)
{
    int start=0;
    int end=size-1;
    int mid =(start+end)/2;
    while(start<=end)
    {
        if(arr[mid]==key)
        {
            return mid;
        }

        // go to right side 
        if(key>arr[mid])
        {
            start=mid+1;
        }
        else{
                end=mid-1;
        }
        mid=(start+end)/2;
    }
    return -1;        
}

int main()
{
    int even[7]={2,3,4,6,5,7,8};
    int odd[6]={5,3,4,6,8,16};

    int evenindex=binarysearch(even,7,2);

    cout<<"index of 2 is "<<evenindex<<endl;

int oddindex=binarysearch(odd, 6, 8);
cout<<"index of 8 is "<<oddindex<<endl;
}
