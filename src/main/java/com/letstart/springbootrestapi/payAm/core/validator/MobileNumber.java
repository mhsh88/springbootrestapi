package com.letstart.springbootrestapi.payAm.core.validator;//package com.letstart.springbootrestapi.payAm.core.validator;
//
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import static java.lang.annotation.ElementType.FIELD;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
///**
// * Created by Payam Mostafaei
// * Creation Time: 2017/Feb/07 - 08:24 PM
// */
//@Target({FIELD})
//@Retention(RUNTIME)
//@Constraint(validatedBy = MobileNumberValidator.class)
//@play.data.Form.Display(name="constraint.mobileNumber")
//public @interface MobileNumber {
//    String message() default MobileNumberValidator.message;
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//}