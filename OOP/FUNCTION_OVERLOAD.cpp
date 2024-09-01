#include<iostream>
using namespace std;
class complex
{
int a,b;
 public:
   void getvalue();
   void operator -();
   void operator ++();
   void operator ++(int);
   complex operator+(complex ob);
   complex operator-(complex ob);
   void display();
};

void complex::getvalue()

{
 cout<<"Enter the value of complex number a,b:";
 cin>>a>>b;
}

void complex::operator -()
{
 a=-a;
 b=-b;
}

void complex::operator ++()
{
 ++a;
 ++b;
}

void complex::operator ++(int)
{
 a++;
 b++;
}

complex complex ::operator+(complex ob)
{
 complex t;
 t.a=a+ob.a;
 t.b=b+ob.b;
 return(t);
}

complex complex ::operator-(complex ob)
{
 complex t;
 t.a=a-ob.a;
 t.b=b-ob.b;
 return(t);
}

void complex ::display()
{
cout<<a<<"+"<<b<<"i"<<"\n";
}

int main()
{
complex obj1,obj2,result,result1;
obj1.getvalue();
obj2.getvalue();

cout<<"input values:\n";
obj1.display();
obj2.display();
result=obj1+obj2;
result1=obj1-obj2;
cout<<"result";

result.display();
result1.display();

++obj1;
obj2++;
cout<<"after increment";

obj1.display();
obj2.display();

-obj1;
-obj2;

cout<<"\nafter negation:";
obj1.display();
obj2.display();

return 0;
}
