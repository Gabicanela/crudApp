package com.gabiecanela.crudapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;


    @FXML
    private Button btnClear;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField tCourse;

    @FXML
    private TextField tFirstName;

    @FXML
    private TextField tLastName;

    @FXML
    private TableView<Student> table;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public ObservableList<Student> getStudents(){
        ObservableList<Student> students = FXCollections.observableArrayList();

        String query = "select * from students";
        con = DBConnection.getCon();
        try {
            st = con.prepareStatement(query);
            rs = st.executeQuery();
            while (rs.next()){
                Student st = new Student();
                st.setId(rs.getInt("id"));
                st.setFirstName(rs.getString("FirstName"));
                st.setLastName(rs.getString("LastName"));
                st.setCourse(rs.getString("Course"));
                students.add(st);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }

    @FXML
    void clearField(ActionEvent event) {

    }

    @FXML
    void deleteStudent(ActionEvent event) {

    }

    @FXML
    void saveStudent(ActionEvent event) {

    }

    @FXML
    void updateStudent(ActionEvent event) {

    }

}
