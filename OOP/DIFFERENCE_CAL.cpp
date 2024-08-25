#include<iostream>
#include<iomanip>
using namespace std;
class Abc
{
private: int day;
              int month;
              int year;                     
              int day1,month1,year1;
public:  
              Abc():day(0),month(0),year(0)
             {
	   }
             
     void setdate()
      {
        cout<<"Enter  current date:\n";
        cout<<"Enter date:";
        cin>>day;
        cout<<"Enter month:";
        cin>>month;
        cout<<"Enter year:";
        cin>>year;
      }
    
    
    void setdate1()
     {
        cout<<"Enter birth date\n";
        cout<<"Enter day:";
        cin>>day1;
        cout<<"Enter month:";
        cin>>month1;
        cout<<"Enter year:";
        cin>>year1;
     }
   
   

    void display()
     {
        cout<<"Current date is";
        cout<<day<<"-"<<month<<"-"<<year<<endl;
        cout<<"birth date is:";
        cout<<day1<<"-"<<month1<<"-"<<year1<<endl;
     }
 
    
   
   
    void calculated()
     {
        if(day<day1)
          { 
             day=day+30;
             day=day-day1;
             month--;
          }
      else 
         {
            day=day-day1;
         }
     }
    
     void calculatem()
     {
        if(month<month1)
          {
             month=month+12;
             month=month-month1;
             year--;
          }
       else
          {
              month=month-month1;
          }
      }

     void calculatey()
     {
        year=year-year1;
     }  

     void diff()
    {
      cout<<"Difference is :\n";
      cout<<"day:"<<day<<endl;
      cout<<"month:"<<month<<endl;
      cout<<"year:"<<year<<endl;
    }      

};

int main()
{
  Abc s;
  s.setdate();
  s.setdate1();
  s.display();
  s.calculated();
  s.calculatey();
  s.calculatem();
  s.diff();
}

