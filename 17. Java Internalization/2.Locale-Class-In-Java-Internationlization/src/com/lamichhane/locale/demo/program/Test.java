package com.lamichhane.locale.demo.program;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		Locale l2 = Locale.getDefault();
		System.out.println(l2.getLanguage()+"..."+l2.getDisplayLanguage());
		System.out.println(l2.getCountry()+"..."+l2.getDisplayCountry());
		
		System.out.println();
		
		Locale l3 = new Locale("pa","IN");
		System.out.println(l3.getLanguage()+"..."+l3.getDisplayLanguage());
		System.out.println(l3.getCountry()+"..."+l3.getDisplayCountry());
		
		System.out.println();
		
		
		String[] iso_languages = l2.getISOLanguages();
		for(String s: iso_languages) {
			System.out.println(s);
		}
		
		System.out.println();
		
		String[] iso_country = l2.getISOCountries();
		for(String s: iso_country) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Locale[] ll = l2.getAvailableLocales();
		for(Locale s : ll) {
			System.out.println(s.getDisplayCountry()+"..."+s.getDisplayLanguage());
		}

	}

}
