import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
public OrderedArrayList(){
super();
}

public OrderedArrayList(int startingCapacity){
super(startingCapacity);
}


public void add(int index, T value){
add(value);
}

public boolean add(T value){
for (int i = 0; i < size(); i++)
if(value.compareTo(get(i)) < 0){
add(i, value);
}

return true;
}

public T set(int index, T value){
remove(index);
add(value);
return value;
}}
