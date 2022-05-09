package ro.itschool.minishop;

import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
//
//        Category category = new Category();
//        category.setName("Apa");
//
//        String fileName = "category.txt";
//
//        ObjectFileScanner<Category> fileScanner = new ObjectFileScanner<>();
//
//        List<Category> categoryList = fileScanner.readFromFile(fileName);
//
//        categoryList.add(category);
//
//        fileScanner.writeToFile(fileName, categoryList);
//        categoryList = fileScanner.readFromFile(fileName);
//        for(Category categoryInFile : categoryList){
//            System.out.println(categoryInFile.getName());
//        }
//        CategoryDao categoryDao = new CategoryDao();
//        CategoryModel categoryModel = new CategoryModel();
//        categoryModel.setName("Apa");
//        categoryModel.setId("1");
//
//        categoryDao.add(categoryModel);
//
//        List<CategoryModel> categories = categoryDao.getAll();
//        for(CategoryModel category : categories){
//            System.out.println(category.getId() + " ." + category.getName());
//        }

        CategoryUI categoryUI = new CategoryUI();
        categoryUI.startCategoryManagement();
    }
}
