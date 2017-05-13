package annotationDemo;

import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface BookType {
	
	public enum Type{
		science,cook,biology,art
	}
	public Type bookType() default Type.art;

}
