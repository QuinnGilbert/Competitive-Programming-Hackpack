#include <bits/stdc++.h>

using namespace std;

#define rep(i, a, b) for(int i = a; i < (b); ++i)
#define all(x) begin(x), end(x)
#define sz(x) (int)(x).size()
typedef long long ll;
typedef pair<int, int> pii;
typedef vector<int> vi;

void modify(int p, int value, vector<int> &t) {  // set value at position p
    for(t[p+=t.size()/2]=value;p>1;p>>= 1) t[p>>1]=t[p]+t[p^1];
}

int query(int l, int r, vector<int> &t) {  // sum on interval [l, r]
    int res=0;
    for(l += t.size()/2, r += t.size()/2+1; l < r; l >>= 1, r >>= 1) {
        if(l&1) res += t[l++];
        if(r&1) res += t[--r];
    }
    return res;
}
