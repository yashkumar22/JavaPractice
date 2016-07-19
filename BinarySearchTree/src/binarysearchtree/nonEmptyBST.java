package binarysearchtree;

public class nonEmptyBST<D extends Comparable<D>> implements Tree<D> {
     D data;
     Tree<D> left;
     Tree<D> right;
      
	public nonEmptyBST(D elt){
		 data = elt;
		 left = new EmptyBST<D>();
		 right = new EmptyBST<D>(); 
	}
	public nonEmptyBST(D elt, Tree<D>leftTree, Tree<D>rightTree){
		data = elt;
		left = leftTree;
		right= rightTree;
	}
	
	public boolean isEmpty(){
		return false;
	}
	public int cardinality(){
		return 1 + left.cardinality() + right.cardinality();
	}
	public boolean member(D elt){
		if(data == elt){
			return true;
		}else {
			if(elt.compareTo(data) < 0 ){
				return left.member(elt);
			} else {
				return right.member(elt);
			}
		}
	}
	public nonEmptyBST<D> add(D elt){
		if(data == elt){
			return this;
		}else {
			if(elt.compareTo(data) < 0){
				return new nonEmptyBST(data,left.add(elt), right);
			}else {
				return new nonEmptyBST(data,left,right.add(elt));
			}
		}
	}
}
