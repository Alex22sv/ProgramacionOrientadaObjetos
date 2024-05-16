import java.util.ArrayList;
import java.util.Iterator;

public class Folder implements FileSystemComponent{
    private String name;
    private ArrayList<FileSystemComponent> components;
    public Folder(String name){
        this.name = name;
        components = new ArrayList<>();
    }
    public void addComponent(FileSystemComponent component){
        if(!searchComponent(component.getName())){
            components.add(component);
        }
    }
    public void deleteComponent(FileSystemComponent component){
        if(components.contains(component)){
            components.remove(component);
        }
    }
    public boolean searchComponent(String name){
        Iterator<FileSystemComponent> iterator = components.iterator();
        boolean answer = false;
        while(iterator.hasNext()){
            if(iterator.next().getName().equals(name)){
                answer = true;
                break;
            }
        }
        return answer;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        Iterator<FileSystemComponent> iterator = components.iterator();
        int size = 0;
        while(iterator.hasNext()){
            size += iterator.next().getSize();
        }
        return size;
    }

    @Override
    public void dumpContents() {
        Iterator<FileSystemComponent> iterator = components.iterator();
        System.out.println("Soy "+name+" y mi contenido compuesto es: ");
        while(iterator.hasNext()){
            iterator.next().dumpContents();
        }
    }
}
