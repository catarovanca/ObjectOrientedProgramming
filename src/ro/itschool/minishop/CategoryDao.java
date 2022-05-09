package ro.itschool.minishop;

public class CategoryDao extends ModelDao<CategoryModel>{

    public CategoryDao() {
        super("category.txt");
    }
}
