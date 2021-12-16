package model;
import java.util.ArrayList;

public class ToolsContainer{
    private static ToolsContainer instance;
    private ArrayList<Tools> tools;

    
    private ToolsContainer(){
        tools = new ArrayList<>();  
    }

    public static ToolsContainer getInstance(){
        if(instance == null){
            instance = new ToolsContainer();
        }
        return instance;
    }
    
    public void addTools(Tools tools){
        this.tools.add(tools);
    }
    
    public ArrayList<Tools> getTools(){
        return tools;
    }
    
    public Tools findTools(String barcode){
        int i = 0;
        boolean found = false;
        Tools locatedTools = null;
        while(i < tools.size() && !found){
            locatedTools = tools.get(i);
            if(locatedTools.getBarcode().equals(barcode)){
                found = true;
            }
            else{
                i++;
            }
        }
        if(found){
            return tools.get(i);
        }
        else{
            return null;
        }
    }
    
    public boolean deleteTools(String barcode){
        boolean found = false;
        Tools t = findTools(barcode);
        if(t!= null){
            tools.remove(t);
            found = true;
        }
        return found;
    }
    
    
}
