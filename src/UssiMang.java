// Kokkupõrge - sein
if (ussiPea.getTranslateX() < 0 || ussiPea.getTranslateX() >= aknaLaius) { 
	restartGame();
}
// Kokkupõrge - lagi/põrand
if (ussiPea.getTranslateY() < 0 || ussiPea.getTranslateY() >= aknaKorgus) { 
	restartGame();
}
50 Node
// (if) Kui seal on rohkem kui kaks blokki {siis eemaldame "ussilt" (saba) viimase bloki}.
// (else) ja kui mitte, siis saame (get) 0 elemendi "ussilt", mis on siis ussipea. 
// "Node" on listi elemendi tüüp (ese)
