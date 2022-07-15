package OCPII.annotations;

import java.lang.annotation.Repeatable;

public class RepeatableAnnotation {
    @interface Risks{
        Risk[] value();
    }
    @Repeatable(Risks.class)
    public @interface Risk{

    }
}
