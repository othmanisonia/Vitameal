package com.ipstcnam.vitameal.beans.enums;

public enum ActionPlatEnum {
	consulter, creer, editer, supprimer;
	
	public static boolean contains(String value) {
		for (ActionPlatEnum enumValue : ActionPlatEnum.values()) {
			if (enumValue.name().equals(value)) {
				return true;
			}
		}
		return false;
	}
}
