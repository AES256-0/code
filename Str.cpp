#include <bits/stdc++.h>

using namespace std;

typedef long long int lli;
typedef long double ld;
typedef vector<lli> vi;
typedef vector<vi> vvi;
typedef pair<lli, lli> pii;
typedef map<lli, lli> mii;

#define endl "\n"
#define pb push_back
#define mp make_pair
#define fastio ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define test(t) lli t; cin>>t; while(t--)
#define mod 1000000007
#define mod2 998244353
#define F first
#define S second
#define pi acos(-1)

string getClass(string s){
    lli n=s.length();
    for(lli i=0;i<n;i++){
        if(s[i]=='1'){ continue; }

        lli cnt=0;
        for(lli j=i+1;j<n;j++){
            if(s[j]=='1'){ cnt++; }

            if(cnt==2){
                for(lli k=i;k<=j;k++){
                    char t=s[k];
                    s[k]=s[j];
                    s[j]=t;
                    j--;
                }
                break;
            }
        }
        if(cnt!=2){  break; }
    }
    return s;
}
bool isEq(string a, string b){
    a=getClass(a);
    b=getClass(b);
    if(a==b)
    return true;
    else
    return false;
}

bool inst(vector<string> sets, string s){
    for(string x:sets){
        if(x.length()==s.length() && isEq(x, s)){ return false; }
    }
    return true;
}

int main(){
    fastio;
    test(t){
        string s;
        cin>>s;
        vector<string> sets;
        string a="";
        lli n=s.length();
        for(lli i=0;i<n;i++){
            a="";
            for(lli j=i;j<n;j++){
                a=a+s[j];
                if(inst(sets, a)){
                    sets.pb(a);
                }
            }
        }
        cout<<sets.size()<<endl;
    }
    return 0;
}
