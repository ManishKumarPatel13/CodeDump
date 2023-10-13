#include<bits/stdc++.h>
using namespace std;

int main(){
    int a, b, c;
	    cin>>a>>b>>c;
	    int maxi = 0;
	    int mini = 0;
	    int ans;
	    maxi = max(a, b);
        cout<<a<<b<<c<<endl;
	    maxi = max(maxi, c);
	    mini = min(a, b);
	    mini = min(mini, c);
	    ans = maxi - mini;
	    cout<<ans<<endl;
	    
	
	return 0;
}