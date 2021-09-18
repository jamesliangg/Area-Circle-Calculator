//output title “area of a circle calculator”
//prompt “enter radius of circle”
//get radius
//calculate area=PI(radius)2
//output result “area of the circle is” area

//import JOptionPane for fancy input
import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    //variables
    double area;
    double radius;
    double roundedArea;
    int repeat = 0;

    //explain what program does
    JOptionPane.showMessageDialog(null, "Area of a circle calculator");
    
    //while loop runs as long as repeat is equal to 0
    while (repeat == 0)
    {    
      //user input
      radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius of circle"));
    
      //calculate area
      area = Math.PI * Math.pow(radius, 2);
      roundedArea = Math.round(area *10000.0)/10000.0;

      //output result
      JOptionPane.showMessageDialog(null, "Area of the circle is " + roundedArea);

      //ask if user would like to repeat
      repeat = JOptionPane.showConfirmDialog(null, "Repetition", "Repeat?", JOptionPane.YES_NO_OPTION);
      //0=yes, 1=no -1=x out

      //if repeat isn't 0, break from while loop
      if (repeat != 0)
      {
        break;
      }
    }
    //exit program with exit code 0
    System.exit(0);    
  }
}