package FM;

import java.util.Random;

/**
 * Variability encoding of the feature model for KeY.
 * Auto-generated class.
 */
public class FeatureModel {

	private static boolean beautiful;
	private static boolean hello;
	private static boolean wonderful;
	private static boolean guys;
	private static boolean world;
	private static boolean feature;
	private static boolean helloworld;
	
	public  boolean isBeautiful() {
		return beautiful;
	}
	public  void setBeautiful(boolean beautiful) {
		FeatureModel.beautiful = beautiful;
	}
	public  boolean isHello() {
		return hello;
	}
	public  void setHello(boolean hello) {
		FeatureModel.hello = hello;
	}
	public  boolean isWonderful() {
		return wonderful;
	}
	public  void setWonderful(boolean wonderful) {
		FeatureModel.wonderful = wonderful;
	}
	public  boolean isGuys() {
		return guys;
	}
	public  void setGuys(boolean guys) {
		FeatureModel.guys = guys;
	}
	public  boolean isWorld() {
		return world;
	}
	public void setWorld(boolean world) {
		FeatureModel.world = world;
	}
	public  boolean isFeature() {
		return feature;
	}
	public  void setFeature(boolean feature) {
		FeatureModel.feature = feature;
	}
	public  boolean isHelloworld() {
		return helloworld;
	}
	public  void setHelloworld(boolean helloworld) {
		FeatureModel.helloworld = helloworld;
	}

	public FeatureModel(){
		Random r = new Random();
		FeatureModel.beautiful = r.nextBoolean();
		FeatureModel.hello = r.nextBoolean();
		FeatureModel.wonderful = r.nextBoolean();
		FeatureModel.guys = r.nextBoolean();
		FeatureModel.world = r.nextBoolean();
		FeatureModel.feature = r.nextBoolean();
		FeatureModel.helloworld = r.nextBoolean();
	}
	
	/*@  @*/
	 private void  print__wrappee__Hello  (){
	      System.out.print("Hello");
	   }

	/*@ 
	  @ requires FM.FeatureModel.helloworld && (FM.FeatureModel.hello || !guys) && (FM.FeatureModel.feature || !beautiful) && (FM.FeatureModel.feature || !wonderful) && (FM.FeatureModel.beautiful || FM.FeatureModel.wonderful || !feature) && (!beautiful || !wonderful) && (FM.FeatureModel.helloworld || !hello) && (FM.FeatureModel.helloworld || !feature) && (FM.FeatureModel.helloworld || !world) && (FM.FeatureModel.hello || !helloworld) && (FM.FeatureModel.world || !helloworld) && true && !false;
	  @ requires FM.FeatureModel.hello || FM.FeatureModel.guys;
	  @*/
	 private void  print__wrappee__Guys  () throws Exception {
		if (!FM.FeatureModel.guys) {
			print__wrappee__Hello();
			return;
			//throw new Exception("guys is false ");
		}
     print__wrappee__Hello();
     System.out.print(" Guys!");
  }

	/*@ 
	  @ requires FM.FeatureModel.helloworld && (FM.FeatureModel.hello || !guys) && (FM.FeatureModel.feature || !beautiful) && (FM.FeatureModel.feature || !wonderful) && (FM.FeatureModel.beautiful || FM.FeatureModel.wonderful || !feature) && (!beautiful || !wonderful) && (FM.FeatureModel.helloworld || !hello) && (FM.FeatureModel.helloworld || !feature) && (FM.FeatureModel.helloworld || !world) && (FM.FeatureModel.hello || !helloworld) && (FM.FeatureModel.world || !helloworld) && true && !false;
	  @ requires FM.FeatureModel.hello || FM.FeatureModel.guys || FM.FeatureModel.beautiful;
	  @*/
	 private void  print__wrappee__Beautiful  () throws Exception {
		if (!FM.FeatureModel.beautiful) {
			print__wrappee__Guys();
			return;
			//throw new Exception("beautiful is false ");
		}
     print__wrappee__Guys();
     System.out.print(" Beautiful!");
  }

	/*@ 
	  @ requires FM.FeatureModel.helloworld && (FM.FeatureModel.hello || !guys) && (FM.FeatureModel.feature || !beautiful) && (FM.FeatureModel.feature || !wonderful) && (FM.FeatureModel.beautiful || FM.FeatureModel.wonderful || !feature) && (!beautiful || !wonderful) && (FM.FeatureModel.helloworld || !hello) && (FM.FeatureModel.helloworld || !feature) && (FM.FeatureModel.helloworld || !world) && (FM.FeatureModel.hello || !helloworld) && (FM.FeatureModel.world || !helloworld) && true && !false;
	  @ requires FM.FeatureModel.hello || FM.FeatureModel.guys || FM.FeatureModel.beautiful || FM.FeatureModel.wonderful;
	  @*/
	 private void  print__wrappee__Wonderful  () throws Exception {
		if (!FM.FeatureModel.wonderful) {
			print__wrappee__Beautiful();
			return;
			//throw new Exception("Wonderful is false ");
		}
     print__wrappee__Beautiful();
     System.out.print(" Wonderful!");
  }

	/*@  @*/
	public void print() throws Exception {
		print__wrappee__Wonderful();
		System.out.print(" world!");
  }

}