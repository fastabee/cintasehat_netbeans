
package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JPanel;

public class panel extends JPanel {

private JFXPanel dpanel = new JFXPanel();
private WebView webView;

public panel(){
    setBackground(Color.WHITE);
    add(dpanel, BorderLayout.CENTER);

}

public void load(String url){
Platform.runLater(new Runnable(){
@Override
public void run(){
if(webView == null){
webView = new WebView();
dpanel.setScene(new Scene(webView));
}
webView.getEngine().load(url);
    repaint();
    revalidate();

}



}


);

}

}
