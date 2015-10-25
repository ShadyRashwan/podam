@Test public void testPdm42Scenario() throws Exception {
  PodamFactory factory=new PodamFactoryImpl();
  A pojo=factory.manufacturePojo(A.class);
  Assert.assertNotNull("The class A cannot be null!",pojo);
  B b=pojo.getB();
  Assert.assertNotNull("The B object cannot be null!",b);
  Assert.assertNotNull("The Map object within B cannot be null!",b.getCustomValue());
}
