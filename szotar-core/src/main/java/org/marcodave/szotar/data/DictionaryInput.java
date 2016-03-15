package org.marcodave.szotar.data;

public class DictionaryInput {
	
	public final String inputWord;
	
	public final Language sourceLanguage;
	
	public final Language targetLanguage;
	
	private DictionaryInput(String inputWord, Language sourceLanguage, Language targetLanguage) {
		this.inputWord = inputWord;
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
	}
	
	public static DictionaryInput of(String inputWord, Language sourceLanguage, Language targetLanguage) {
		return new DictionaryInput(inputWord, sourceLanguage, targetLanguage);
	}
	
}
