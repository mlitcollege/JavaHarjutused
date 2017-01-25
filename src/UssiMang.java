// Kokkupõrge - sein
if (ussiPea.getTranslateX() < 0 || ussiPea.getTranslateX() >= aknaLaius) { 
	manguRestart();
}
// Kokkupõrge - lagi/põrand
if (ussiPea.getTranslateY() < 0 || ussiPea.getTranslateY() >= aknaKorgus) { 
	manguRestart();
}
