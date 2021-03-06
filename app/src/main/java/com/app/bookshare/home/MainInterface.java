package com.app.bookshare.home;


import android.net.Uri;

import com.app.bookshare.models.Category;
import com.app.bookshare.models.Material;
import com.app.bookshare.models.SubCategory;
import com.app.bookshare.models.User;

import java.util.List;

public interface MainInterface {

    interface MainView {


    }
    interface UserView {

        void userExists(User user);

    }
    interface CategoryView {

        void allCategories(List<Category> categories);

    }

    interface SubCategoryView {

        void allSubCategory(List<SubCategory> subCategories);
    }

    interface MaterialView {

        void allMaterial(List<Material> materials);

        void materialUploaded(String message);
    }


    interface FavoriteView {

        void allFavorite(List<Material> favorite);


    }





    interface MainPresenterView
    {

        void getUserInfo();
        void getCategory();

        void getSubCategory(String categoryId);

        void getMaterial(String subCategoryId);

        void addMaterial(String subject, String teacher, String fileName, Uri file, String subCategoryId);

        void addMaterial(String subject, String teacher, String fileName, String subCategoryId);



        void getFavorite();



    }
}
