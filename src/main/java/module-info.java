module com.champlain.oop2assignment2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.httpserver;


    opens com.champlain.oop2assignment2 to javafx.fxml;
    exports com.champlain.oop2assignment2;
}