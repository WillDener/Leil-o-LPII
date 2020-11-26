package services;

import java.util.Comparator;

import entities.Leilao;

public class LeilaoComparator implements Comparator {
	
	@Override
    public int compare(Object objLeilao, Object objOutroLeilao) {
		Leilao leilao = (Leilao) objLeilao;
		Leilao outroLeilao = (Leilao) objOutroLeilao;
		
        return leilao.getDataFormatada().compareTo(outroLeilao.getDataFormatada());
    }
	
}
