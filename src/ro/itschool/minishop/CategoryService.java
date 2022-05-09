package ro.itschool.minishop;

import java.util.List;

public class CategoryService {

    private CategoryDao categoryDao = new CategoryDao();

    public List<CategoryModel> getAllCategories(){
       List<CategoryModel> categories =  categoryDao.getAll();
       return  categories;
    }

    public void addCategory(CategoryModel category){
        categoryDao.add(category);
    }

    public CategoryModel getCategoryById(String id){
        CategoryModel categoryModel = categoryDao.findById(id);
        if(categoryModel == null){
            throw new CategoryNotFoundException();
        } else {
            return categoryModel;
        }
    }

    public void removeCategory(String id){
        categoryDao.remove(id);
    }

    public void updateCategory(CategoryModel newCategory){
        String id = newCategory.getId();
        categoryDao.remove(id);
        categoryDao.add(newCategory);

    }

}
