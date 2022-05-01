#include<bits/stdc++.h>
#define ll long long
#define fors(i,a,b) for(int i = a; i < b; ++i)
#define pb push_back
#define all(a) a.begin(),a.end()
#define mid ((l+r)>>1)
#define lson rt<<1, l, mid
#define rson rt<<1|1, mid+1, r
using namespace std;
const int maxn = 5e5+5;
int a[maxn];
int n;
void init(){
    scanf("%d", &n);
    fors(i,1,n+1) scanf("%d", &a[i]);
}
int q[maxn*10];
int pos[maxn];
int head,tail;
void sol(){
    fors(i,1,n+1) pos[a[i]] = i;
    ll ans = 0;
    head = tail = 0;
    int l = 1, r = 1;
    if(a[1] == 1) q[tail++] = 1;
    for(int i=1;i<=n;i++){
		cout<<"pos[a[i]] is:"+i+":"+pos[a[i]]<<endl;
    }
    ans += 1;
    // 1 3 2 4
    for(r = 2; r <= n; ++r){
        if(a[r] == r){
            q[tail++] = r;
            ans += r-l+1;
//            cout<<"--l:"<<l<<" r:"<<r<<endl;
//            fors(i,head,tail) cout<<q[i]<<" ";cout<<endl;
            continue;
        }
        while(head < tail && l <= pos[r] && pos[r] <= r && pos[r] < q[tail-1]){
            while(head<tail && (a[q[head]] <= l || q[head] <= l)) head++;
            l++;
        }
        if(pos[r] <= r && pos[r] >= l){
            q[tail++] = pos[r];
        }

        while(head < tail && a[r] >= l && a[r] < a[q[tail-1]] && a[r] <= r){

            while(head < tail && (a[q[head]] <= l || q[head] <= l)) head++;
            l++;
        }
//        cout<<"l:"<<l<<endl;
        if(a[r] >= l && a[r] <= r) q[tail++] = r;
        ans += r-l+1;
//        cout<<"l:"<<l<<" r:"<<r<<endl;
//        fors(i,head,tail) cout<<q[i]<<" ";cout<<endl;
    }
    cout<<ans<<endl;
}
int main(){
//    freopen("a.in", "r", stdin);
//	freopen("2.out","w", stdout);
    int T;cin>>T;
    while(T--){
        init(); sol();
    }
    return 0;
}
/*
5
10
5 3 2 8 1 6 7 4 9 10

1
10
9 10 6 8 7 4 2 3 1 5

*/

