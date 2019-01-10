/*
 * 
          *
         ***
        *****
       *******
      *********

	  *********

          *
         ***
        *****
       *******
      *********
      2)
          *
         ***
        *****
       *******
      *********
      
          *******
          *******
          *******
          *******
          
          *
         ***
        *****
       *******
      *********

      3)
          *
         ***
        *****
       *******
      *********

         ***
         ***
      **********
      **********
         ***
         ***

          *
         ***
        *****
       *******
      *********
 */
package javaapplication10.lessons.patterns;

public abstract class TemplateMethodHomework {

    public final void displayImage() {
        displayFirstFigure();
        displaySecondFigure();
        displayThirdFigure();

    }

    private void displayFirstFigure() {
        System.out.println("*\n"
                + "         ***\n"
                + "        *****\n"
                + "       *******\n"
                + "      *********");
    }

    public abstract void displaySecondFigure();

    private void displayThirdFigure() {
        System.out.println("*\n"
                + "         ***\n"
                + "        *****\n"
                + "       *******\n"
                + "      *********");
    }

}

class StraightFigure extends TemplateMethodHomework {

    @Override
    public void displaySecondFigure() {
        System.out.println("*********");
    }

}

class SquareFigure extends TemplateMethodHomework {

    @Override
    public void displaySecondFigure() {
        System.out.println("*******\n"
                + "          *******\n"
                + "          *******\n"
                + "          *******");
    }

}

class ThirdFigure extends TemplateMethodHomework {

    @Override
    public void displaySecondFigure() {
        System.out.println("***\n"
                + "         ***\n"
                + "      **********\n"
                + "      **********\n"
                + "         ***\n"
                + "         ***");
    }

}

class TestTemplateMethodHomework {

    public static void main(String[] args) {
//        TemplateMethodHomework straigtFigure= new StraightFigure();
//        
//        straigtFigure.displayImage();

//        TemplateMethodHomework squareFigure = new SquareFigure();
//
//        squareFigure.displayImage();
//        TemplateMethodHomework thirdFigure = new ThirdFigure();
//
//        thirdFigure.displayImage();
    }
}
