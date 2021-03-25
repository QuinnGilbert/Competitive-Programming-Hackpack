
//Basic sortable pair of ints
static class Pair implements Comparable<Pair>{
	int x,y;
	Pair(int X,int Y){
		x=X;
		y=Y;
	}
	public int compareTo(Pair b){
		if(x==b.x)  return Integer.compare(y,b.y);
		return Integer.compare(x,b.x);
	}
}
