/**
 * 
 */
/**
 * 
 */
module Project2 {
	requires javafx.graphics;
	requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;

    opens Project2 to javafx.fxml, javafx.graphics;
}