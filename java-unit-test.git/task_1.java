@Test
public void checkIsAdultWgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertTrue("User should be considered an adult if they are 18 or older", isAdult);
}
