package me.NoChance.PvPManager.Config;

public enum Locale {
	EN("messages.properties"), RU("messages_ru.properties"), CH("messages_ch.properties"), ES("messages_es.properties"), DE("messages_de.properties");

	private final String fileName;

	Locale(final String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return fileName;
	}
}
