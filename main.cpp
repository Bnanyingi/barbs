#include <iostream>
int main()
{
    unsigned int n;
    std::cout << "Enter number of arrays: ";
    std::cin >> n;
    double** array = new double*[n];

    for (int i = 0; i < n; ++i)
    {
        unsigned int size;
        std::cout << "Enter size of array " << i << ": ";
        std::cin >> size;
        array[i] = new double[size];
        for (int j = 0; j < size; ++j)
        {
            int element;
            std::cout << "Enter element " << j << " of array " << i << ": ";
            std::cin >> element;
            array[i][j] = element;
        }
    }

    for (int i = 0; i < n; ++i)
    {
        delete [] array[i];
    }
    delete[] array;
    return 0;
}