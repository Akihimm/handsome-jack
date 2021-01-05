#include<stdio.h>

	 void exchange(int p[],int n){
	 	int *m,b;
	 	for(m=p+n-1;p<m;m--,p++){
	 		b=*m;
	 		*m=*p;
	 		*p=b;
		 }
	 	
	}
	int main(){
		int a[10],i,l;
		for(i=0;i<10;i++){
		
		scanf("%d",&a[i]);}
		exchange(a,10);
		for(l=0;l<10;l++)
		printf("%d",a[l]);
		return 0;
	}
