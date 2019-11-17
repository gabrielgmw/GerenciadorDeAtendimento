package fatec.petManager.Model;

public interface Queue {
	public int size();

	public boolean isEmpty();

	public void enqueue(Pet pet);

	public Pet dequeue();

	public Pet peek();
}
