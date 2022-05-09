package ro.itschool.minishop;

import java.util.List;
import java.util.Scanner;

public class CategoryUI {
    private CategoryService categoryService = new CategoryService();
    private Scanner scanner = new Scanner(System.in);

    public void startCategoryManagement() {
        int optiune = 0;

        do {
            displayMenu();
            optiune = scanner.nextInt();
            scanner.nextLine();
            if (optiune == 1) {
                displayCategoriesUi();
            } else if (optiune == 2) {
                findCategoryUi();
            } else if (optiune == 4) {
                changeCategoryUI();
            } else if (optiune == 5) {
                addCategoryUI();
            } else if (optiune == 6) {
                removeCategoryUI();
            }

        } while (optiune != 7);
    }

    private void removeCategoryUI() {
        System.out.println("Enter id of category that will be deleted:");
        String categoryId = scanner.nextLine();
        categoryService.removeCategory(categoryId);
    }

    private void addCategoryUI() {
        System.out.println("Enter id of category:");
        String categoryId = scanner.nextLine();
        System.out.println("Enter name of category");
        String name = scanner.nextLine();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(categoryId);
        categoryModel.setName(name);
        categoryService.addCategory(categoryModel);
    }

    private void changeCategoryUI() {
        System.out.println("Id of the category that you want to change:");
        String idOfCategory = scanner.nextLine();
        System.out.println("Enter new name of this category:");
        String newName = scanner.nextLine();
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setId(idOfCategory);
        categoryModel.setName(newName);
        categoryService.updateCategory(categoryModel);
    }


    private void findCategoryUi() {
        System.out.println("Enter id of category that you want to find:");
        String idOfCategory = scanner.nextLine();
        try {
            CategoryModel categoryFound = categoryService.getCategoryById(idOfCategory);
            System.out.println(categoryFound.getId() + categoryFound.getName());
        } catch (CategoryNotFoundException var) {
            System.out.println("Category not found!");
        }
    }

    private void displayCategoriesUi() {
        List<CategoryModel> categories = categoryService.getAllCategories();
        for (CategoryModel category : categories) {
            System.out.println(category.getId() + "." + category.getName());
        }
    }

    private void displayMenu() {
        System.out.println("1.View categories");
        System.out.println("2.Find category by id");
        System.out.println("3.View ordered categories");
        System.out.println("4.Change name of a category");
        System.out.println("5.Add category");
        System.out.println("6.Remove category");
        System.out.println("7.Exit");
    }
}