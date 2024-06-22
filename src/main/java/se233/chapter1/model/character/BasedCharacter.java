package se233.chapter1.model.character;

import se233.chapter1.model.DamageType;
import se233.chapter1.model.item.Armor;
import se233.chapter1.model.item.Weapon;

public class BasedCharacter {
    protected String name, imgpath;
    protected DamageType type;
    protected Integer fullHp, basedPow, basedRes, basedDef;
    protected Integer hp, power, resistance, defense;
    protected Weapon weapon;
    protected Armor armor;
    public String getName() {return name;}
    public String getImgpath() {return imgpath;}
    public Integer getHp() {return hp;}
    public Integer getFullHp() {return fullHp;}
    public Integer getPower() {return power;}
    public Integer getResistance() {return resistance;}
    public Integer getDefense() {return defense;}
    @Override
    public String toString() {return name;}
    public DamageType getType(){return type;}
}