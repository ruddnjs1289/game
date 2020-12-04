// Slime.java

package com.java.game;

import javax.swing.JOptionPane;

public class Slime {

	String name;
	int hp = 80;

	// ������
	public Slime(String n) {

		name = n;

	}

	// ����

	public void attack(Human h) {
		attack(h, 10);
	}

	public void attack(Human h, int damage) {

		if (hp > 0) {

			h.hp = h.hp - damage;

			if (h.hp < 1) {
				JOptionPane.showMessageDialog(null, "Game Over");
				System.exit(0);
			}
			
			if(damage < 30) {
				Study01.lbl2.setText(name + "�� ����. " + h.name + "�� ü���� " + h.hp + ".");
			}else {
				Study01.lbl2.setText(name + "�� ���� ����. " + h.name + "�� ü���� " + h.hp + ".");
			}
			
		}

	}

}

class BlueSlime extends Slime {

	// ������
	BlueSlime(String n) {
		super(n);
	}

	// ���� ����
	@Override
	public void attack(Human h) {

		attack(h, 8);

	}

	// ġ��
	void heal(Slime s) {

		if (hp > 0 && s.hp > 0) {

			s.hp += 10;

			if (s.hp > 80) {
				s.hp = 80;
			}

			Study01.lbl2.setText(name + "�� " + s.name + "�� ġ��. ���� ü���� " + s.hp + ".");
		}
	}
}

class RedSlime extends Slime {

	RedSlime(String n) {
		super(n);
	}

	@Override
	public void attack(Human h) {

		attack(h, 15);
	}
	
	public void attack2(Human h) {

		attack(h, 30);
	}
}