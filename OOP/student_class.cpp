#include<iostream>
#include<iomanip>
using namespace std;
class student
{
	public:char name[20],prn[10],address[40],email[20],division[20];
	long int mobile_number;
	float grade_point;
}s[3];
void getdata()
{
	for(int i=0;i<3;i++)
	{
		cout<<"enter name"<<endl;
		cin>>s[i].name;
		cout<<"enter prn"<<endl;
		cin>>s[i].prn;
		cout<<"enter address"<<endl;
		cin>>s[i].address;
		cout<<"enter email"<<endl;
		cin>>s[i].email;
		cout<<"enter division"<<endl;
		cin>>s[i].division;
		cout<<"enter mobile number"<<endl;
		cin>>s[i].mobile_number;
		cout<<"enter grade point"<<endl;
		cin>>s[i].grade_point;
	}
}
void putdata()
{ 	int sr=0;
	cout<<"personal data"<<endl;
	cout<<"sr_no"<< setw(10)<< "name"<< setw(15)<<" address"<< setw(15)<<" email"<< setw(20)<< "mobile_no "<<endl;
	for(int i=0;i<3;i++)
	{
		sr++;
		cout<<sr<<setw(14)<<s[i].name<<setw(15)<<s[i].address<<setw(20)<<s[i].email<<setw(15)<<s[i].mobile_number<<endl;

	}
	sr=0;
	cout<<"acadamic data"<<endl;
cout<<"sr_no"<< setw(10) <<"name"<< setw(10)<< "prn"<< setw(12)<<" division"<< setw(15)<<"grade_point"<<endl;
	for(int i=0;i<3;i++)
	{
		sr++;
		cout<<sr<<setw(14)<<s[i].name<<setw(12)<<s[i].prn<<setw(8)<<s[i].division<<setw(12)<<s[i].grade_point<<endl;

	}
}
int main()
{
	getdata();
putdata();
}









