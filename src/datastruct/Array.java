package datastruct;

import java.util.Objects;

public class Array <E> {
    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return (size==0)?true:false;
    }

    public void addLast(E e){
        if(size == data.length){
            throw new IllegalArgumentException("addlast failed,array is full");
        }
        data[size] = e;
        size ++;

        //或者可以用 add(size,e);
    }

    public void add(int index , E e){
        if(size == data.length){
            resize(2*data.length);
        }

        if(index < 0 || index > size){
            throw new IllegalArgumentException("add failed , require index >= 0");
        }

        for(int i = size - 1 ; i >= index ; i --){
            data[i + 1] = data [i];
        }

        data[index] = e;
        size ++;
    }

    public E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed . index is illegal");
        }
        return data[index];
    }

    public E getLast(){
        return get(size - 1);
    }

    void set(int index, E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed . index is illegal");
        }
        data[index] = e ;
    }

    public boolean contains(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }

    //不存在则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public E remove(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("remove failed , require index >= 0");
        }
        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++){
            data[i - 1] = data[i];
        }
        size --;
        data[size] = null;
        if(size == data.length / 2){
            resize(data.length / 2);
        }
        return ret;
    }

    public E removeLast(){
        return remove(size - 1);
    }

    public E removeFirst(){
        return remove(0);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array:size = %d , capacity = %\n",size,data.length));
        sb.append("[");
        for(int i = 0 ; i < size ; i ++){
            sb.append(data[i]);
            if(i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Objects[newCapacity];
        for(int i = 0 ; i < size ; i ++){
            newData[i] = data[i];
        }
        data = newData;
    }
}
