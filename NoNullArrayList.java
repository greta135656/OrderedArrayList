import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {

public NoNullArrayList(){
super();}

public NoNullArrayList(int startingCapacity){
super(int startingCapacity);
}

public void set (int index, T value){
if (value == null)
throw new IllegalArgumentException("error");
super.set(index, value);
}

public boolean add(T value){
if (value == null)
throw new IllegalArgumentException("error");
return 
}


public void add (int index, T value){
if (value == null)
throw new IllegalArgumentException("error");
super.add(index, value);
}
