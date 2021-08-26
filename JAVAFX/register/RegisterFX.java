/* 
    RegisterFX

    Copyright (C) 2021 Luciano A.

    RegisterFX is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    RegisterFX program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RegisterFX.  If not, see <https://www.gnu.org/licenses/>.

*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.Node;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;


public class RegisterFX extends Application {
    static int rowIndex = 0;
    static GridPane grid;

    @Override
    public void start(Stage stage){
        HBox hbox = new HBox();
        grid = new GridPane();
        TextArea comment = new TextArea();

        grid.setHgap(10.0);
        grid.setVgap(10.0);
        grid.setPadding(new Insets(20, 20, 20, 20));

        addField("DNI", new TextField());
        addField("Nombre", new TextField());
        addField("Apellido", new TextField());
        addField("Telefono", new TextField());
        addField("Email", new TextField());

        DatePicker dp = new DatePicker();
        dp.setEditable(false);
        addField("Nacimiento", dp);

        GridPane.setVgrow(comment, Priority.ALWAYS);
        //GridPane.setFillWidth(comment, true);
        GridPane.setFillHeight(comment, true);
        addField("Comentario",comment);

        hbox = new HBox(new Button("Cancelar"), new Button("Aceptar"));
        hbox.setFillHeight(true); // rigid buttons ?
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        addField("", hbox);
            
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Registro");
        stage.show();
    }

    // helper method
    private void addField(String title, Node node){
        Label label = new Label(title);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        GridPane.setHalignment(label, HPos.RIGHT);
        grid.add(label, 0, rowIndex);
        GridPane.setHgrow(node, Priority.ALWAYS);
        GridPane.setFillWidth(node, true);
        grid.add(node, 1, rowIndex);
        rowIndex++;
    }

    public static void main(String[] args){
        launch(args);
    }
}
