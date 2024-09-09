#include<iostream>
using namespace std;
const int pi=3.14;
class circle
{
	private:
			float centerX,centerY,radius,circumference,area;
	public:
			float caclarea()
			{
				area = pi*radius*radius;
				cout<<"Area of circle ="<<area<<endl;
			}
			float caclcircumference()
			{
				float circumference;
				circumference = 2*pi*radius;
				cout<<"Circumference of circle ="<<circumference<<endl;
			}
			circle()
			{
				radius =10;		
			}
			circle(float cx,float cy)
			{
				centerX=cx;
				centerY=cy;
				radius=40;
			}
			circle(float cx,float cy, float radii)
			{
				centerX=cx;
				centerY=cy;
				radius=radii;
			}
};
int main()
{
	float a,x,y;
	cout<<"Enter the x coordinate:"<<endl;
	cin>>x;
	cout<<"Enter the y coordinate:"<<endl;
	cin>>y;
	cout<<"Enter the radius:"<<endl;
	cin>>a;
	circle c1(x,y);
	c1.caclarea ();
	c1.caclcircumference();
	circle c2(x,y);
	c2.caclarea ();
	c2.caclcircumference();
	circle c3(x,y,a);
	c3.caclarea();
	 c3.caclcircumference();
}

	
																																																										
				
				
