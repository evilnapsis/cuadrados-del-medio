/*
 * Clase para buscar numeros o caracteres repetidos dentro de un arrar
 * http://gist.github.com/evinapsis/searchr
 */
package cuatrocentro;

import java.util.ArrayList;

/**
 * @author evilnapsis
 */
public class Searchr {
public static ArrayList<String> list;
        public static void init(){
         list = new ArrayList<String>();
    }
    
    public static void add(String item){
        list.add(item);    
    }
    
    public static boolean ifExist(String item){
        boolean f = false;
        if(!isEmpty()){
            Object[] all = list.toArray();
            int l = all.length;
            for(int i=0;i<l;i++){
                if(all[i].toString().equals(item)){ f = true; break;}
            }
            
        }
        return f;
    }
    
    public static boolean isEmpty(){
        Object[] all = list.toArray();
        if(all.length==0){ return true; }
        return false;
    }
}
