package templates.bounce;

import models.Star;
import templates.applications.StarApplication;
import utils.ShapeRunnable;
import utils.ShapesComponent;

public class StarBounce extends StarApplication {

    public StarBounce() {
        initListeners();
        initBounce();
    }
}
