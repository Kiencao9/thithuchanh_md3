package service;

import dao.CategoryDao;

public class CategoryService {
    public static Object getAll() {
        return CategoryDao.getAllCategory();
    }
}
