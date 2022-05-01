#include<stdio.h>
#include<stdlib.h>
void solveRec(char ch[]){
	if(ch[0]=='\0')
		return;
	if(ch[0]==ch[1]){
		for(int i=1;ch[i]!='\0';i++){
			ch[i]=ch[i+1];
		}
		solveRec(ch);
	}
	else{
		solveRec(ch+1);
	}


}
int main(){
	char ch[]="xyxxwz";
	solveRec(ch);
	printf("%s",ch);
	return 0;
}
