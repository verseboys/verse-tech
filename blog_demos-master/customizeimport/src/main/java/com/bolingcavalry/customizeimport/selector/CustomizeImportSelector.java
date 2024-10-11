package com.bolingcavalry.customizeimport.selector;

import com.bolingcavalry.customizeimport.util.Utils;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description: 自定义selector1
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2018/9/7 6:40
 */
public class CustomizeImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Utils.printTrack("selectImports : " + this.getClass().getSimpleName());
        return new String[]{"com.bolingcavalry.customizeimport.service.impl.CustomizeServiceImpl2"};
    }
}
