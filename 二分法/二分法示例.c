#define M 10//���峣�� 
#include <stdio.h>
int main(){
����int a[M]={-12,0,6,16,23,56,80,100,110,115};
����int low,mid,high,b,found;
����low=0;
����high=M-1;//Сϸ������ĸ���ȵ� 
����scanf("%d",&b);
����while(low <= high){
��������mid=(low+high)/2;
��������if(b == a[mid]){//ֱ�ӵ���ֱ���ж� 
������������found =1;
������������break;
��������}else if(b>a[mid]){
������������low=mid+1;//Ҫע��������Сϸ�� 
��������}else{
������������high=mid-1;
��������}
����}
����if(found ==1){
��������printf("The index of %d is %d",b,mid);
����}else{
��������printf("There is not %d",b);
����}
����return 0;
}
