package annotationDemo;
import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BookProvider {
	
	public int id() default 0;
	
	public String providerName() default "";
	
	public String providerAddress() default "";

}
