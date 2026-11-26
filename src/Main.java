
void main() {
    Scanner clavier=new Scanner(System.in);
    System.out.print("Quel est ton prénom?");
    String pseudo = clavier.next();
     int memoire=100;
    System.out.print("Souviens-tu de ton chien?");
    String chien= clavier.next();
    while((!chien.equals("oui"))&&(!chien.equals("non"))){
        memoire-=10;
        System.out.printf("Tu perds la mémoire %s..%d %% %n",pseudo,memoire);
        System.out.print("Souviens-tu de ton chien?");
        chien= clavier.next();}
    if (chien.equals("non")) {
        memoire -= 10;
        System.out.printf("Tu perds la mémoire %s..%d %%", pseudo, memoire);
    }else if (chien.equals("oui")){
        System.out.printf("%s a %d %% de mémoire %n", pseudo, memoire);
    }
    }



