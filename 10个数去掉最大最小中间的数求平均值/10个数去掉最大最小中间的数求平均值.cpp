#include<stdio.h>
		 float max(float a[]){
		 	int m;
		 	float n;
		 	n=a[0];
		 	for(m=0;m<10;m++){
			 
		 		if(n<=a[m])
		 		n=a[m];
}
		 	return n;
		 } 		 
	float min(float a[10]){
		 	int m;
		 float n;
		 	n=a[0];
		 	for(m=0;m<10;m++){
		 		if(n>=a[m])
		 		n=a[m];
			 }
		 	return n;}
		 	int main(){
		 		float z,x;
		 		int c;
		 		float k;
		 		int o;
		 		o=0;
		 		float b[10];
		 		printf("请输入十个数\n");
		 		scanf("%f%f%f%f%f%f%f%f%f",&b[0],&b[1],&b[2],&b[3],&b[4],&b[5],&b[6],&b[7],&b[8],&b[9]);
		 		for(c=0;c<10;c++){
		 			o=o+b[c];
				 }
			z=max(b);
			x=min(b);
		 		k=z+x;
		 		float lll;
		 		lll=((o-k)/8);   
		 		printf("您的得分为%.3f",lll);
		 		return 0;
			 }
