# Builder Pattern
- This is a better way to handle how arguments get passed
- And how the Object is built.
- **Eg:**
```java
class Tea {
    private boolean teaPowder;
    private boolean milk;
    private int sugar;

    public Tea addTeaPowder(boolean yes) {
        this.teaPowder = yes;        
        return this;
    }
    public Tea addMilk(boolean yes) {
        this.milk = yes;        
        return this;

    }
    public Tea addSugar(int cubes) {
        this.sugar += sugar;        
        return this;
    }

    public Tea build() {
        return new Tea(this);
    }
}
```