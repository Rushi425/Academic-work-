#include<iostream>
using namespace std;
const int max_size=10;
struct Product
{
	int id;
	char name[20];
	 float price,gst,totalprice;
};
int main()
{
	 Product p[max_size];
	int temp=0,next=-1,choice,a;
	while(temp!=2)
	{
	cout<<"enter the choice1.insert,2.delete,3.display"<<endl;
	cin>>choice;
		switch(choice)
		{
			case 1:
				if(next==max_size)
				{
					cout<<"list is full"<<endl;
				}	
				else
				{
					next++;
					cout<<"enter the product name"<<endl;
					cin>>p[next].name;
					cout<<"enter the product id"<<endl;
					cin>>p[next].id;
					cout<<"enter the product price"<<endl;
					cin>>p[next].price;
					cout<<"enter the product gst  in percentage"<<endl;
					cin>>p[next].gst;
					p[next].totalprice=(p[next].price*p[next].gst/100)+p[next].price;
					
				}
				break;
			case 2:
				if(next==-1)
				{
					cout<<"list in underflow"<<endl;
				}
				else 
				{
					cout<<"enter the product no." <<endl;
					cin>>a;
					for(int i=a;i<next;i++)
					{
						//p[i].name=p[i+1].name;
						p[i].id=p[i+1].id;
						p[i].price=p[i+1].price;
						p[i].gst=p[i+1].gst;
						p[i].totalprice=p[i+1].totalprice;
					}
					next--;
				}
				break;
			case 3:
				if(next==-1)
				{
					cout<<"list is empty";
				}
				else
				{
					for(int i=0;i<=next;i++)
					{
						cout<<"product name ................"<<p[i].name<<endl;
						cout<<"product id ..................."<<p[i].id<<endl;
					cout<<"product price ................"<<p[i].price<<"Rs."<<endl;
						cout<<"product GST.................."<<p[i].gst<<"%"<<endl;
				       cout<<"product totalprice .........."<<p[i].totalprice<<"Rs."<<endl;
				cout<<"---------------------------------------------------------------"<<endl;
					}
				}
				break;
			default :
				
				temp=2;
			break;
		}
	}
}
