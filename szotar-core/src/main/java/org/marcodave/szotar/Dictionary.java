package org.marcodave.szotar;

import org.marcodave.szotar.data.DictionaryInput;
import org.marcodave.szotar.data.DictionaryResult;

import java.util.Set;

public interface Dictionary {
  
	Set<DictionaryResult> getTranslations(DictionaryInput input);
  
}
