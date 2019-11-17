package fatec.petManager.Controller;

import java.util.NoSuchElementException;
import java.util.Queue;

import fatec.petManager.Model.NodeQueue;
import fatec.petManager.Model.Pet;

public class SequentialQueue implements Queue {

	private NodeQueue<Pet> first;
	private NodeQueue<Pet> last;
	private int size;

	public SequentialQueue() {
		first = null;
		last = null;
		size = 0;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	// @Override
	public void enqueue(Pet pet) {
		NodeQueue<Pet> oldLast = last;
		last = new NodeQueue<Pet>(pet);
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.setProxNode(last);
		}
		size++;
	}

	//@Override
	public Pet dequeue() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue underflow");
		}
		Pet pet = first.getElement();
		first = first.getProxNode();
		size--;

		if (isEmpty()) {
			last = null;
		}
		return pet;
	}

	// @Override
	public Pet peek() {
		return first.getElement();
	}

	public String listarFila() {
		String result = "";
		NodeQueue<Pet> nodeQueue = first;

		for (int i = 0; i < size; i++) {
			Pet pet = nodeQueue.getElement();
			if (i < 1) {
				result += pet;
			} else {
				result += " + " + pet;
			}

			nodeQueue = nodeQueue.getProxNode();
		}
		return result;
	}
}
