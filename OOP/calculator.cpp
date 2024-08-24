#include<iostream>
#include<cmath>
using namespace std;
class calculator
{
	public:
		int a,b,c;
	
	public:
		void add();
		void sub();
		void mul();
		void div();
		void rem();
		void per();
		void pow();
		
};

void calculator::add()
{
	cout<<"..........................."<<endl;
	cout<<"Enter two numbers:";
	cin>>a>>b;
	c=a+b;
	cout<<"The addition of entered numbers is "<<c<<endl;
	cout<<endl;
}

void calculator::sub()
{
	cout<<"..........................."<<endl;
	cout<<"Enter two numbers:";
	cin>>a>>b;
	c=a-b;
	cout<<"The substraction of entered numbers is "<<c<<endl;
	cout<<endl;
}

void calculator::mul()
{
	cout<<"..........................."<<endl;
	cout<<"Enter two numbers:";
	cin>>a>>b;
	c=a*b;
	cout<<"The multiplication of entered numbers is "<<c<<endl;
	cout<<endl;
}

void calculator::div()
{
	cout<<"..........................."<<endl;
	cout<<"Enter divisor:"<<endl;
	cin>>a;
	cout<<"Enter dividend"<<endl;
	cin>>b;
	c=a/b;
	cout<<"The division of entered numbers is "<<c<<endl;
	cout<<endl;
}

void calculator::rem()
{
	cout<<"..........................."<<endl;
    cout<<"Enter divisor:"<<endl;
	cin>>a;
	cout<<"Enter dividend"<<endl;
	cin>>b;
	c=a%b;
	cout<<"The remainder of entered numbers is "<<c<<endl;
	cout<<endl;
}

void calculator::pow()
{
	cout<<"..........................."<<endl;
	cout<<"Enter number:";
	cin>>a;
	cout<<"Enter exponent:";
	cin>>b;
	c=a^b;
	cout<<"The power of entered numbers is "<<c<<endl;
	cout<<endl;
}

int main()
{
	int choice;
	
	
	cout<<"Enter what you want to perform:"<<endl;
	cout<<"+"<<endl;
	cout<<"-"<<endl; 
    cout<<"*"<<endl;
	cout<<"/"<<endl;
	cout<<"%"<<endl;
	cout<<"^"<<endl;
	cout<<endl;
	cout<<"  =  ";
	cin>>choice;
	
	switch(choice)
	{
		
		
	}
}




