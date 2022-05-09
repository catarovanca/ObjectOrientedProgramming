package ro.itschool.minishop;

import java.util.List;

public abstract class ModelDao<M extends Model> implements Dao<M>{

    private String filename;
    private ObjectFileScanner<M> objectFileScanner = new ObjectFileScanner<>();

    public ModelDao(String filename) {
        this.filename = filename;
    }

    @Override
    public List<M> getAll() {
        List<M> objects = objectFileScanner.readFromFile(this.filename);
        return objects;
    }

    @Override
    public M findById(String id) {
        List<M> objects = objectFileScanner.readFromFile(this.filename);
        M objectfound = null;
        for(M object : objects){
            if(object.getId().equals(id)){
                objectfound = object;
                break;
            }
        }
        return objectfound;
    }

    @Override
    public void remove(String id) {
        List<M> objects = objectFileScanner.readFromFile(this.filename);
            for (int i = 0; i < objects.size(); i++){
                M object = objects.get(i);
                if(object.getId().equals(id))
                {
                    objects.remove(object); //sau remove(i)
                    break;
                }
        }
            objectFileScanner.writeToFile(filename,objects);
    }

    @Override
    public void add(M objectToBeAdded) {
        List<M> objects = objectFileScanner.readFromFile(this.filename);
        objects.add(objectToBeAdded);
        objectFileScanner.writeToFile(this.filename, objects);
    }

}
