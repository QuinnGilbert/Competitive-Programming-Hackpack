
//Basic sortable pair of ints
static class Pair implements<Comparable>{
	int x,y;
	Pair(int X,int Y){
		x=X;
		y=Y;
	}
	public compareTo(Pair b){
		if(x==b.x)  return Integer.compare(y,b.y);
		return Integer.compare(x,b.x);
	}
}
