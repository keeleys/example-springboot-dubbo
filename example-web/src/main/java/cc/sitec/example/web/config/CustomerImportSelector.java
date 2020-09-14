package cc.sitec.example.web.config;

import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 *@author 凉水
 *@date 2020/5/28 9:54
 **/
public class CustomerImportSelector extends AutoConfigurationImportSelector {
    @Override
    protected Class<?> getAnnotationClass() {
        return CustomerAutoConfiguration.class;
    }

    @Override
    protected Set<String> getExclusions(AnnotationMetadata metadata, AnnotationAttributes attributes) {
        return Collections.EMPTY_SET;
    }

    /**
     * 	来是加载 META-INF/spring.factories下 所有 类型EnableAutoConfiguration 的对象
     */
    @Override
    protected List<String> getCandidateConfigurations(AnnotationMetadata metadata, AnnotationAttributes attributes) {
        return asList(attributes, "value");
    }
}