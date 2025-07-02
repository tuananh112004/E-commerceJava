/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ta.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author admin
 */
public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ 
            ThymeleafConfigs.class,
            HibernateConfigs.class
        };
    }

  @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
            WebAppContextConfigs.class  // class cấu hình Spring MVC của bạn
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
}
