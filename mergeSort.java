import java.util.*;
class mergeSort{
public static void main(String args[]){
      /* void merge(int arr[],int l,int m,int r);
        void sort(int arr[],int l,int r);
         void printArray(int arr[]);*/

         int arr[]={5,8,9,6,2,4};
         System.out.println("\n array before sort\n");
         printArray(arr);
         sort(arr,0,5);
       System.out.println("\nsorted array\n");
      printArray(arr);
}
public static void merge(int arr[],int l,int m,int r){
int n1=m+1-l;
int n2=r-m;
int L[]=new int[n1];
int R[]=new int[n2];
for(int i=0;i<n1;++i)
L[i]=arr[l+i];
for(int j=0;j<n2;++j)
R[j]=arr[m+1+j];
int i=0,j=0;
int k=l;
while(i<n1 && j<n2){
    if(L[i]<=R[j]){
        arr[k]=L[i];
          i++;
}
else{
     arr[k]=R[j];
       j++;
}
k++;
}
while(i<n1){
   arr[k]=L[i];
   i++;
   k++;
}
while(j<n2){
  arr[k]=R[j];
   j++;
   k++;
}
}
 public static void sort(int arr[], int l, int r){
     
if(l<r){
int m=l+(r-l)/2;
sort(arr,l,m);
sort(arr,m+1,r);
merge(arr,l,m,r);
}
}
public static void printArray(int arr[]){
for(int i=0;i<(arr.length);++i)
   System.out.println(" "+arr[i]);
System.out.println();

}
/*public static void main(String args[]){
void merge(int arr[],int l,int m,int r);
 void sort(int arr[],int l,int r);
 void printArray(int arr[]);
int arr[]={5,8,9,6,2,4};
System.out.println("\n array before sort\n");
print(arr);
sort(arr,0,arr.length-1);
System.out.println("\nsorted array\n");
printArray(arr);
}*/
}