package annotation;

import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * ��Ӧ�̱��
     * @return
     */
    public int id() default -1;
    
    /**
     * ��Ӧ������
     * @return
     */
    public String name() default "";
    
    /**
     * ��Ӧ�̵�ַ
     * @return
     */
    public String address() default "";
}
