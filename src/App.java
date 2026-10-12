static void main(){
    Kort kort1 = new Kort("Po");
    Kort kort2 = new Kort("Sixten");
    IO.println(kort1.getKortNr());
    IO.println(kort2.getKortNr());
    try {
        kort1.låna();
        kort1.låna();
        kort1.låna();
        kort1.låna();
    } catch (Exception IllegalArgumentException) {
        IO.println(IllegalArgumentException);
    }
    IO.println(kort1.getLånadeBöcker());
    kort1.lämna();
    IO.println(kort1.getLånadeBöcker());
    kort1.låna();
    kort2.lämna();
    IO.println(kort1.getLånadeBöcker());
    IO.println(kort2.getLånadeBöcker());
    kort1.setÄgare("Pontus");
    try {
        kort1.setÄgare("        ");
    } catch (Exception IllegalArgumentException) {
        IO.println(IllegalArgumentException);
    }
    IO.println(kort1.getÄgare());
}