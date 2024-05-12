package org.GLAB_303_11_3_Array_List_User_Defined_Objects;
import java.util.ArrayList;
import java.util.Iterator;

public class ShowData {
    public static void main(String[] args) {
        // instantioation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist)
        {
            // ---- invoking getter method for geting Data---------
            System.out.println(showValue.getNumber() + " " + showValue.getName() +" "+ showValue.getCategory() +" "+ showValue.getAuthor());
        }
    }

}

