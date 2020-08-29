/**
* a.c
* @author bulbasaur
* @description 

 计算 1 - 100 中数字9出现了几次

* @created 2020-08-12T19:17:41.979Z+08:00
* @copyright None 
* None
* @last-modified 2020-08-12T19:34:23.252Z+08:00
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char const *argv[])
{
    int count = 0;
    
    for (int i = 0; i < 100; i++)
    {
        /* code */
        if (i / 10 == 9)
        {
            /* code */
            count++;
        }

        if (i % 10 == 9)
        {
            /* code */
            count++;
        }
        
        
    }
    
    printf("Answer: %d\n", count);
    
    system("pause");

    return 0;
}
