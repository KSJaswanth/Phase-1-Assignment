package com.ecommerce.beans;

import org.springframework.context.ApplicationEvent;

public class CustomEventHandler extends ApplicationEvent{
   
        public CustomEventHandler(Object source) {
      super(source);
   }
   public String toString(){
      return "This is a custom event";
   }
