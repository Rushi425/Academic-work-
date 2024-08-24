#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
class Date
{
	private:
				int day;
				int month;
				int year;
				int day1;
				int day2;
				int month1;
				int month2;
				int year1;
				int year2;
				int day3;
				int month3;
				int year3;

	public:
				
				void BsetDate()
				{
					cout<<"Enter the birthday:";
					cin>>day2;
					cout<<"Enter the birthmonth:";
					cin>>month2;
					cout<<"Enter the brithyear:";
					cin>>year2;
				}
				

				void CsetDate()
				{
					cout<<"Enter the currentday:";
					cin>>day1;
					cout<<"Enter the currentmonth:";
					cin>>month1;
					cout<<"Enter the currentyear:";
					cin>>year1;
				}

				void Bdisplay()
				{
					cout<<"Your Birth date :"<<day2<<"/"<<month2<<"/"<<year2<<"."<<endl;
				}
	
				void Cdisplay()
				{
					cout<<"Enter the current date :"<<day1<<"/"<<month1<<"/"<<year1<<"."<<endl;
				}

				void cal()
				{
					if(day1<day2)
						{
							day1=day1+30;
							day3=day1-day2;
							month1--;
						}
					else
						{
							day3=day1-day2;
						}
					if(month1<month2)
						{
							month1=month1+12;
							month3=month1-month2;
							year1--;
						}
					else
						{
							month3=month1-month2;
						}
					year3=year1-year2;
				}


			void Ddisplay()
				{
					cout<<"The age difference:"<<day3<<"Days"<<endl<<month3<<"Months"<<endl<<year3<<"Year"<<endl;
				}
};
int main()
{
	Date d;
	d.BsetDate();
	d.CsetDate();
	d.Bdisplay();
	d.Cdisplay();
	d.cal();
	d.Ddisplay();
}
