package zconnectcom.zutto.zconnectshophandle.UI.Views;

/**
 * @author Rajan Maurya
 */
public interface BaseActivityCallback {

    void showProgressDialog(String message);

    void hideProgressDialog();

    void setToolbarTitle(String title);
}