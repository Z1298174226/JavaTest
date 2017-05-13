package annotationDemo;
import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited

public @interface BookName {
	
	public String name() default "";

}
