package templates.bounce;

import models.Square;
import templates.applications.SquareApplication;
import utils.ShapeRunnable;
import utils.ShapesComponent;

import java.awt.*;

public class SquareBounce extends SquareApplication {

    public SquareBounce() {
        initListeners();
        initBounce();
    }
}
