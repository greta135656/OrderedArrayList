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
if(value == null){
super.add(value);
}
for (int i = 0; i < size(); i++)
if(value.compareTo(get(i)) < 0){
super.add(i, value);
return true;
}
super.add(value);
return true;
}

public T set(int index, T value){
if(value == null)
throw new IllegalArgumentException();
T result = get(index);
remove(index);
add(value);
return result;
}}
