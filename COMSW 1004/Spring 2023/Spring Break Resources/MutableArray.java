
public class MutableArray{

    private Object[] arr;
	private int size;

    public MutableArray(int capacity){
        arr = new Object[capacity];
        size = 0;
    }

    public MutableArray(){
        this(10);
    }

    public void clear(){
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int idx, Object element) throws IndexOutOfBoundsException {
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Index out of Bounds.");
        }
        if(arr.length-size <= 0){
            doubleArraySize();
        }
		for(int i = (size-1); i >= index; i--){
			arr[i+1] = arr[i];
		}
		arr[index] = element;
		size++;
    }

    public boolean add(Object element){
        if(arr.length-size <= 0){
            doubleArraySize();
        }
		arr[size++] = element;
		return true;
    }

    public Object get(int index) throws IndexOutOfBoundsException{
        if(index >= 0 && index < size){
            return arr[index];
        }
        throw new IndexOutOfBoundsException("Index out of Bounds.");
	}

	public Object remove(int index) throws IndexOutOfBoundsException {
        if(index >= 0 && index < size){
            Object toRemove = arr[index];
            for(int i = index; i < size - 1; i++){
                arr[i] = arr[i+1];
            }
            return toRemove;
        }
        throw new IndexOutOfBoundsException("Index out of Bounds.");
	}

    public Object set(int index, Object element) throws IndexOutOfBoundsException {
        if(index >= 0 && index < size){
            Object previousElement = arr[index];
            arr[index] = element;
            return previousElement;
        }
        throw new IndexOutOfBoundsException("Index out of Bounds.");
    }

    public int size(){
        return size;
    }

    public Object[] toArray(){
        Object[] toArray = new Object[size];
        for(int g = 0; g < size; g++){
			if(arr[g] != null){
				toArray[g] = arr[g];
			}
		}
		return toArray;

    }

    private void doubleArraySize(){
        Object[] newArr = new Object[2*arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    //You may choose to add more methods here
}