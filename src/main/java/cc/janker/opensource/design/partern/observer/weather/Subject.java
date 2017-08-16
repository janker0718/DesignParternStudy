package cc.janker.opensource.design.partern.observer.weather;



public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
