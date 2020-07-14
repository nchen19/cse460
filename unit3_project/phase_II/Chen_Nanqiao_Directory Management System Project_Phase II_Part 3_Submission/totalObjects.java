package cse460_unit3_project_part2;

public class totalObjects
{

   private static int numObjects = 0;
   
   public totalObjects()
   {
      numObjects=0;
   }
   public void objectAdded()
   {
      numObjects++;
   }
   public int getTotalObjects()
   {
      return numObjects;
   }
}
