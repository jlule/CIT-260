//Output pie chart 
import javafx.application.Application;
 import javafx.stage.Stage;
 import javafx.scene.Scene;
 import javafx.scene.layout.Pane;
 import javafx.scene.shape.Arc;
 import javafx.scene. shape.ArcType;
 import javafx.scene.paint.Color;
 import javafx.scene.text.Text;
 import javafx.geometry.Insets;

public  class  A14dot13  extends  Application 
{ 
    final  double X = 100 ;
     final  double R = X * 0.8 ;
     @Override 
    public  void  start (Stage primaryStage)
    {
        Pane pane = new Pane();
        pane.setPadding( new Insets( 10 , 10 , 10 , 10 ));
         double [] data = { 20 , 10 , 30 , 40 };
        String[] text = { "Project-20%" , "Test-10%" , "Midterm Exam-30%" , "Final Exam-40%" };
         int length = data.length;
         double divide = Math.PI/length;
         double start = 0 ;
         for ( int i = 0 ; i <length; i++)
        {
            pane.getChildren().add(getArc(data[i], start));
            start += data[i];
        }
        start = 0 ;
         for ( int i = 0 ; i <length; i++)
        {
            pane.getChildren().add(getText(data[i], text[i], start));
            start += data[i];
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle( " PieChart " );
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //Draw a pie chart based on the provided data and starting angle 
    public Arc getArc ( double data, double start)
    {
        double startAngle = start/100 * 360 ;
         double length = data/100 * 360 ;
        Arc arc = new Arc(X, X, R, R, startAngle, length);
        arc.setType(ArcType.ROUND);
        switch (( int )data/10 )
        {
        case  1 :
            arc.setFill(Color.BLUE);
            break ;
         case  2 :
            arc.setFill(Color.RED);
            break ;
         case  3 :
            arc.setFill(Color.GREEN);
            break ;
         case  4 :
            arc.setFill(Color.ORANGE);
            break ;
        }
        arc.setStroke(Color.BLACK);
        return arc;
    }
    //Display the document for each piece of pie chart 
    //The starting point of document output is the midpoint of each pie chart arc 
    //start + date/2 The proportion of 100 is exactly the midpoint in the entire circle (2 * Math.PI) the ratio of the angle 
    public Text getText ( double data, String name, double start)
    {
        double proportion = (data/2 + start)/100 ;
        Text text = new Text(X + R * Math.cos( 2 * Math.PI * proportion),
            X-R * Math.sin( 2 * Math.PI * proportion), name);
         return text;
    }
}