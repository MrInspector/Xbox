package net.minecraft.src;
import java.util.Random;

public class mod_Xbox extends BaseMod
{  
  
  //Declare xblock
  public static Block m_xblock = new xblock(666)
    .setHardness(0F).setResistance(2F)
    .setLightValue(1.0F).setUnlocalizedName("m_xblock")
    .setCreativeTab(CreativeTabs.tabBlock);  
  
  //Declare Remote Pickaxe                                          
  public static final Item m_Remote_pickaxe = new ItemPickaxeRemote(667, EnumToolRemote.REMOTE)
        .setUnlocalizedName("m_Remote_pickaxe");
  
  //Declare Remote Shovel                                          
  public static final Item m_Remote_shovel = new ItemShovelRemote(668, EnumToolRemote.REMOTE)
        .setUnlocalizedName("m_Remote_shovel");
  
  //Declare Remote Axe                                          
  public static final Item m_Remote_axe = new ItemAxeRemote(669, EnumToolRemote.REMOTE)
        .setUnlocalizedName("m_Remote_axe");
  
  //Declare Remote Hoe                                          
  public static final Item m_Remote_hoe = new ItemHoeRemote(670, EnumToolRemote.REMOTE)
        .setUnlocalizedName("m_Remote_hoe");
  
  //Declare Remote Sword                                          
  public static final Item m_Remote_sword = new ItemSwordRemote(671, EnumToolRemote.REMOTE)
        .setUnlocalizedName("m_Remote_sword");
  
  public String getVersion()
  {
    return "Xbox 1.0.0";
  }  
  public void load() {  }
    
  public mod_Xbox()
  {     
    ModLoader.registerBlock(m_xblock); //xblock 

    //Add Tooltips
      //Blocks       
    ModLoader.addName(m_xblock, "Xbox 360"); //xblock 
     //Items
     //Armor Sets
     //ToolSets
    ModLoader.addName(m_Remote_pickaxe, "Remote Pickaxe"); //Remote Pickaxe
    ModLoader.addName(m_Remote_shovel, "Remote Shovel"); //Remote Shovel
    ModLoader.addName(m_Remote_axe, "Remote Axe"); //Remote Axe
    ModLoader.addName(m_Remote_hoe, "Remote Hoe"); //Remote Hoe
    ModLoader.addName(m_Remote_sword, "Remote Sword"); //Remote Sword    
  

    //Textures
     //Blocks
     //Items
     //ToolSets

    //Recipes
     //xblock Recipe    
     ModLoader.addRecipe(new ItemStack(m_xblock, 1), new Object []{"1  " , "11 " , "1  " ,
       Character.valueOf('1'), Block.
       , Character.valueOf('1'), Block.   , Character.valueOf('1'), Block.   , Character.valueOf('1'), Block.});
    //Remote Pickaxe Recipe    
    ModLoader.addRecipe(new ItemStack(m_Remote_pickaxe, 1), new Object []{ "yyy" , " z " , " z " ,
      Character.valueOf('y'), Item.Item
      , Character.valueOf('z'), Item.stick });
    //Remote Shovel Recipe    
    ModLoader.addRecipe(new ItemStack(m_Remote_shovel, 1), new Object []{ " y " , " z " , " z " ,
      Character.valueOf('y'), Item.Item
      , Character.valueOf('z'), Item.stick });
    //Remote Axe Recipe    
    ModLoader.addRecipe(new ItemStack(m_Remote_axe, 1), new Object []{ "yy " , "yz " , " z " ,
      Character.valueOf('y'), Item.Item
      , Character.valueOf('z'), Item.stick });
    //Remote Hoe Recipe    
    ModLoader.addRecipe(new ItemStack(m_Remote_hoe, 1), new Object []{ "yy " , " z " , " z " ,
      Character.valueOf('y'), Item.Item
      , Character.valueOf('z'), Item.stick });
    //Remote Sword Recipe    
    ModLoader.addRecipe(new ItemStack(m_Remote_sword, 1), new Object []{ " y " , " y " , " z " ,
      Character.valueOf('y'), Item.Item
      , Character.valueOf('z'), Item.stick });

    //Furnace Recipes
  }

  public void GenerateSurface(World worldMod, Random rand, int i, int j)
  {
    for(int xsguivy = 0; xsguivy < 128; xsguivy++)
    {
      int j6 = i + rand.nextInt(16);
      int k9 = rand.nextInt(128);
      int j12 = j + rand.nextInt(16);
      new WorldGenMinable(m_xblock.blockID, 2).generate(worldMod, rand, j6, k9, j12);
    }
  }
}
