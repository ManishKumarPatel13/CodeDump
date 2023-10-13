#include <iostream>
using namespace std;

int main(){
    int n,m;
    cin>>n>>m;
    int arr[n][m]; // This is how you create 2d array;
    int digsum = 0;
    int search_element;

    // Taking input
    for(int i = 0; i<n;i++){
        for(int j = 0; j<m; j++){
            cin>>arr[i][j];
        }
    }


    // Printing output
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < m; j++)
    //     {
    //         // cout<<i<<" "<<j<<" ";
    //         cout<<arr[i][j]<<" ";
    //         // if(i == j){
    //         //     digsum += arr[i][j];
    //         // }
    //     }
    //     cout<<endl;
        
    // }
    // cout<<digsum;



    // searching in matrix
    // cin>>search_element;
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j < m; j++)
    //     {
    //         if(arr[i][j] == search_element){
    //             cout<<"element is at arr["<<i<<"]"<<"["<<j<<"]";
    //         }
    //     }
        
    // }

    // spiral order matrix - different have to do again
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (i == 0 or i==n-1){
                cout<<arr[i][j]<<" ";
            }
            else{

                if(j == 0 or j==m-1){
                    cout<<arr[i][j]<<" ";
                }
                else{
                    cout<<"  ";
                }
            }
        }
        cout<<endl;
        
    }
    
    
    
    return 0;
}