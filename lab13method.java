public static int[] splitArray(int[] a){
	int counter= 0;
	for (int i=0;i<a.length;i++) {
		if (a[i]>0) {
			counter++;
		}
	}
	int[] x= new int[counter];
	int x=0;
	for (int i=0;i<x.length;i++) {
		if (a[i]>0) {
			x[i]=a[x];
			x++;
		}
	}
	return x;
}