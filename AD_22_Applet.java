/*
 Applet is a special tpe of program that is embeded in the webpages to generate the dynamic content. it runs inside the browser and works at client side. 
 ADVANTAGE OF APPLET :--
                    - it works at client side so less response time.
                    - secure
                    - it can be executed by browsers running under many plateforms, including Linux, Windows, Mac Os etc.
 DRAWBACK OF APPLET :--
                    - plugin is required at client browser to execute applet.

                    
LIFECYCCLE OF JAVA APPLET:-     
                        1. Applet is initialized. 
                        2. Applet is Started.
                        3. Applet is painted.
                        4. Applet is Stopped.
                        5. Applet is destroye.

Note:- The java.applet.Applet class 4 life cycle methods and java.awat.Component class provide 1 life cycle mehtods for an applet.                        
java.applet.Applet :-
                    1. Public void init():- is used to initialized the Applet. It is invoked only once.
                    2. public void start():- is invoked after the init() method or browser is maximized. it is used to start the Applet.
                    3. public stop() :- is used to stop the Applet. it is invoked when Applet is stop or browser is minimized.
                    4. public void destroy() :- is used to destroy the Applet. it is invoked only once.
java.awt.Component :_
                    1. public void paint(Graphics g): -  is used to paint the Applet. it provides Graphics class object that can be used for drawing oval,rectangle, arc etc

How to run an Applet? :-
                    1. By html file
                    2. By appletViewer tool (for testing purpose).
                    
 */
// import java.applet.*;
// import java.awt.*;

// public class AD_22_Applet extends Applet {
//     public void paint(Graphics g) {
//         g.drawString("welcome", 150, 150);
//     }
//     <applet code="HelloWorld" width=200 height=60>
// </applet>
// }

import java.applet.*;
import java.awt.*;
public class AD_22_Applet extends Applet{
    public void init(){
        System.out.println("Applet Initialized");
    }
    public void start(){
        System.out.println("Applet executing start");
    }

    public void pain (Graphics g){
        g.drawString("JAI SHREE RAM", 10, 40);
    }
    
    public void stop() {
        System.out.println("Applet executing stop");
    }
    public void destroy() {
        System.out.println("Applet executing destroy");
    }

}
