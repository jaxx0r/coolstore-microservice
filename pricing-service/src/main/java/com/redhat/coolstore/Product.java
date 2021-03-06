package com.redhat.coolstore;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label("Product")
public class Product implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Description")
   @org.kie.api.definition.type.Position(2)
   private java.lang.String desc;

   @org.kie.api.definition.type.Label("Item ID")
   @org.kie.api.definition.type.Position(0)
   private java.lang.String itemId;

   @org.kie.api.definition.type.Label("Name")
   @org.kie.api.definition.type.Position(1)
   private java.lang.String name;

   @org.kie.api.definition.type.Label("Price")
   @org.kie.api.definition.type.Position(3)
   private double price;

   public Product()
   {
   }

   public java.lang.String getDesc()
   {
      return this.desc;
   }

   public void setDesc(java.lang.String desc)
   {
      this.desc = desc;
   }

   public java.lang.String getItemId()
   {
      return this.itemId;
   }

   public void setItemId(java.lang.String itemId)
   {
      this.itemId = itemId;
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public double getPrice()
   {
      return this.price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public Product(java.lang.String desc, java.lang.String itemId,
         java.lang.String name, double price)
   {
      this.desc = desc;
      this.itemId = itemId;
      this.name = name;
      this.price = price;
   }
}