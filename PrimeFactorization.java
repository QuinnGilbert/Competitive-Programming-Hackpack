static ArrayList<Integer> PrimeFactorization{
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
