package view;

import br.com.kauanPaulino.ArvoreInt.Arvore;

public class main {

	public static void main(String[] args) throws Exception {
		char vt[]= {'k','d','m','b','c','f','l','t','p','r','z'};
		Arvore arv = new Arvore();
		for(char i:vt) {
			arv.insert(i);
		}
		System.out.println("Remove M");
		arv.remove('m');
		System.out.println("\n=============================================\nPre-ordem");
		arv.prefixSearch();
		System.out.println("\n=============================================\nordem");
		arv.infixSearch();
		System.out.println("\n=============================================\nPos-ordem");
		arv.postfixSearch();
		System.out.println("\n=============================================");
		arv.search('r');
	}

}
