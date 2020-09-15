#include <iostream>
int main()
{
    unsigned int n;
    int a;
    int j;

    for(int i = 0; i<5; i++){
    for(int j =0; j<2; j++){
    std::cout << "a=[ " << i << "]["<< j <<"]";
    }
    std::cout<< "a ["<<i<<"]["<< j << "]";
    }

    return 0;
}
