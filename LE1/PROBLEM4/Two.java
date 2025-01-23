class Two extends One {
    Two(int x) {
        super(x);  // Explicitly calling the constructor of class One with argument x
        System.out.println("Two's constructor called with value: " + x);
    }
}
