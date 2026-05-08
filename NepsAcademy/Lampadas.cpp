#include <iostream>
using namespace std;
int main()
{
    int a, b, interruptor, num;
    a = 0;
    b = 0;
    cin >> num;
    int x = 0;
    while (x < num)
    {
        x++;
        cin >> interruptor;
        if (interruptor == 1)
        {
            if (a == 0)
            {
                a = 1;
            }
            else if( a == 1)
            {
                a = 0;
            }
        }
        else if (interruptor == 2)
        {
            if (a == 0)
            {
                a = 1;
                
            }
            else if( a == 1 )
            {
                a = 0;

                
            }
            if(b == 0){
                b =1;
            }else if(b == 1){
                b =0;
            }
        }
    }
    cout << a << endl;
    cout << b << endl;
}