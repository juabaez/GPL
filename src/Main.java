import FM.FeatureModel;

public  class Main {
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

	/*@  @*/
	public static void main(String[] args) {
		FeatureModel f = new FeatureModel();
		f.setWorld(true);
	      try {
			new Main().print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }


}
