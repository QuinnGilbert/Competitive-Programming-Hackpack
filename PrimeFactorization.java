//O(sqrt(n))
//returns list of primes of n with duplicates showing up multiple times
static ArrayList<Integer> factor(int n){
	ArrayList<Integer> result = new ArrayList<Integer>();
	for(int i=2;i*i<=n;i++){
		while(n%i==0){
			result.add(i);
			n/=i;
		}
	}
	if(n>1) result.add(i);
	return result;
}
