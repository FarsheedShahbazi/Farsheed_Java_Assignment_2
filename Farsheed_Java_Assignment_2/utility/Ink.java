package utility;

import warrior.Warrior;
import weapon.Weapon;
import armour.Armour;

public class Ink {

  public Ink() {
    // do nothing
  } // contructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
          __        __             _             ____   ___ ____  _  _
          \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |
           \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_
            \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
             \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|
        """);
  }

  // Warrior Menu
  public void printWarriorMenu() {
    System.out.println("!===============Worrior===============!");
    System.out.println("!             Choose your warrior        !");
    System.out.println("!===============Worrior===============!");
    System.out.println("! 1) Human                                !");
    System.out.println("! 2) Elf                                 !");
    System.out.println("! 3) Orc                                 !");
    System.out.println("!===============Worrior===============!");
    System.out.print("!Enter your choice: !");
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.println("!===============Weapon================!");
    System.out.println("!             Choose your weapon         !");
    System.out.println("!===============Weapon================!");
    System.out.println("! 1) Dragger                               !");
    System.out.println("! 2) Sword                               !");
    System.out.println("! 3) Axe                                !");
    System.out.println("!===============Weapon================!");
    System.out.print("!Enter your choice: !");
  }

  // Armor Menu
  public void printArmourMenu() {
    System.out.println("!===============Armour================!");
    System.out.println("!             Choose your Armour        !");
    System.out.println("!===============Armour================!");
    System.out.println("! 1) Leather                               !");
    System.out.println("! 2) Chainmail                               !");
    System.out.println("! 3) Platemail                               !");
    System.out.println("!===============Armour================!");
    System.out.print("!Enter your choice: !");
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("!===============Attack================!");
    System.out.println("!             Choose your Attack        !");
    System.out.println("!===============Attack================!");
    System.out.println("! 1) Normal                               !");
    System.out.println("! 2) Heavy                                !");
    System.out.println("!===============Atteck================!");
    System.out.print("!Enter your choice: !");
  }

  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior, Weapon pWeapon, Weapon eWeapon, Armour pArmour,
      Armour eArmour) {
    System.out.printf("%-25s (%s)\n", "Player: ", pWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n",
        pWarrior.getHealth());
    System.out.printf("Strength: %-25d\n",
        pWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n",
        pWarrior.getDexterity());
    System.out.printf("%-25s (%s)\n", "Weapon: ", pWeapon.getWeaponType());
    System.out.printf("%-25s (%s)\n", "Armour: ", pArmour.getArmourType());

    System.out.printf("%-25s (%s)\n", "Enemy: ", eWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n",
        eWarrior.getHealth());
    System.out.printf("Strength: %-25d\n",
        eWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n",
        eWarrior.getDexterity());
    System.out.printf("%-25s (%s)\n", "Weapon: ", eWeapon.getWeaponType());
    System.out.printf("%-25s (%s)\n", "Armour: ", eArmour.getArmourType());
  } // printStats()

  // GameOver Message
  public void printGameOver(String winner) {
    System.out.printf("""
              __ __
           .-',,^,,'.
          / \\(0)(0)/ \\
          )/( ,_"_,)\\(
          `  >-`~(   '
        _N\\ |(`\\ |___
        \\' |/ \\ \\/_-,)
         '.(  \\`\\_<
            \\ _\\|
             | |_\\_
             \\_,_>-'
         winner: %s
             """, winner);
  } // printGameOver()

} // class