/*
 * The MIT License
 *
 * Copyright 2018 Jacob Boone.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package pollycli.DataStructures;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pollycli.StaticData.Paths;

/**
 *
 * @author Jacob Boone
 */
public class UIController {

    public ResourceBundle activeLanguage;
    
    public UIController() {
        activeLanguage = Paths.ENG_BUNDLE;
    }
    
    public void showStage(String path, String title){
        getStage(getScene(path), title).show();
    }
    
    private Scene getScene(String path){
        return new Scene(getParent(path));
    }
    
    private Parent getParent(String path){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(path), activeLanguage);
            return loader.load();
        } catch (IOException ex) {
            Logger.getLogger(UIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Parent) new Object();
    }
    
    private Stage getStage(Scene scene, String title){
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.getIcons().add(Paths.IMAGE_BIRD);
        stage.setTitle(title);
        return stage;
    }
}
