#include<iostream>
using namespace std;

class Complex{
private:
 double real;
double imag;

public:
 Complex(double r=0.0,double i=0.0):real(r),imag(i){}

 friend ostream&operator<<(ostream&os,const Complex&c){
os<<c.real<<"+"<<c.imag<<"i";
return os;
}

friend istream& operator>>(istream&is,Complex&c)
{
cout<<"Enter real part:";
is>>c.real;
cout<<"Enter imaginary part:";
is>>c.imag;

return is;
}
};
int main()
{
Complex c1,c2;
cout<<"Enter complex no 1:  \n";
cin>>c1;
cout<<"Enter complex no 2:  \n";
cin>>c2;


cout<<"complex no 1"<<c1<<endl;
cout<<"complex no 2"<<c2<<endl;

return 0;
}

