package com.zhouzz.config;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.kotlin.KotlinFile;
import org.mybatis.generator.api.dom.kotlin.KotlinType;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-11 17:38
 * @desc
 */
public class CustomCommentGenerator extends DefaultCommentGenerator {


    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if(introspectedColumn.getRemarks()!= null && !introspectedColumn.getRemarks().equals("")){
            field.addJavaDocLine("/**");
            field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
            field.addJavaDocLine(" */");
        }
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        //
    }

    public void addModelClassComment(KotlinType modelClass, IntrospectedTable introspectedTable) {
        //
    }


    @Override
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        //
    }
    @Override
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        //
        }

    @Override
    public void addFileComment(KotlinFile kotlinFile) {
        //
    }

    @Override
    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        //
    }

    @Override
    public void addRootComment(XmlElement rootElement) {
        //
    }

    //xml注释去掉
    @Override
    public void addComment(XmlElement xmlElement) {
        //
    }
}
