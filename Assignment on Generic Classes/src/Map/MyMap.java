package Map;

import java.util.ArrayList;

public class MyMap <T,Y> {
    private ArrayList<T> keys;
    private ArrayList<Y> values;
    public MyMap(){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }
    public void put(T key, Y value){
        int idx = -1;
        for(int i=0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                idx = i;
                break;
            }
        }

        if(idx != -1){
            values.set(idx,value);
        } else{
            keys.add(key);
            values.add(value);
        }
    }
    public Y get(T key){
        for(int i=0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                return values.get(i);
            }
        }
        return null;
    }
    public Y remove(T key){
        Y value = null;
        for(int i=0;i<keys.size();i++){
            if(keys.get(i).equals(key)){
                value = values.get(i);
                keys.remove(i);
                values.remove(i);
                break;
            }
        }
        return value;
    }
    public void display(){
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i) + " - " + values.get(i));
        }
    }
    public static void main(String[] args) {
        MyMap<String,Integer> map = new MyMap<>();

        map.put("paul", 123);
        map.put("jes", 456);
        map.put("marc", 789);
        map.display();
        map.remove("jes");
        map.display();
        System.out.println("Sudetn id: " + map.get("marc"));


    }
}