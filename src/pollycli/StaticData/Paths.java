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
package pollycli.StaticData;

import java.util.ResourceBundle;
import javafx.scene.image.Image;

/**
 *
 * @author Jacob Boone
 */
public class Paths {

    //FXML
    public static String MAINFXML = "/pollycli/FXML/MainPage.fxml";
    public static String ABOUTFXML = "/pollycli/FXML/AboutPage.fxml";
    public static String SETTINGSFXML = "/pollycli/FXML/SettingsPage.fxml";
    public static String AWSHELPFXML = "/pollycli/FXML/AWSHelpPage.fxml";
    
    //RESOURCES
    /*
    NEEDS TO BE CREDITED WHEN THE ABOUT PAGE IS BUILT
    <div>Icons made by <a href="http://www.freepik.com" 
    title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" 
    title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/" 
    title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
    */
    private static String PNG_BIRD = "/pollycli/Resources/origami-bird.png";
    public static Image IMAGE_BIRD = new Image(PNG_BIRD);
    
    //BUNDLES
    public static String LANG_EN = "pollycli.Bundles.LangBundle_en";
    public static ResourceBundle ENG_BUNDLE = ResourceBundle.getBundle(Paths.LANG_EN);
    
    //Client Side Properties
    public static String CLIENT_PROPERTIES = "config.properties";
    
    public Paths() {
    }
}
