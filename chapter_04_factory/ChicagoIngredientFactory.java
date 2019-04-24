public class ChicaggoPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }
  
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }
  
  public Veggies[] createVeggies() {
    return new Veggies veggies[] = { new EggPlant(), new Spinach(), new BlackOlives() };
    return veggies;
  }
  
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
  
  public Clams createClam() {
    return new FrozenClams();
  }
}