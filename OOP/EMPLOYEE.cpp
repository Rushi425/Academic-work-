#include<stdio.h>
void getdata();
void putdata();
struct employee
{
	char name[30],de[20],ei[50];
	float bs,ns;

}e[3];
void getdata()
{
int i;
float da,hra;
	for(i=0;i<3;i++)
	{
		printf("\nenter the name of employee\n");
		scanf("%s",e[i].name);
		printf("enter the designation of employee\n");
		scanf("%s",e[i].de);
		printf("enter the employee id\n");
		scanf("%s",e[i].ei);
		printf("enter salary of employee\n");
		scanf("%f",&e[i].bs);
		da=e[i].bs*0.8;
		hra=e[i].bs*0.2;
		e[i].ns=e[i].bs+da+hra;
		printf("-----------------------------------");
	}
}
void putdata()
{
	int i,en=0;
	printf("\nen\tname\tdesignation\tem_id\tnetsalary\n");
	for(i=0;i<3;i++)
	{ en++;
		printf("%d\t%s\t%s\t\t%s\t%f\n",en,e[i].name,e[i].de,e[i].ei,e[i].ns);
	}
}
int main()
{
	getdata();
	putdata();
}	
		
	
		

